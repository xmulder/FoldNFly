package com.example.foldnfly;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class FoldNFlyAdapter extends BaseAdapter {

    private List<FoldNFly> foldNFlyList;
    private View view;
    private Context mContext;
    private ViewHolder viewHolder;
    private Object TextView;

    public FoldNFlyAdapter(Context mContext, List<FoldNFly> foldNFlyList){
        this.mContext=mContext;
        this.foldNFlyList=foldNFlyList;
    }

    public int getCount(){
        return foldNFlyList.size();
    }

    public Object getItem(int position){
        return foldNFlyList.get(position);
    }

    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            view= LayoutInflater.from(mContext).inflate(R.layout.foldnfly_item,null);
            viewHolder=new ViewHolder();
            viewHolder.foldNFlyTitle=(TextView)view.findViewById(R.id.flodnfly_item);
            view.setTag(viewHolder);
        }
        else{
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();
        }
        viewHolder.foldNFlyTitle.setText(foldNFlyList.get(position).getTitle());
        return view;
    }


    class ViewHolder{
        TextView foldNFlyTitle;
    }

}
