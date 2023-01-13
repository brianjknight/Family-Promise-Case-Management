package com.bloomtechlabs.fp.services;

import com.bloomtechlabs.fp.entities.Household;
import com.bloomtechlabs.fp.repositories.HouseholdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class HouseholdService {

    @Autowired
    private HouseholdRepository householdRepository;

    public List<Household> findAllHouseholds() {
        return householdRepository.findAll();
    }

    // TODO Exception handling for non-existing id. IllegalArgumentException?
    public Optional<Household> findHouseholdById(BigInteger id) {
        return householdRepository.findById(id);
    }

    // TODO Exception handling for null input.
    public Household saveHousehold(Household household) {
        return householdRepository.save(household);
    }

    // TODO Exception handling for null input. Check for null return in optional.
    public Household editHouseholdById(BigInteger id, Household household) {
        Optional<Household> householdOpt = findHouseholdById(id);
        Household householdToEdit = householdOpt.get();

        householdToEdit.setName(household.getName());
        householdToEdit.setTimesHomelessInThreeYears(household.getTimesHomelessInThreeYears());
        householdToEdit.setTotalTimeHomelessThreeYears(household.getTotalTimeHomelessThreeYears());
        householdToEdit.setTotalTimeHomelessPastYear(household.getTotalTimeHomelessPastYear());
        householdToEdit.setPreviouslyLivingInNonHumanHabitation(household.isPreviously_living_in_non_human_habitation());
        householdToEdit.setPreviouslyLivingInEmergencyShelter(household.isPreviously_living_in_emergency_shelter());
        householdToEdit.setPreviouslyUnsheltered(household.isPreviously_unsheltered());
        householdToEdit.setPreviousStayLength(household.getPreviousStayLength());
        householdToEdit.setNeedsInterpreter(household.isNeeds_interpreter());
        householdToEdit.setAccessToPrivateTransportation(household.isAccess_to_private_transportation());
        householdToEdit.setClientOrFamilyPhysicalIllnessHistory(household.getClientOrFamilyPhysicalIllnessHistory());
        householdToEdit.setClientOrFamilyMentalIllnessHistory(household.getClientOrFamilyMentalIllnessHistory());
        householdToEdit.setClientOrFamilyPersonalViolenceHistory(household.getClientOrFamilyPersonalViolenceHistory());
        householdToEdit.setClientOrFamilySubstanceDependencyHistory(household.getClientOrFamilySubstanceDependencyHistory());
        householdToEdit.setCpsInvolvement(household.isCps_involvement());
        householdToEdit.setCpsInvolvementActive(household.isCps_involvement_active());
        householdToEdit.setDcyfContactName(household.getDcyfContactName());
        householdToEdit.setDcyfContactEmail(household.getDcyfContactEmail());
        householdToEdit.setDcyfContactPhoneNumber(household.getDcyfContactPhoneNumber());
        householdToEdit.setSection8VoucherLost(household.isSection_8_voucher_lost());

        return saveHousehold(householdToEdit);
    }
    // TODO Exception handling for non-existing id.
    public void deleteHouseholdById(BigInteger id) {
        householdRepository.deleteById(id);
    }

    public long count() {
        return householdRepository.count();
    }
}
