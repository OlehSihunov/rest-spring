package com.example.topicHw.service;

import com.example.topicHw.model.Topic;
import java.util.List;

public interface TopicService {
    List<Topic> getAll();
    List <Topic> getByName(String name);
    List<Topic> getByTheme(String theme);

}
