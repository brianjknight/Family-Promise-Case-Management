package com.bloomtechlabs.fp.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name ="employment_histories")
public class EmploymentHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", insertable = false, updatable = false, nullable = false)
    private UUID id;

    @Column(name = "client_id")
    private UUID clientId;

    @Column(name = "currently_employed")
    private Boolean currentlyEmployed;

    @Column(name = "skill_certifications")
    private String skillCertifications;

    public EmploymentHistory() {
    }

    public EmploymentHistory(UUID clientId, Boolean currentlyEmployed, String skillCertifications) {
        this.clientId            = clientId;
        this.currentlyEmployed   = currentlyEmployed;
        this.skillCertifications = skillCertifications;
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

    public Boolean getCurrentlyEmployed() {
        return currentlyEmployed;
    }

    public void setCurrentlyEmployed(Boolean currentlyEmployed) {
        this.currentlyEmployed = currentlyEmployed;
    }

    public String getSkillCertifications() {
        return skillCertifications;
    }

    public void setSkillCertifications(String skillCertifications) {
        this.skillCertifications = skillCertifications;
    }
}
