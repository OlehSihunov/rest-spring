package com.example.topicHw.repository;

import com.example.topicHw.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Long> {
    @Query("from Topic t where t.theme=:theme")
    List<Topic> findByTheme(@Param("theme") String theme);

    @Query("from Topic t where t.name=:name")
    Topic findByName(@Param("name") String name);
}
