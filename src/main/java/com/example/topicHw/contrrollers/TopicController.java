package com.example.topicHw.contrrollers;

import com.example.topicHw.model.Topic;
import com.example.topicHw.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicServiceImp;

    @GetMapping("/topic")
    public List<Topic> GetTopic() {
        return topicServiceImp.getAll();
    }
    @GetMapping("/topic/name={name}")
    public List<Topic>  getTopicByName(@PathVariable("name") String name) {
        System.out.println(name);
        return  topicServiceImp.getByName(name);
    }
    @GetMapping("/topic/theme={theme}")
    public List<Topic>  getTopicByTheme(@PathVariable("theme") String theme) {
        System.out.println(theme);
        return  topicServiceImp.getByTheme(theme);
    }
    @GetMapping("/topic/order/")
    public List<Topic> getOrdered(@RequestParam boolean order) {
        System.out.println(order);
        if(order){
            List<Topic> t = new ArrayList<>(topicServiceImp.getAll()) ;
            t.sort(Comparator.comparing(Topic::getDate));
            return t;
        }
        else {
            return  topicServiceImp.getAll();
        }
    }
}
