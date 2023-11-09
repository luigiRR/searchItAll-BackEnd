package com.project.SearchItAll.cron;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class taskSchedule {

	@Scheduled(cron="*/10 * * * * *")
	public void task() {
		System.out.println("la fecha actual es : " + new Date());
	}
}
