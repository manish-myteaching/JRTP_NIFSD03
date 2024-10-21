package com.makemytrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TarvelPlanApiApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(TarvelPlanApiApplication.class, args);

		// TravelPlanDAO travelPlanDAO = applicationContext.getBean(TravelPlanDAO.class,
		// "travelPlanDAO");

//		TravelPlan travelPlan = new TravelPlan();
//		travelPlan.setPlanName("Goa 3N/4D");
//		travelPlan.setPlanMinBudget(25000.0);
//		travelPlan.setActive_sw('a');
//		travelPlan.setCreatedBy("Manish");
//		travelPlan.setUpdatedBy("Shyam");
//		travelPlan.setCreatedDate(LocalDate.now());
//		travelPlan.setUpdateDate(LocalDate.now());
//		travelPlanDAO.save(travelPlan);
//		
//		TravelPlan travelPlan2 = new TravelPlan();
//		travelPlan2.setPlanName("Singapor 3N/4D");
//		travelPlan2.setPlanMinBudget(100000.0);
//		travelPlan2.setActive_sw('a');
//		travelPlan2.setCreatedBy("Manish");
//		travelPlan2.setUpdatedBy("Manish");
//		travelPlan2.setCreatedDate(LocalDate.now());
//		travelPlan2.setUpdateDate(LocalDate.now());
//		travelPlanDAO.save(travelPlan2);
//		
//		TravelPlan travelPlan3 = new TravelPlan();
//		travelPlan3.setPlanName("Maldivs 6N/7D");
//		travelPlan3.setPlanMinBudget(150000.0);
//		travelPlan3.setActive_sw('a');
//		travelPlan3.setCreatedBy("Manish");
//		travelPlan3.setUpdatedBy("Manish");
//		travelPlan3.setCreatedDate(LocalDate.now());
//		travelPlan3.setUpdateDate(LocalDate.now());
//		travelPlanDAO.save(travelPlan3);

//		TravelPlan travelPlan3 = new TravelPlan();
//		travelPlan3.setPlanName("Maldivs 6N/7D");
//		travelPlan3.setPlanMinBudget(150000.0);
//		travelPlan3.setActive_sw('a');
//		travelPlan3.setCreatedBy("Manish");
//		travelPlan3.setUpdatedBy("Manish");
//		travelPlan3.setCreatedDate(LocalDate.now());
//		travelPlan3.setUpdateDate(LocalDate.now());
//		travelPlanDAO.save(travelPlan3);

//		TravelPlanService travelPlanService = applicationContext.getBean(TravelPlanServiceImpl.class,
//				"travelPlanServiceImpl");
//
//		TravelPlan travelPlan = new TravelPlan();
//		travelPlan.setPlanName("Goa 3N/4D");
//		travelPlan.setPlanMinBudget(25000.0);
//		travelPlan.setActive_sw('a');
//		travelPlan.setCreatedBy("Manish");
//		travelPlan.setUpdatedBy("Shyam");
//		travelPlan.setCreatedDate(LocalDate.now());
//		travelPlan.setUpdateDate(LocalDate.now());
//		String response = travelPlanService.registerTravelPlan(travelPlan);
//		System.out.println(response);

	}

}
