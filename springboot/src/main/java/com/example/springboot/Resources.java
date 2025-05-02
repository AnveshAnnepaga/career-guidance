package com.example.springboot;

import java.util.List;

public class Resources {
    private String courseLink;
    private List<String> youtubeLinks;
    private List<String> materials;

    public Resources(String courseLink, List<String> youtubeLinks, List<String> materials) {
        this.courseLink = courseLink;
        this.youtubeLinks = youtubeLinks;
        this.materials = materials;
    }

    public String getCourseLink() {
        return courseLink;
    }

    public List<String> getYoutubeLinks() {
        return youtubeLinks;
    }

    public List<String> getMaterials() {
        return materials;
    }
}
