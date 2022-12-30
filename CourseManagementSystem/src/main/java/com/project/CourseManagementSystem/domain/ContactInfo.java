package com.project.CourseManagementSystem.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "contact_info")
public class ContactInfo extends AbstractAuditingEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "cell_phone", length = 12, nullable = false)
    private String cellPhone;

    @Column(name = "home_phone", length = 12)
    private String homePhone;

    @NotNull
    @Column(name = "emergency_contact_name_1", length = 50, nullable = false)
    private String emergencyContactName1;

    @NotNull
    @Column(name = "emergency_contact_phone_1", length = 12, nullable = false)
    private String emergencyContactPhone1;

    @Column(name = "emergency_contact_name_2", length = 50)
    private String emergencyContactName2;

    @Column(name = "emergency_contact_phone_2", length = 12)
    private String emergencyContactPhone2;

    @Column(name = "status", length = 10)
    private String status;

    @NotNull
    @Column(name = "address_1", length = 40, nullable = false)
    private String address1;

    @Column(name = "address_2")
    private String address2;

    @NotNull
    @Column(name = "city", length = 20, nullable = false)
    private String city;

    @NotNull
    @Column(name = "district", length = 20, nullable = false)
    private String district;

    @NotNull
    @Column(name = "province", length = 20, nullable = false)
    private String province;

    @Column(name = "alt_email", length = 30)
    private String altEmail;

    @JsonIgnoreProperties(value = { "user", "contactInfo" }, allowSetters = true)
    @OneToOne(optional = false)
    @NotNull
    @MapsId
    @JoinColumn(name = "id")
    private Profile profile;
}
