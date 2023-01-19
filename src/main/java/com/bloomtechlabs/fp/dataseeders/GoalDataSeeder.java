package com.bloomtechlabs.fp.dataseeders;

import com.bloomtechlabs.fp.entities.Goal;
import com.bloomtechlabs.fp.services.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

@Component
public class GoalDataSeeder implements CommandLineRunner {
    @Autowired
    GoalService goalService;

    @Override
    public void run(String... args) throws Exception {
        loadGoalData();
    }

    private void loadGoalData() {
        if(goalService.count() == 0) {
            Calendar goalTargetDate1 = Calendar.getInstance();
            goalTargetDate1.set(2000, Calendar.JANUARY, 1);
            Date targetDate1 = goalTargetDate1.getTime();

            Calendar dateArchived1 = Calendar.getInstance();
            dateArchived1.set(2004, Calendar.DECEMBER, 31);
            Date archiveDate1 = dateArchived1.getTime();

            UUID uuid1 = UUID.randomUUID();

            Goal goal1 = new Goal(
                    uuid1,
                    "1,000,000 push ups",
                    "do 1 push up, do more push ups",
                    targetDate1,
                    "cmTask A",
                    archiveDate1,
                    "get in shape with push ups",
                    "legs, never skip leg day",
                    "one arm",
                    "10 consecutive push ups");

            goalService.createGoal(goal1);

            Calendar goalTargetDate2 = Calendar.getInstance();
            goalTargetDate2.set(1984, Calendar.AUGUST, 27);
            Date targetDate2 = goalTargetDate2.getTime();

            Calendar dateArchived2 = Calendar.getInstance();
            dateArchived2.set(1980, Calendar.DECEMBER, 10);
            Date archiveDate2 = dateArchived2.getTime();

            UUID uuid2 = UUID.randomUUID();

            Goal goal2 = new Goal(
                    uuid2,
                    "Promotion to McDonald's Senior French Fryer",
                    "practice with the fry machine",
                    targetDate2,
                    "cmTask B",
                    archiveDate2,
                    "be careful with the hot oil",
                    "3 years of experience",
                    "walking to work",
                    "1/2 way there");

            goalService.createGoal(goal2);

            Calendar goalTargetDate3 = Calendar.getInstance();
            goalTargetDate3.set(2009, Calendar.JANUARY, 5);
            Date targetDate3 = goalTargetDate3.getTime();

            Calendar dateArchived3 = Calendar.getInstance();
            dateArchived3.set(2012, Calendar.SEPTEMBER, 18);
            Date archiveDate3 = dateArchived3.getTime();

            UUID uuid3 = UUID.randomUUID();

            Goal goal3 = new Goal(
                    uuid3,
                    "Start a house painting business",
                    "buying paint, posting flyers",
                    targetDate3,
                    "cmTask c",
                    archiveDate3,
                    "paint is pricey",
                    "wall painting",
                    "no brushes, height; need ladders",
                    "finger painted one house");

            goalService.createGoal(goal3);

            System.out.println("added " + goalService.count() +
                    " records to the goals table.");

        } else {
            System.out.println("There are already " + goalService.count() +
                    " records in the goals table.");
        }


    }
}
