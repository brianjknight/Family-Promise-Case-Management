package com.bloomtechlabs.fp.repositories;

import com.bloomtechlabs.fp.entities.Household;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface HouseholdRepository extends JpaRepository<Household, BigInteger> {
}
