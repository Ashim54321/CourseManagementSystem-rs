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
@Table(name = "course_details")
public class SubjectDetails extends AbstractAuditingEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    @Column(name = "start_time", length = 10, nullable = false)
    private String startTime;
    @NonNull
    @Column(name = "end_time", length = 10, nullable = false)
    private String endTime;
    @NonNull
    private String title;

    private String status;

    @NonNull
    private UUID subjectDetailCode;

    @ManyToOne(optional = false)
    private CourseContents courseContents;

    @ManyToOne(optional = false)
    private Subject subject;
}
