package com.bloomtechlabs.fp.services;

import com.bloomtechlabs.fp.entities.Goal;
import com.bloomtechlabs.fp.exceptions.ResourceNotFoundException;
import com.bloomtechlabs.fp.repositories.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class GoalService {
    @Autowired
    private GoalRepository goalRepository;

    public List<Goal> getAllGoals() {
        return goalRepository.findAll();
    }

    public Goal createGoal(Goal goal) {
        if (Objects.isNull(goal)) {
            throw new IllegalArgumentException("Goal input cannot be null");
        }

        return goalRepository.save(goal);
    }

    public ResponseEntity<Goal> getGoalById(UUID id) {
        Goal goal = findGoalById(id);

        return ResponseEntity.ok(goal);
    }

    public ResponseEntity<Goal> updateGoal(UUID id, Goal goalDetails) {
        if (Objects.isNull(goalDetails)) {
            throw new IllegalArgumentException("Goal input cannot be null");
        }

        Goal goal = findGoalById(id);
        goal.setClientId(           goalDetails.getClientId());
        goal.setGoalStatement(      goalDetails.getGoalStatement());
        goal.setGoalSteps(          goalDetails.getGoalSteps());
        goal.setGoalTargetDate(     goalDetails.getGoalTargetDate());
        goal.setCmTask(             goalDetails.getCmTask());
        goal.setDateArchived(       goalDetails.getDateArchived());
        goal.setNotes(              goalDetails.getNotes());
        goal.setClientStrengths(    goalDetails.getClientStrengths());
        goal.setClientObstacles(    goalDetails.getClientObstacles());
        goal.setProgressSummary(    goalDetails.getProgressSummary());

        Goal updatedGoal = goalRepository.save(goal);

        return ResponseEntity.ok(updatedGoal);
    }

    public ResponseEntity<String> deleteGoal(UUID id) {
        Goal goalToDelete = findGoalById(id);
        goalRepository.delete(goalToDelete);

        return ResponseEntity.ok("Successfully delete goal ID " + id);
    }

    public long count() {
        return goalRepository.count();
    }

    private Goal findGoalById(UUID id) {
        return goalRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Goal Does Not Exist with this Id: " + id));
    }
}
