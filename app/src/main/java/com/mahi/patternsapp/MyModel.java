package com.mahi.patternsapp;


//acts as our Database or Network (Cloud Storage)
//This is our model

public class MyModel
{
    String appName;
    int appDownloads;
    int appRating;


    //constructor
    public MyModel(String appName, int appDownloads, int appRating)
    {
        this.appName = appName;
        this.appDownloads = appDownloads;
        this.appRating  = appRating;
    }


    public String getAppName()
    {
        return appName;
    }

    public void setAppName(String appName)
    {
        this.appName = appName;
    }

    public int getAppDownloads() {
        return appDownloads;
    }

    public void setAppDownloads(int appDownloads) {
        this.appDownloads = appDownloads;
    }

    public int getAppRating() {
        return appRating;
    }

    public void setAppRating(int appRating) {
        this.appRating = appRating;
    }
}
