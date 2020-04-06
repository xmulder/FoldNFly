package com.example.foldnfly;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<FoldNFly> foldNFlyList;
    private FoldNFlyAdapter foldNFlyAdapter;
    private Handler foldNFly_handler;
    private ListView foldNFly_lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foldNFlyList=new ArrayList<>();
        foldNFly_lv=(ListView)findViewById(R.id.flodnfly);

        getFoldNFly();

        foldNFly_handler=new Handler(){
            @Override
            @SuppressLint("HandlerLeak")
            public void handleMessage(Message msg){
                if(msg.what==1){
                    foldNFlyAdapter=new FoldNFlyAdapter(MainActivity.this,foldNFlyList);
                    foldNFly_lv.setAdapter(foldNFlyAdapter);
                    foldNFly_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            FoldNFly foldNFly=foldNFlyList.get(position);
                            Intent intent=new Intent(MainActivity.this,FoldNFlyActivity.class);
                            intent.putExtra("foldNFly_url",foldNFly.getUrl());
                            startActivity(intent);
                        }
                    });
                }
            }
        };
    }

    private void getFoldNFly(){

        Log.e("Jsoup","Test");

        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    for (int i=1;i<=1;i++){
                        Document document=Jsoup.connect("https://www.foldnfly.com/index.html").get();
                        Elements titleLinks=document.select("div.plane");

                        for (int j=0;j<titleLinks.size();j++){
                            String title=titleLinks.get(j).select("b").text();
                            String url="https://www.foldnfly.com/"+titleLinks.get(j).select("a").attr("href");
                            String diff=titleLinks.get(j).select("a").select("div.tags").select("span.diff").text();
                            FoldNFly foldNFly=new FoldNFly(title,url,diff);
                            foldNFlyList.add(foldNFly);
                        }
                    }
                    Message msg=new Message();
                    msg.what=1;
                    foldNFly_handler.sendMessage(msg);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
