package com.example.topicHw.service;

import com.example.topicHw.model.Topic;
import java.util.List;
import java.util.Optional;

public interface TopicService {
    List<Topic> getAll();
    Topic getById(Long id);
    List<Topic> getByTheme(String theme);
    Topic getByName(String name);
}
