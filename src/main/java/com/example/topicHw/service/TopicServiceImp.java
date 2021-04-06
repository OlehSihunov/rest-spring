package com.example.topicHw.service;

import  com.example.topicHw.model.Topic;
import com.example.topicHw.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TopicServiceImp  implements TopicService{

    @Autowired
    TopicRepository topicRepository;
    @Override
    public List<Topic> getAll() {
        return topicRepository.findAll();
    }


    @Override
    public Topic getById(Long id) {
        return topicRepository.findById(id).get();
    }
    @Override
    public List<Topic> getByTheme(String theme) {
        return topicRepository.findByTheme(theme);
    }

    @Override
    public Topic getByName(String name) {
        return topicRepository.findByName(name);
    }

}
