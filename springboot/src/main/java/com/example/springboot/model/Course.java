package com.example.springboot.model;
import com.example.springboot.Resources;

import java.util.List;
import java.util.Objects;
import java.util.Set; // Changed from List to Set for topics

public class Course {
    private Long id;
    private String name;
    private String description;
    private Set<String> topics; // Using Set to avoid duplicates
    private Resources resources;

    public Course(Long id, String name, String description, Set<String> topics, Resources resources) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topics = topics;
        this.resources = resources;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Set<String> getTopics() {
        return topics;
    }

    public Resources getResources() {
        return resources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(id, course.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}