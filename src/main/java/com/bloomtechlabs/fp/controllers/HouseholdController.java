package com.bloomtechlabs.fp.controllers;

import com.bloomtechlabs.fp.entities.Household;
import com.bloomtechlabs.fp.services.HouseholdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/households")
public class HouseholdController {

    @Autowired
    private HouseholdService householdService;

    @GetMapping
    public List<Household> findAllHouseholds() {
        return householdService.findAllHouseholds();
    }

    @GetMapping("{id}")
    public ResponseEntity<Household> getHouseholdById(@PathVariable BigInteger id) {
        return householdService.getHouseholdById(id);
    }

    @PostMapping
    public Household createHousehold(@RequestBody Household household) {
        return householdService.saveHousehold(household);
    }

    @PutMapping("{id}")
    public ResponseEntity<Household> updateHouseholdById(@PathVariable BigInteger id, @RequestBody Household household) {
        return ResponseEntity.ok(householdService.editHouseholdById(id, household));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteHouseholdById(@PathVariable BigInteger id) {
        return householdService.deleteHouseholdById(id);
    }
}
