package com.example.springboot.controller;

import com.example.springboot.service.RecommendationService;
import com.example.springboot.model.Course;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // Allow CORS for the frontend
public class CourseController {

    private final RecommendationService recommendationService;

    public CourseController(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    // Get all courses
    @GetMapping("/api/courses")
    public List<Course> getAllCourses() {
        return recommendationService.getAllCourses();
    }

    // Get recommended courses based on selected skills
    @PostMapping("/recommendations")
    public List<Course> recommendCourses(@RequestBody Map<String, Object> payload) {
        System.out.println("Received payload: " + payload);

        Object skillsObj = payload.get("selectedSkills");
        List<String> selectedSkills = new ArrayList<>();

        if (skillsObj instanceof List<?>) {
            for (Object skill : (List<?>) skillsObj) {
                if (skill instanceof String) {
                    selectedSkills.add((String) skill);
                }
            }
        }

        if (!selectedSkills.isEmpty()) {
            System.out.println("Received selected skills: " + selectedSkills);
            return recommendationService.getRecommendations(selectedSkills);
        } else {
            System.out.println("No selected skills received.");
            return new ArrayList<>();
        }
    }

}
