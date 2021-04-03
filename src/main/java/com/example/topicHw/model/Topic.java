package com.example.topicHw.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

public class Topic {
    private  Long id;
    private String name;
    private String theme;
    private Date date;
    public  Topic(Long id,String name, String theme, Date date){
        this.id = id;
        this.name = name;
        this.theme = theme;
        this.date = date;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", theme='" + theme + '\'' +
                ", date=" + date +
                '}';
    }

    public long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getTheme() {
        return theme;
    }

    public String getName() {
        return name;
    }
}
