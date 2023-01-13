package com.bloomtechlabs.fp.dataseeders;

import com.bloomtechlabs.fp.entities.Household;
import com.bloomtechlabs.fp.services.HouseholdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HouseholdDataSeeder implements CommandLineRunner {
    @Autowired
    HouseholdService householdService;

    @Override
    public void run(String... args) throws Exception  {
        loadHouseholdData();
    }

    private void loadHouseholdData() {
        if (householdService.count() == 0) {
            Household household1 = Household.builder()
                    .withName("Griffin Household")
                    .withTimes_homeless_in_three_years(1)
                    .withTotal_time_homeless_three_years(100)
                    .withTotal_time_homeless_past_year(20)
                    .withPreviously_living_in_non_human_habitation(Boolean.FALSE)
                    .withPreviously_living_in_emergency_shelter(Boolean.TRUE)
                    .withPreviously_unsheltered(Boolean.TRUE)
                    .withPrevious_stay_length(20)
                    .withNeeds_interpreter(Boolean.FALSE)
                    .withAccess_to_private_transportation(Boolean.TRUE)
                    .withClient_or_family_physical_illness_history("sausage fingers")
                    .withClient_or_family_mental_illness_history("disruptive behavior")
                    .withClient_or_family_personal_violence_history("bird assault")
                    .withClient_or_family_substance_dependency_history("none")
                    .withCps_involvement(Boolean.FALSE)
                    .withCps_involvement_active(Boolean.FALSE)
                    .withDcyf_contact_name("Peter Griffin")
                    .withDcyf_contact_email("peter.griffin@quahog.org")
                    .withDcyf_contact_phone_number("555-444-3333")
                    .withSection_8_voucher_lost(Boolean.FALSE)
                    .build();

            Household household2 = Household.builder()
                    .withName("Reynolds Household")
                    .withTimes_homeless_in_three_years(3)
                    .withTotal_time_homeless_three_years(200)
                    .withTotal_time_homeless_past_year(60)
                    .withPreviously_living_in_non_human_habitation(Boolean.TRUE)
                    .withPreviously_living_in_emergency_shelter(Boolean.FALSE)
                    .withPreviously_unsheltered(Boolean.TRUE)
                    .withPrevious_stay_length(60)
                    .withNeeds_interpreter(Boolean.FALSE)
                    .withAccess_to_private_transportation(Boolean.FALSE)
                    .withClient_or_family_physical_illness_history("eyesight, high cholesterol, high blood pressure")
                    .withClient_or_family_mental_illness_history("bipolar, sociopath, schizophrenia")
                    .withClient_or_family_personal_violence_history("gun violence")
                    .withClient_or_family_substance_dependency_history("alcohol, narcotics")
                    .withCps_involvement(Boolean.TRUE)
                    .withCps_involvement_active(Boolean.FALSE)
                    .withDcyf_contact_name("Frank Reynolds")
                    .withDcyf_contact_email("frank.reynolds@paddyspub.com")
                    .withDcyf_contact_phone_number("555-111-2222")
                    .withSection_8_voucher_lost(Boolean.TRUE)
                    .build();

            Household household3 = Household.builder()
                    .withName("White Household")
                    .withTimes_homeless_in_three_years(2)
                    .withTotal_time_homeless_three_years(90)
                    .withTotal_time_homeless_past_year(30)
                    .withPreviously_living_in_non_human_habitation(Boolean.TRUE)
                    .withPreviously_living_in_emergency_shelter(Boolean.FALSE)
                    .withPreviously_unsheltered(Boolean.TRUE)
                    .withPrevious_stay_length(7)
                    .withNeeds_interpreter(Boolean.FALSE)
                    .withAccess_to_private_transportation(Boolean.TRUE)
                    .withClient_or_family_physical_illness_history("cancer, cerebral palsy")
                    .withClient_or_family_mental_illness_history("narcissistic personality disorder")
                    .withClient_or_family_personal_violence_history("murder, gun violence, arson")
                    .withClient_or_family_substance_dependency_history("alcohol, tobacco")
                    .withCps_involvement(Boolean.TRUE)
                    .withCps_involvement_active(Boolean.TRUE)
                    .withDcyf_contact_name("Walter White")
                    .withDcyf_contact_email("walter.white@breakingbad.org")
                    .withDcyf_contact_phone_number("555-999-9999")
                    .withSection_8_voucher_lost(Boolean.FALSE)
                    .build();

            Household householdEmpty = Household.builder()
                    .withName("Empty Household")
                    .build();

            householdService.saveHousehold(household1);
            householdService.saveHousehold(household2);
            householdService.saveHousehold(household3);
            householdService.saveHousehold(householdEmpty);

            System.out.println("Added " + householdService.count() + " records to the household table.");
       } else {
            System.out.println("There are already " + householdService.count() +
                    " records in the households table.");
        }
    }

}
