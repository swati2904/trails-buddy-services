package com.trailsbuddy.trailservices.dto;

import java.util.ArrayList;
import java.util.Date;

public class CommentRequest {
    private String trailId;
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

    // Getters and setters
    public String getTrailId() {
        return trailId;
    }

    public void setTrailId(String trailId) {
        this.trailId = trailId;
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
}