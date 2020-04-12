package com.example.foldnfly;

import android.graphics.drawable.Drawable;

public class FoldNFly {
    private String Url;
    private String Title;
    private String Diff;
    private Drawable ImageUrl;

    public FoldNFly(String Title, String Url, String Diff, Drawable ImageUrl){
        this.Title=Title;
        this.Url=Url;
        this.Diff=Diff;
        this.ImageUrl=ImageUrl;
    }

    public String getTitle(){
        return Title;
    }

    public String getUrl(){
        return Url;
    }

    public String getDiff(){return Diff;}

    public Drawable getImageUrl(){return ImageUrl;}

}
