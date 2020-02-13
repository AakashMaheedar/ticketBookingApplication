package com.springDemo.training.TicketBookingApplication;

import com.springDemo.training.TicketBookingApplication.entity.Ticket;
import com.springDemo.training.TicketBookingApplication.service.TicketBookingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Date;

@SpringBootApplication
public class TicketBookingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext= SpringApplication.run(TicketBookingApplication.class, args);
		TicketBookingService ticketBookingService=applicationContext.getBean("ticketBookingService",TicketBookingService.class);
		Ticket ticket=new Ticket();
		ticket.setBookingDate(new Date());

		ticket.setPassengerName("Aakash");
		ticket.setSourceStation("Trichy");
		ticket.setDestinationStation("Chennai");
		ticket.setEmail("aakash@gmail.com");
		ticketBookingService.createticket(ticket);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World!!");
	}
}
