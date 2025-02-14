package com.trailsbuddy.trailservices.dto;

public class CommentRequest {
    private String trailId;
    private String text;

    // Getters and setters
    public String getTrailId() {
        return trailId;
    }

    public void setTrailId(String trailId) {
        this.trailId = trailId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}