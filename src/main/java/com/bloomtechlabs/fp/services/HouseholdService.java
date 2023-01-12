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

    public List<Household> findAll() {
        return householdRepository.findAll();
    }

    public Optional<Household> findById(BigInteger id) {
        return householdRepository.findById(id);
    }

    public Household save(Household household) {
        return householdRepository.save(household);
    }

    public Household editHousehold(BigInteger id, Household household) {
        Optional<Household> householdOpt = findById(id);
        Household householdToEdit = householdOpt.get();

        householdToEdit.setName(household.getName());
        householdToEdit.setTimes_homeless_in_three_years(household.getTimes_homeless_in_three_years());
        householdToEdit.setTotal_time_homeless_three_years(household.getTotal_time_homeless_three_years());
        householdToEdit.setTotal_time_homeless_past_year(household.getTotal_time_homeless_past_year());
        householdToEdit.setPreviously_living_in_non_human_habitation(household.isPreviously_living_in_non_human_habitation());
        householdToEdit.setPreviously_living_in_emergency_shelter(household.isPreviously_living_in_emergency_shelter());
        householdToEdit.setPreviously_unsheltered(household.isPreviously_unsheltered());
        householdToEdit.setPrevious_stay_length(household.getPrevious_stay_length());
        householdToEdit.setNeeds_interpreter(household.isNeeds_interpreter());
        householdToEdit.setAccess_to_private_transportation(household.isAccess_to_private_transportation());
        householdToEdit.setClient_or_family_physical_illness_history(household.getClient_or_family_physical_illness_history());
        householdToEdit.setClient_or_family_mental_illness_history(household.getClient_or_family_mental_illness_history());
        householdToEdit.setClient_or_family_personal_violence_history(household.getClient_or_family_personal_violence_history());
        householdToEdit.setClient_or_family_substance_dependency_history(household.getClient_or_family_substance_dependency_history());
        householdToEdit.setCps_involvement(household.isCps_involvement());
        householdToEdit.setCps_involvement_active(household.isCps_involvement_active());
        householdToEdit.setDcyf_contact_name(household.getDcyf_contact_name());
        householdToEdit.setDcyf_contact_email(household.getDcyf_contact_email());
        householdToEdit.setDcyf_contact_phone_number(household.getDcyf_contact_phone_number());
        householdToEdit.setSection_8_voucher_lost(household.isSection_8_voucher_lost());

        return save(householdToEdit);
    }
}
