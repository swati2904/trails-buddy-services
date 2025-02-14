package com.trailsbuddy.trailservices.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

@Document(collection = "comments")
public class Comment {
    @Id
    private String id;
    private String trailId;
    private String userId;
    private String comment;
    private Integer ratings;
    private ArrayList<Integer> liked;
    private Integer level;
    private ArrayList<Integer> access;
    private ArrayList<Integer> parkingCost;
    private Integer parkingLotSize;
    private ArrayList<Integer> conditions;
    private Integer activityType;
    private Date activityDate;
    private LocalDateTime createdAt;

    // No-argument constructor
    public Comment() {
    }

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getRatings() {
        return ratings;
    }

    public void setRatings(Integer ratings) {
        this.ratings = ratings;
    }

    public ArrayList<Integer> getLiked() {
        return liked;
    }

    public void setLiked(ArrayList<Integer> liked) {
        this.liked = liked;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public ArrayList<Integer> getAccess() {
        return access;
    }

    public void setAccess(ArrayList<Integer> access) {
        this.access = access;
    }

    public ArrayList<Integer> getParkingCost() {
        return parkingCost;
    }

    public void setParkingCost(ArrayList<Integer> parkingCost) {
        this.parkingCost = parkingCost;
    }

    public Integer getParkingLotSize() {
        return parkingLotSize;
    }

    public void setParkingLotSize(Integer parkingLotSize) {
        this.parkingLotSize = parkingLotSize;
    }

    public ArrayList<Integer> getConditions() {
        return conditions;
    }

    public void setConditions(ArrayList<Integer> conditions) {
        this.conditions = conditions;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}