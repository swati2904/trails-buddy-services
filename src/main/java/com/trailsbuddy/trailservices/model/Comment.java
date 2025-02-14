package com.trailsbuddy.trailservices.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "comments")
public class Comment {
    @Id
    private String id;
    private String trailId;
    private String userId;
    private String text;
    private LocalDateTime createdAt;

    // No-argument constructor
    public Comment() {
    }

    // // Add a constructor
    // public Comment(String id, String trailId, String userId, String text,
    // LocalDateTime createdAt) {
    // this.id = id;
    // this.trailId = trailId;
    // this.userId = userId;
    // this.text = text;
    // this.createdAt = createdAt;
    // }

    // Add getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrailId() {
        return trailId;
    }

    public void setTrailId(String trailId) {
        this.trailId = trailId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}