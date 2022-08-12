package com.demo.bigbear.models;

public class RegistrationReport {
    private String name;
    private String description;
    private String courseName;
    private String courseDescription;
    private Long courseHours;

    public RegistrationReport() {
    }

    public RegistrationReport(String name, String description, String courseName, String courseDescription) {
        this.name = name;
        this.description = description;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
    }

    public RegistrationReport(String name, String description, String courseName, String courseDescription, Long courseHours) {
        this.name = name;
        this.description = description;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseHours = courseHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public Long getCourseHours() {
        return courseHours;
    }

    public void setCourseHours(Long courseHours) {
        this.courseHours = courseHours;
    }
}
