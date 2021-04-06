package com.example.topicHw.model;



import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.lang.model.element.Name;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "topics")
@Component
@Scope("prototype")
public class Topic {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "theme")
    private String theme;
    @Column(name = "date_created")
    private Date date;

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", theme='" + theme + '\'' +
                ", date=" + date +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
