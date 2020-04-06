package com.example.foldnfly;

public class FoldNFly {
    private String Url;
    private String Title;
    private String Diff;

    public FoldNFly(String Title, String Url,String Diff){
        this.Title=Title;
        this.Url=Url;
        this.Diff=Diff;
    }

    public String getTitle(){
        return Title;
    }

    public String getUrl(){
        return Url;
    }

    public String getDiff(){return Diff;}

}
