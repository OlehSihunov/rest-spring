package com.example.topicHw.service;

import  com.example.topicHw.model.Topic;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TopicServiceImp  implements TopicService{
    ArrayList<Topic> topics;
    public TopicServiceImp(){
        topics = new ArrayList<>();
        topics.add(new Topic(1L,"Topic1", "Theme for topic 1",new Date(15)));
        topics.add(new Topic(2L,"Topic2", "Theme for topic 1",new Date(43443243)));
        topics.add(new Topic(3L,"Topic3", "Theme for topic 3",new Date(1567)));
        topics.add(new Topic(4L,"Topic4", "Theme for topic 4",new Date(544444344)));
    }

    @Override
    public ArrayList<Topic> getAll() {
        return  topics;
    }



    @Override
    public List<Topic> getByName(String name) {
        System.out.println(name);
        return topics.stream().filter(e -> e.getName().equals(name)).collect(Collectors.toList());
    }
    @Override
    public List<Topic> getByTheme(String theme) {
        System.out.println(theme);
        return topics.stream().filter(e -> e.getTheme().equals(theme)).collect(Collectors.toList());
    }
}
