package com.project.CourseManagementSystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;




@Entity(name = "course")
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    private String courseName;
    private String title;
    private UUID courseCode;
    private String description;

    private Long price;
    private String duration;


    public Course() {
    }

    public Course(Long id, String courseName, String title, UUID courseCode, String description, Long price) {
        this.id = id;
        this.courseName = courseName;
        this.title = title;
        this.courseCode = courseCode;
        this.description = description;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTitle() {
        return title;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UUID getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(UUID courseCode) {
        this.courseCode = courseCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", title='" + title + '\'' +
                ", courseCode=" + courseCode +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
