package com.springDemo.training.TicketBookingApplication.Dao;

import com.springDemo.training.TicketBookingApplication.entity.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketBookingRepository extends CrudRepository<Ticket,Integer>
{


}
