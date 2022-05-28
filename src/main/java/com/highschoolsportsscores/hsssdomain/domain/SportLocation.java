package com.highschoolsportsscores.hsssdomain.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SportLocation {

    private Integer sportLocationId;
    private Integer schoolId;
    private Integer sportId;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private LocalDateTime updated;

    public Integer getSportLocationId() {
        return sportLocationId;
    }

    public void setSportLocationId(Integer sportLocationId) {
        this.sportLocationId = sportLocationId;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getSportId() {
        return sportId;
    }

    public void setSportId(Integer sportId) {
        this.sportId = sportId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
