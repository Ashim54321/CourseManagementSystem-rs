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
@Table(name = "course_sub_contents")
public class SubContents extends AbstractAuditingEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private Long index;
    @NonNull
    @Column(name = "course_title", length = 100, nullable = false)
    private String title;
    @NonNull
    private UUID subContentCode;
    @NonNull
    @Column(name = "course_slug", length = 100, nullable = false)
    private String slug;
    @NonNull
    @Column(name = "course_description", length = 1000, nullable = false)
    private String courseDescription;
    @NonNull
    @Column(name = "course_abstract", length = 1000, nullable = false)
    private String abstractDescription;
    @NonNull
    private String imgOne;
    private String imgTwo;
    private String imgThree;


}
