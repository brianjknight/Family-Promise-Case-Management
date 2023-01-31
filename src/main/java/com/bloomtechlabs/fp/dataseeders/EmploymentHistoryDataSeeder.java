package com.bloomtechlabs.fp.dataseeders;

import com.bloomtechlabs.fp.entities.EmploymentHistory;
import com.bloomtechlabs.fp.services.EmploymentHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class EmploymentHistoryDataSeeder implements CommandLineRunner {
    @Autowired
    EmploymentHistoryService employmentHistoryService;

    @Override
    public void run(String... args) throws Exception {
        loadEmploymentHistoryData();
    }

    private void loadEmploymentHistoryData() {
        if(employmentHistoryService.count() == 0) {
            for(int i = 1; i <= 200; i++) {
                EmploymentHistory tempEmploymentHistory = new EmploymentHistory(
                        UUID.fromString(String.format("00000000-0000-0000-0000-%s", i)),
                        i % 2 == 0,
                        String.format("Certification #%d", i));
                employmentHistoryService.createEmploymentHistory(tempEmploymentHistory);
            }

            UUID uuid1 = UUID.randomUUID();
            EmploymentHistory employmentHistory1 =
                    new EmploymentHistory(uuid1, true, "Forklift Certified");
            UUID uuid2 = UUID.randomUUID();
            EmploymentHistory employmentHistory2 =
                    new EmploymentHistory(uuid2, false, "Food Service Certified");
            UUID uuid3 = UUID.randomUUID();
            EmploymentHistory employmentHistory3 =
                    new EmploymentHistory(uuid3, true, "Certified Ethical Hacking Course");
            employmentHistoryService.createEmploymentHistory(employmentHistory1);
            employmentHistoryService.createEmploymentHistory(employmentHistory2);
            employmentHistoryService.createEmploymentHistory(employmentHistory3);
            System.out.println("added " + employmentHistoryService.count() +
                    " records to the employment_histories table.");
        } else {
            System.out.println("There are already " + employmentHistoryService.count() +
                    " records in the employment_histories table.");
        }
    }
}
