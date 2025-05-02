package com.example.springboot.service;

import com.example.springboot.model.Course;
import com.example.springboot.Resources;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class RecommendationService {

    public List<Course> getAllCourses() {
        return List.of(
                new Course(1L, "AI ML", "Master artificial intelligence and machine learning concepts including neural networks, deep learning, and AI applications",
                        Set.of("machine learning", "deep learning", "neural networks", "tensorflow", "python"),
                        new Resources(
                                "https://www.coursera.org/specializations/ai",
                                List.of(
                                        "https://youtu.be/ZftI2fEz0Fw?si=NcrZNq5caARHMUrm",
                                        "https://youtu.be/UehuI1w10lg?si=bZgY7NX0Cjaw7K94",
                                        "https://youtu.be/bY__YW-xknU?si=8AVgaCI9WeoYqPP3",
                                        "https://youtu.be/GwIo3gDZCVQ?si=qVEb-xmMWpGKAlWY",
                                        "https://youtu.be/ukzFI9rgwfU?si=yVEKp2G9yih08DYV"
                                ),
                                List.of(
                                        "Artificial Intelligence: A Modern Approach",
                                        "Hands-On Machine Learning with Scikit-Learn"
                                )
                        )
                ),

                new Course(2L, "Data Science", "Learn data analysis, visualization, statistical modeling and data-driven decision making",
                        Set.of("data analysis", "python", "r", "statistics", "data visualization"),
                        new Resources(
                                "https://www.coursera.org/specializations/jhu-data-science",
                                List.of(
                                        "https://youtu.be/ua-CiDNNj30?si=S3h1LriHUWGRZXp5",
                                        "https://youtu.be/LZzq1zSL1bs?si=r3xD5zNUDNskmMGY",
                                        "https://youtu.be/gDZ6czwuQ18?si=2KEOpnyfFrduP5Fu",
                                        "https://youtu.be/RBSGKlAvoiM?si=SQeVwP9o-pTbe1Mh",
                                        "https://youtu.be/JL_grPUnXzY?si=54NFP3Zp6fiK7Nsk"
                                ),
                                List.of(
                                        "Data Science from Scratch",
                                        "Python for Data Analysis"
                                )
                        )
                ),

                new Course(3L, "Business Analyst", "Develop business analysis skills including requirements gathering, process modeling, and stakeholder management",
                        Set.of("business analysis", "requirements", "agile", "uml", "swot"),
                        new Resources(
                                "https://www.coursera.org/professional-certificates/google-business-intelligence",
                                List.of(
                                        "https://youtu.be/-psusaPKLg0?si=0NRsglIZdyf_c7RU",
                                        "https://www.youtube.com/live/ABAL1nmORgk?si=yAVQOD_NK1C1HYcZ",
                                        "https://youtu.be/rCFQukS8Org?si=MhBACw74WE36jj9e",
                                        "https://youtu.be/RbWCBz5fBBw?si=rUfzxoNE-DVzBya2",
                                        "https://youtu.be/OY-7OcvlXpg?si=b11w8wNHzNuRGlrJ"
                                ),
                                List.of(
                                        "Business Analysis Body of Knowledge",
                                        "User Stories Applied"
                                )
                        )
                ),

                new Course(4L, "Cyber Security", "Learn network security, ethical hacking, cryptography, and security risk management",
                        Set.of("network security", "ethical hacking", "cryptography", "firewalls", "penetration testing"),
                        new Resources(
                                "https://www.coursera.org/professional-certificates/google-cybersecurity",
                                List.of(
                                        "https://youtu.be/inWWhr5tnEA?si=HsZd0miizMLhPjlb",
                                        "https://www.youtube.com/live/lpa8uy4DyMo?si=dc7_ea6kA4yejPP8",
                                        "https://youtube.com/playlist?list=PLxCzCOWd7aiGnXrHnMcFFPM4lUwQlR7ZT&si=aJCMdOuot3gLwYwv",
                                        "https://youtu.be/Wij5k7beGAY?si=uMREKk7POI_W3-9z",
                                        "https://youtu.be/cKEf8H9cQGM?si=gHlf_Qkqj_dNSm9O"
                                ),
                                List.of(
                                        "The Web Application Hacker's Handbook",
                                        "Cybersecurity for Beginners"
                                )
                        )
                ),

                new Course(5L, "Database Administrator", "Master database management, SQL, backup/recovery, and performance tuning",
                        Set.of("sql", "database", "backup", "recovery", "performance tuning"),
                        new Resources(
                                "https://www.coursera.org/learn/intro-to-databases-backup-recovery",
                                List.of(
                                        "https://youtu.be/QDRqdocBMcY?si=5rfLgsS2yzENC9Fq",
                                        "https://youtu.be/ZRAi3tuJnbI?si=Kvgj9cQZfXHVBf5F",
                                        "https://youtu.be/-peFGxuU1sE?si=hjq7GuB23UxC6adY",
                                        "https://youtu.be/Tn67kCaLElk?si=RKhjXskTxBHT_vyJ",
                                        "https://youtu.be/W8bJHhvQ4u4?si=0rGapqpbdCm5lhP7"
                                ),
                                List.of(
                                        "Database Administrator's Guide",
                                        "SQL in 10 Minutes"
                                )
                        )
                ),

                new Course(6L, "Database Fundamentals", "Learn core database concepts, relational models, and basic SQL queries",
                        Set.of("database", "rdbms", "sql", "normalization", "er model"),
                        new Resources(
                                "https://www.coursera.org/learn/database-management",
                                List.of(
                                        "https://youtu.be/OzZ7nf7ewd4?si=gzVxd82chgUyC4BQ",
                                        "https://www.youtube.com/watch?v=HXV3zeQKqGY",
                                        "https://youtu.be/6Iu45VZGQDk?si=JbWHEtQhd8OI_jxm",
                                        "https://youtu.be/8e-wgQnsFxE?si=r41MEG2r3FeD0aoJ",
                                        "https://youtu.be/hlGoQC332VM?si=dDn-71mu34I2WhqL"
                                ),
                                List.of(
                                        "Database Systems: The Complete Book",
                                        "SQL for Dummies"
                                )
                        )
                ),

                new Course(7L, "Computer Architecture", "Understand computer organization, processor design, memory hierarchy and parallel systems",
                        Set.of("computer organization", "processor", "memory", "pipelining", "cache"),
                        new Resources(
                                "https://www.coursera.org/learn/comparch",
                                List.of(
                                        "https://youtu.be/L9X7XXfHYdU?si=1lf1Hic_9J1lCgEe",
                                        "https://youtube.com/playlist?list=PLBlnK6fEyqRgLLlzdgiTUKULKJPYc0A4q&si=ke5NvdeB5gvHbysO",
                                        "https://youtu.be/bmbrOg0CbzA?si=zZccf8L1G43PGm5s",
                                        "https://youtu.be/kTdvOlA2ko0?si=o75QbeBKUev6EDOq",
                                        "https://youtu.be/1rUevQ3bSEY?si=wn0ET119V_Hc2Jsq"
                                ),
                                List.of(
                                        "Computer Organization and Design",
                                        "Computer Architecture: A Quantitative Approach"
                                )
                        )
                ),

                new Course(8L, "Software Development", "Learn software engineering principles, SDLC, and development methodologies",
                        Set.of("software engineering", "sdlc", "agile", "devops", "version control"),
                        new Resources(
                                "https://www.coursera.org/specializations/software-development-lifecycle",
                                List.of(
                                        "https://www.youtube.com/live/Ubg3PenEdNw?si=mDlAtA01HYL8Ichu",
                                        "https://youtu.be/uJpQlyT_CK4?si=5-TqM3PfPXe3qL4e",
                                        "https://www.youtube.com/watcFgh?v=3fF6Zx1W_https://youtu.be/IHx9ImEMuzQ?si=duGNMti9kAnHN2-c",
                                        "https://www.youtube.com/live/Ubg3PenEdNw?si=Lkq2BFsS-oS92Cku",
                                        "https://youtu.be/4b1D1QFEel0?si=-RYHV55V1meYWJPp"
                                ),
                                List.of(
                                        "Clean Code",
                                        "The Pragmatic Programmer"
                                )
                        )
                ),

                new Course(9L, "Programming Skills", "Develop core programming skills with hands-on coding exercises",
                        Set.of("programming", "algorithms", "data structures", "problem solving", "debugging"),
                        new Resources(
                                "https://www.coursera.org/specializations/data-structures-algorithms",
                                List.of(
                                        "https://youtu.be/yRpLlJmRo2w?si=k5mHgRL56n_l3yTx",
                                        "https://youtu.be/t2_Q2BRzeEE?si=0d4cJxGpBB2ZGD13",
                                        "https://youtu.be/VTLCoHnyACE?si=v_dQ8kgE1qhIn3bN",
                                        "https://youtu.be/7wnove7K-ZQ?si=5b7SSQCoNmjnuDo5",
                                        "https://youtu.be/tVzUXW6siu0?si=DAXMqN8vLvxLE2tW"
                                ),
                                List.of(
                                        "The Algorithm Design Manual",
                                        "Cracking the Coding Interview"
                                )
                        )
                ),

                new Course(10L, "Project Management", "Master project planning, scheduling, risk management and agile methodologies",
                        Set.of("project management", "agile", "scrum", "risk management", "gantt chart"),
                        new Resources(
                                "https://www.coursera.org/professional-certificates/google-project-management",
                                List.of(
                                        "https://youtu.be/uEREF70j-yI?si=jexZVKAZgcqcHfFH",
                                        "https://youtu.be/rck3MnC7OXA?si=OcHhEeztGWfrAX6B",
                                        "https://youtu.be/hsMNZd3ssqM?si=skUqG8qD_FnJ-nGe",
                                        "https://youtu.be/9ltExh9enr0?si=ovrV7qx_gzWV147s",
                                        "https://youtube.com/playlist?list=PLeUIXA68NobWh-CAopnDKlEaMKeUDSvsC&si=x9VjhK6q8i1wxCUP"
                                ),
                                List.of(
                                        "A Guide to the Project Management Body of Knowledge",
                                        "Scrum: The Art of Doing Twice the Work in Half the Time"
                                )
                        )
                ),

                new Course(11L, "Technical Communication Skills", "Develop effective technical writing, presentation and documentation skills",
                        Set.of("technical writing", "documentation", "presentation", "reporting", "visualization"),
                        new Resources(
                                "https://www.coursera.org/learn/technical-writing",
                                List.of(
                                        "https://youtu.be/mloCf86O_ow?si=F5S4ynA2HfLUf_AQ",
                                        "https://www.youtube.com/live/UudSwjqFdNM?si=fWqf7mgBSr0MlNqi",
                                        "https://www.youtube.com/watch?v=vF3N8m7JZ5g",
                                        "https://youtu.be/jW9nLlE77uM?si=5V4dPBw808-CgGtT",
                                        "https://youtu.be/K9sDoqOIl18?si=x4fVsu6FBJimZfUr"
                                ),
                                List.of(
                                        "Technical Communication Today",
                                        "The Insider's Guide to Technical Writing"
                                )
                        )
                ),

                new Course(12L, "Distributed Computer Systems", "Learn distributed systems concepts, cloud computing and parallel processing",
                        Set.of("distributed systems", "cloud computing", "parallel processing", "load balancing", "scalability"),
                        new Resources(
                                "https://www.coursera.org/learn/cloud-computing",
                                List.of(
                                        "https://youtu.be/klUH2wqxzyw?si=j-P4a45BnvQG--ke",
                                        "https://youtu.be/Azyizl9w2xo?si=bPIMCiSV9lZtK3oT",
                                        "https://youtu.be/w8KFPWkK0bI?si=xKFRbEMskpT6XPTF",
                                        "https://youtube.com/playlist?list=PLjVeg5SOLp2mb0aJ0BkYm4oj4XqtOOKSv&si=812KKGk-KGuXWYkJ",
                                        "https://youtu.be/UEAMfLPZZhE?si=GVr2czCAlF3x1KZS"
                                ),
                                List.of(
                                        "Distributed Systems: Concepts and Design",
                                        "Designing Data-Intensive Applications"
                                )
                        )
                ),

                new Course(13L, "Computer Network", "Understand networking fundamentals, protocols, and network security",
                        Set.of("networking", "tcp/ip", "osi model", "routing", "switching"),
                        new Resources(
                                "https://www.coursera.org/learn/computer-networking",
                                List.of(
                                        "https://www.youtube.com/watch?v=qiQR5rTSshw",  // Introduction to Networking
                                        "https://www.youtube.com/watch?v=i7CAH2tKUpc",  // Networking Basics
                                        "https://www.youtube.com/watch?v=w6n1DFq00sA",  // Routing and Switching Explained
                                        "https://www.youtube.com/watch?v=mKYiHkPWjI0",  // TCP/IP Networking Fundamentals
                                        "https://www.youtube.com/watch?v=qiQR5rTSshw"   // OSI Model Overview
                                ),
                                List.of(
                                        "Computer Networking: A Top-Down Approach",
                                        "TCP/IP Illustrated"
                                )
                        )
                ),

                new Course(14L, "Computer Forensic", "Learn digital forensics techniques, evidence collection and cyber investigation",
                        Set.of("forensics", "cybersecurity", "investigation", "digital evidence", "incident response"),
                        new Resources(
                                "https://www.coursera.org/learn/digital-forensics",
                                List.of(
                                        "https://youtu.be/JfvHzsexnmc?si=K9V9zNQhWhQ0oF9U",
                                        "https://youtu.be/giv0DQDSsjQ?si=GcFhK6UUps-w2sf8",
                                        "https://youtu.be/8zxrd6O9QC0?si=PzycJx6QRPKLR2tC",
                                        "https://youtu.be/jrDwZy8I-pg?si=_3VHfZyHZhxjt3Pl",
                                        "https://youtu.be/T6bN9R-dI_o?si=3GDuDQ0q1l_r10i2"
                                ),
                                List.of(
                                        "Digital Forensics with Kali Linux",
                                        "The Art of Memory Forensics"
                                )
                        )
                )
        );
    }

    public List<Map<String, String>> getCoursesForRating() {
        return getAllCourses().stream()
                .map(course -> {
                    Map<String, String> courseMap = new HashMap<>();
                    courseMap.put("id", course.getId().toString());
                    courseMap.put("name", course.getName());
                    courseMap.put("description", course.getDescription());
                    return courseMap;
                })
                .collect(Collectors.toList());
    }

    public List<Course> getRecommendations(List<String> selectedSkills) {
        return getAllCourses().stream()
                .filter(course -> {
                    String courseKey = course.getName().toLowerCase().replace(" ", "_");
                    return selectedSkills.contains(courseKey);
                })
                .collect(Collectors.toList());
    }
}
