package com.highschoolsportsscores.hsssdomain.domain;

import java.time.LocalDateTime;

public class Sport {

    private Integer sportId;
    private String name;
    private LocalDateTime updated;

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

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
