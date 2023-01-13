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
                    .withTimesHomelessInThreeYears(1)
                    .withTotalTimeHomelessThreeYears(100)
                    .withTotalTimeHomelessPastYear(20)
                    .withPreviouslyLivingInNonHumanHabitation(Boolean.FALSE)
                    .withPreviouslyLivingInEmergencyShelter(Boolean.TRUE)
                    .withPreviouslyUnsheltered(Boolean.TRUE)
                    .withPreviousStayLength(20)
                    .withNeedsInterpreter(Boolean.FALSE)
                    .withAccessToPrivateTransportation(Boolean.TRUE)
                    .withClientOrFamilyPhysicalIllnessHistory("sausage fingers")
                    .withClientOrFamilyMentalIllnessHistory("disruptive behavior")
                    .withClientOrFamilyPersonalViolenceHistory("bird assault")
                    .withClientOrFamilySubstanceDependencyHistory("none")
                    .withCpsInvolvement(Boolean.FALSE)
                    .withCpsInvolvementActive(Boolean.FALSE)
                    .withDcyfContactName("Peter Griffin")
                    .withDcyfContactEmail("peter.griffin@quahog.org")
                    .withDcyfContactPhoneNumber("555-444-3333")
                    .withSection8VoucherLost(Boolean.FALSE)
                    .build();

            Household household2 = Household.builder()
                    .withName("Reynolds Household")
                    .withTimesHomelessInThreeYears(3)
                    .withTotalTimeHomelessThreeYears(200)
                    .withTotalTimeHomelessPastYear(60)
                    .withPreviouslyLivingInNonHumanHabitation(Boolean.TRUE)
                    .withPreviouslyLivingInEmergencyShelter(Boolean.FALSE)
                    .withPreviouslyUnsheltered(Boolean.TRUE)
                    .withPreviousStayLength(60)
                    .withNeedsInterpreter(Boolean.FALSE)
                    .withAccessToPrivateTransportation(Boolean.FALSE)
                    .withClientOrFamilyPhysicalIllnessHistory("eyesight, high cholesterol, high blood pressure")
                    .withClientOrFamilyMentalIllnessHistory("bipolar, sociopath, schizophrenia")
                    .withClientOrFamilyPersonalViolenceHistory("gun violence")
                    .withClientOrFamilySubstanceDependencyHistory("alcohol, narcotics")
                    .withCpsInvolvement(Boolean.TRUE)
                    .withCpsInvolvementActive(Boolean.FALSE)
                    .withDcyfContactName("Frank Reynolds")
                    .withDcyfContactEmail("frank.reynolds@paddyspub.com")
                    .withDcyfContactPhoneNumber("555-111-2222")
                    .withSection8VoucherLost(Boolean.TRUE)
                    .build();

            Household household3 = Household.builder()
                    .withName("White Household")
                    .withTimesHomelessInThreeYears(2)
                    .withTotalTimeHomelessThreeYears(90)
                    .withTotalTimeHomelessPastYear(30)
                    .withPreviouslyLivingInNonHumanHabitation(Boolean.TRUE)
                    .withPreviouslyLivingInEmergencyShelter(Boolean.FALSE)
                    .withPreviouslyUnsheltered(Boolean.TRUE)
                    .withPreviousStayLength(7)
                    .withNeedsInterpreter(Boolean.FALSE)
                    .withAccessToPrivateTransportation(Boolean.TRUE)
                    .withClientOrFamilyPhysicalIllnessHistory("cancer, cerebral palsy")
                    .withClientOrFamilyMentalIllnessHistory("narcissistic personality disorder")
                    .withClientOrFamilyPersonalViolenceHistory("murder, gun violence, arson")
                    .withClientOrFamilySubstanceDependencyHistory("alcohol, tobacco")
                    .withCpsInvolvement(Boolean.TRUE)
                    .withCpsInvolvementActive(Boolean.TRUE)
                    .withDcyfContactName("Walter White")
                    .withDcyfContactEmail("walter.white@breakingbad.org")
                    .withDcyfContactPhoneNumber("555-999-9999")
                    .withSection8VoucherLost(Boolean.FALSE)
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
