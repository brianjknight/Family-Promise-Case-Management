package com.bloomtechlabs.fp.controllers;

import com.bloomtechlabs.fp.entities.EmploymentHistory;
import com.bloomtechlabs.fp.services.EmploymentHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/employment_histories")
public class EmploymentHistoryController {

    @Autowired
    EmploymentHistoryService employmentHistoryService;

    @GetMapping
    List<EmploymentHistory> getAllEmploymentHistories() {
        return employmentHistoryService.getAllEmploymentHistories();
    }

    /**
     * @param offset page index to return results from.
     * @param limit number of results to include per page.
     * @return returns a paginated list of EmploymentHistory objects.
     */
    @GetMapping("{offset}/{limit}")
    public ResponseEntity<Page<EmploymentHistory>> getAllEmploymentHistoriesPaginated(@PathVariable int offset, @PathVariable int limit) {
        return ResponseEntity.ok(employmentHistoryService.getAllEmploymentHistoriesPaginated(offset, limit));
    }

    @PostMapping
    EmploymentHistory createEmploymentHistory(@RequestBody EmploymentHistory employmentHistory) {
        return employmentHistoryService.createEmploymentHistory(employmentHistory);
    }

    @GetMapping("{id}")
    public ResponseEntity<EmploymentHistory> getEmploymentHistoryById(@PathVariable UUID id) {
        return employmentHistoryService.getEmploymentHistoryById(id);
    }

    @PutMapping("{id}")
    public ResponseEntity<EmploymentHistory> updateEmploymentHistory(@PathVariable UUID id,
                                                                     @RequestBody EmploymentHistory employmentHistory) {
        return employmentHistoryService.updateEmploymentHistory(id, employmentHistory);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmploymentHistory(@PathVariable UUID id) {
        return employmentHistoryService.deleteEmploymentHistory(id);
    }
}
