package com.nest.courseappbackend.model;


import jakarta.persistence.*;


@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue
    private int id;
    private String courseTitle;
    private String courseDuration;
    private String courseDescription;
    private String courseDate;
    private String courseVenue;

    public Course() {
    }

    public Course(int id, String courseTitle, String courseDuration, String courseDescription, String courseDate, String courseVenue) {
        this.id = id;
        this.courseTitle = courseTitle;
        this.courseDuration = courseDuration;
        this.courseDescription = courseDescription;
        this.courseDate = courseDate;
        this.courseVenue = courseVenue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
