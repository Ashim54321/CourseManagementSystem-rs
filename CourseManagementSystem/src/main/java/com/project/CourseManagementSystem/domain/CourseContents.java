package com.project.CourseManagementSystem.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "course_contents")
public class CourseContents extends AbstractAuditingEntity {

    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    @Column(name = "course_title", length = 100, nullable = false)
    private String title;
    @NonNull
    private UUID courseContentCode;
    @NonNull
    @Column(name = "course_slug", length = 100, nullable = false)
    private String slug;
    @NonNull
    @Column(name = "course_description", length = 1000, nullable = false)
    private String courseDescription;
    @NonNull
    private String imgOne;
    private String imgTwo;
    private String imgThree;

    @ManyToOne(optional = false)
    private SubContents subContents;

}
