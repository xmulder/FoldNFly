package com.example.foldnfly;

public class FoldNFly {
    private String Url;
    private String Title;

    public FoldNFly(String Title, String Url){
        this.Title=Title;
        this.Url=Url;
    }

    public String getTitle(){
        return Title;
    }

    public String getUrl(){
        return Url;
    }
}
