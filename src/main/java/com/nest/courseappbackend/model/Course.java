package com.nest.courseappbackend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "coursedb")
public class Course {
    @Id
    @GeneratedValue
    private String courseTitle;
    private String courseDuration;
    private String courseDescription;
    private String courseDate;
    private String courseVenue;

    public Course() {
    }

    public Course(String courseTitle, String courseDuration, String courseDescription, String courseDate, String courseVenue) {
        this.courseTitle = courseTitle;
        this.courseDuration = courseDuration;
        this.courseDescription = courseDescription;
        this.courseDate = courseDate;
        this.courseVenue = courseVenue;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseDate() {
        return courseDate;
    }

    public void setCourseDate(String courseDate) {
        this.courseDate = courseDate;
    }

    public String getCourseVenue() {
        return courseVenue;
    }

    public void setCourseVenue(String courseVenue) {
        this.courseVenue = courseVenue;
    }
}
