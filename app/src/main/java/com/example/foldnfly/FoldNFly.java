package com.example.foldnfly;

public class FoldNFly {
    private String Url;
    private String Title;
    private String Diff;
    private String ImageUrl;

    public FoldNFly(String Title, String Url, String Diff,String ImageUrl){
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

    public String getImageUrl(){return ImageUrl;}

}
