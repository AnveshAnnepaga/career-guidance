package com.example.springboot.model;

import java.util.Map;

public class UserRatings {
    private Map<String, String> ratings;  // Map skill to rating (e.g., "Java" -> "Excellent")

    public Map<String, String> getRatings() {
        return ratings;
    }

    public void setRatings(Map<String, String> ratings) {
        this.ratings = ratings;
    }

    // Get rating for a particular skill
    public String getRating(String skill) {
        return ratings.getOrDefault(skill, "Not Interested");
    }
}
