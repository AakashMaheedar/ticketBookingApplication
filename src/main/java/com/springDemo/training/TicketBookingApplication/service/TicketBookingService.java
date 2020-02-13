package com.springDemo.training.TicketBookingApplication.service;

import com.springDemo.training.TicketBookingApplication.Dao.TicketBookingRepository;
import com.springDemo.training.TicketBookingApplication.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class TicketBookingService
{
    @Autowired
    private TicketBookingRepository ticketBookingRepository;

    public Ticket createticket(Ticket ticket)
    {
        return ticketBookingRepository.save(ticket); //save method of crud repository
    }

   public Optional<Ticket> getTicketById(Integer ticketId)
   {
       return ticketBookingRepository.findById(ticketId);
   }

    public Iterable<Ticket> getAllBookedTickets()
    {
        return ticketBookingRepository.findAll();
    }

    public void deleteTicket(Integer ticketId)
    {
        ticketBookingRepository.deleteById(ticketId);
    }

    /*

    public Ticket updateTicket(Integer ticketId, String newEmail)
    {
        Ticket ticketFromDB=new Ticket(ticketBookingRepository.findById(ticketId));
        ticketFromDB.setEmail(newEmail);
        Ticket UpdatedTicket=ticketBookingRepository.save(ticketFromDB);
        return UpdatedTicket;
    }

     */
}
