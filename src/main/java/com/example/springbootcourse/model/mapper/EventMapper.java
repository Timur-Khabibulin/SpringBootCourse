package com.example.springbootcourse.model.mapper;

import com.example.springbootcourse.model.entity.Event;

public class EventMapper {

    public static String toDto(Event event) {
        return event.getName();
    }


    public static Event toEntity(String event) {
        var entity = new Event();
        entity.setName(event);
        return entity;
    }
}
