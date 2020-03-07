package com.example.foldnfly;

public class FoldNFly {
    private static String Url;
    private String Title;

    public FoldNFly(String Title, String Url){
        this.Title=Title;
        this.Url=Url;
    }

    public String getTitle(){
        return Title;
    }

    public static String getUrl(){
        return Url;
    }

}
