package com.project.CourseManagementSystem.domain;


import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity(name = "profile")
public class Profile {

    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String firstName;
    private String middleName;
    @NonNull
    private String lastName;
    private String email;
    private String imgUrl;
    private String address;
    private String altEmail;
    private String altAddress;
    private String city;
    private String district;
    private String municipality;
    @NonNull
    private UUID profileCode;


    public Profile() {
    }

    public Profile(Long id, @NonNull String firstName, String middleName, @NonNull String lastName, String email, String imgUrl, String address, String altEmail, String altAddress, String city, String district, String municipality, @NonNull UUID profileCode) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.imgUrl = imgUrl;
        this.address = address;
        this.altEmail = altEmail;
        this.altAddress = altAddress;
        this.city = city;
        this.district = district;
        this.municipality = municipality;
        this.profileCode = profileCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAltEmail() {
        return altEmail;
    }

    public void setAltEmail(String altEmail) {
        this.altEmail = altEmail;
    }

    public String getAltAddress() {
        return altAddress;
    }

    public void setAltAddress(String altAddress) {
        this.altAddress = altAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public UUID getProfileCode() {
        return profileCode;
    }

    public void setProfileCode(UUID profileCode) {
        this.profileCode = profileCode;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", address='" + address + '\'' +
                ", altEmail='" + altEmail + '\'' +
                ", altAddress='" + altAddress + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", municipality='" + municipality + '\'' +
                ", profileCode=" + profileCode +
                '}';
    }
}
