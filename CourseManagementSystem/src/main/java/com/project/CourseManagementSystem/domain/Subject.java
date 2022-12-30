package com.project.CourseManagementSystem.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;



@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "subject_entity")
public class Subject extends AbstractAuditingEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String subjectName;
    private UUID subjectCode;
    private String status;
}
