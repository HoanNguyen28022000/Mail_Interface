package com.example.gmailfake;

import java.util.Date;

public class DataModel {
    String sender;
    String title;
    String content;
    String time_recieve;

    public DataModel(String sender, String title, String content, String time_recieve ) {
        this.sender=sender;
        this.content=content;
        this.time_recieve=time_recieve;
        this.title=title;
    }
    public String getSender(){
        return sender;
    }
    public String getTitle(){
        return title;
    }
    public String getContent(){
        return content;
    }
    public String getTime_recieve(){
        return time_recieve;
    }

}
