package com.highschoolsportsscores.hsssdomain.domain;

import java.time.LocalDateTime;

public class Schedule {

    private Integer scheduleId;
    private Integer homeSchoolId;
    private Integer awaySchoolId;
    private Integer sportId;
    private Integer sportLocationId;
    private LocalDateTime scheduleDateTime;
    private Integer scoreId;
    private LocalDateTime updated;

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getHomeSchoolId() {
        return homeSchoolId;
    }

    public void setHomeSchoolId(Integer homeSchoolId) {
        this.homeSchoolId = homeSchoolId;
    }

    public Integer getAwaySchoolId() {
        return awaySchoolId;
    }

    public void setAwaySchoolId(Integer awaySchoolId) {
        this.awaySchoolId = awaySchoolId;
    }

    public Integer getSportId() {
        return sportId;
    }

    public void setSportId(Integer sportId) {
        this.sportId = sportId;
    }

    public Integer getSportLocationId() {
        return sportLocationId;
    }

    public void setSportLocationId(Integer sportLocationId) {
        this.sportLocationId = sportLocationId;
    }

    public LocalDateTime getScheduleDateTime() {
        return scheduleDateTime;
    }

    public void setScheduleDateTime(LocalDateTime scheduleDateTime) {
        this.scheduleDateTime = scheduleDateTime;
    }

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
