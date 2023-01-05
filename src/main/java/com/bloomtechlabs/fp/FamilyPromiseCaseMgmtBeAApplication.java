package com.bloomtechlabs.fp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FamilyPromiseCaseMgmtBeAApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(FamilyPromiseCaseMgmtBeAApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		SpringApplication.run(FamilyPromiseCaseMgmtBeAApplication.class, args);
	}
}
