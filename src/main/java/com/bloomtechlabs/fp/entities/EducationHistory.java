package com.bloomtechlabs.fp.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name ="education_histories")
public class EducationHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", insertable = false, updatable = false, nullable = false)
    private UUID id;

    @Column(name = "client_id")
    private UUID clientId;

    @Column(name = "school_name")
    private String schoolName;

    @Column(name = "level")
    private String level;

    @Column(name = "start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Column(name = "end_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    public EducationHistory() {
    }

    public EducationHistory(UUID clientId, String schoolName, String level, Date startDate, Date endDate) {
        this.clientId   = clientId;
        this.schoolName = schoolName;
        this.level      = level;
        this.startDate  = startDate;
        this.endDate    = endDate;
    }

    public UUID getId() {
        return id;
    }

    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
