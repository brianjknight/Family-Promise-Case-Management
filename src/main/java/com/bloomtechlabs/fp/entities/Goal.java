package com.bloomtechlabs.fp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "goals")
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", insertable = false, updatable = false, nullable = false)
    private UUID id;

    @Column(name = "client_id")
    private UUID clientId;

    @Column(name = "goal_statement")
    private String goalStatement;

    @Column(name = "goal_steps")
    private String goalSteps;

    @Column(name = "goal_target_date")
    @Temporal(TemporalType.DATE)
    private Date goalTargetDate;

    @Column(name = "cm_task")
    private String cmTask;

    @Column(name = "date_archived")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateArchived;

    @Column(name = "notes")
    private String notes;

    @Column(name = "client_strengths")
    private String clientStrengths;

    @Column(name = "client_obstacles")
    private String clientObstacles;

    @Column(name = "progress_summary")
    private String progressSummary;

    public Goal() {}

    public Goal(UUID clientId, String goalStatement, String goalSteps, Date goalTargetDate, String cmTask, Date dateArchived, String notes, String clientStrengths, String clientObstacles, String progressSummary) {
        this.clientId = clientId;
        this.goalStatement = goalStatement;
        this.goalSteps = goalSteps;
        this.goalTargetDate = goalTargetDate;
        this.cmTask = cmTask;
        this.dateArchived = dateArchived;
        this.notes = notes;
        this.clientStrengths = clientStrengths;
        this.clientObstacles = clientObstacles;
        this.progressSummary = progressSummary;
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

    public String getGoalStatement() {
        return goalStatement;
    }

    public void setGoalStatement(String goalStatement) {
        this.goalStatement = goalStatement;
    }

    public String getGoalSteps() {
        return goalSteps;
    }

    public void setGoalSteps(String goalSteps) {
        this.goalSteps = goalSteps;
    }

    public Date getGoalTargetDate() {
        return goalTargetDate;
    }

    public void setGoalTargetDate(Date goalTargetDate) {
        this.goalTargetDate = goalTargetDate;
    }

    public String getCmTask() {
        return cmTask;
    }

    public void setCmTask(String cmTask) {
        this.cmTask = cmTask;
    }

    public Date getDateArchived() {
        return dateArchived;
    }

    public void setDateArchived(Date dateArchived) {
        this.dateArchived = dateArchived;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getClientStrengths() {
        return clientStrengths;
    }

    public void setClientStrengths(String clientStrengths) {
        this.clientStrengths = clientStrengths;
    }

    public String getClientObstacles() {
        return clientObstacles;
    }

    public void setClientObstacles(String clientObstacles) {
        this.clientObstacles = clientObstacles;
    }

    public String getProgressSummary() {
        return progressSummary;
    }

    public void setProgressSummary(String progressSummary) {
        this.progressSummary = progressSummary;
    }

    @Override
    public String toString() {
        return "Goal{" +
                "id=" + id +
                ", clientId=" + clientId +
                ", goalStatement='" + goalStatement + '\'' +
                ", goalSteps='" + goalSteps + '\'' +
                ", goalTargetDate=" + goalTargetDate +
                ", cmTask='" + cmTask + '\'' +
                ", dateArchived=" + dateArchived +
                ", notes='" + notes + '\'' +
                ", clientStrengths='" + clientStrengths + '\'' +
                ", clientObstacles='" + clientObstacles + '\'' +
                ", progressSummary='" + progressSummary + '\'' +
                '}';
    }
}
