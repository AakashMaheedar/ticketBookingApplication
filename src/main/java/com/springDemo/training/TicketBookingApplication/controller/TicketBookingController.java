package com.springDemo.training.TicketBookingApplication.controller;

 import com.springDemo.training.TicketBookingApplication.entity.Ticket;
 import com.springDemo.training.TicketBookingApplication.service.TicketBookingService;
 import io.swagger.annotations.Api;
 import io.swagger.annotations.ApiOperation;
 import io.swagger.annotations.ApiResponse;
 import io.swagger.annotations.ApiResponses;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;

 import java.util.Optional;


@RestController
@RequestMapping(value = "/api/tickets")
@Api(value="Ticket booking Application")
public class TicketBookingController
{
    @Autowired
    private TicketBookingService ticketBookingService;

    @ApiOperation(value = "Creates a new ticket")
    @PostMapping(value="/create")
    public Ticket createTicket(@RequestBody Ticket ticket)
    {
        return  ticketBookingService.createticket(ticket);
    }

    @ApiOperation(value = "Display a tickets based on Id")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "Successful"),
            @ApiResponse(code = 403,message = "Forbidden"),
            @ApiResponse(code = 404,message ="Not found"),
            @ApiResponse(code = 500,message ="Internal Server Error"),
            @ApiResponse(code = 503,message ="Service Unavailable"),
            @ApiResponse(code = 504,message ="gateway timeOut")

    })
    @GetMapping(value="/ticket/{ticketId}")
    public Optional<Ticket> getTicketById(@PathVariable("ticketId") Integer ticketId)
    {
            return ticketBookingService.getTicketById(ticketId);
    }

    @ApiOperation(value = "Displays all the tickets that have been created")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "Successful"),
            @ApiResponse(code = 403,message = "Forbidden"),
            @ApiResponse(code = 404,message ="Not found"),
            @ApiResponse(code = 500,message ="Internal Server Error"),
            @ApiResponse(code = 503,message ="Service Unavailable"),
            @ApiResponse(code = 504,message ="gateway timeOut")

    })
    @GetMapping(value="/ticket/allTickets")
    public Iterable<Ticket> getAllBookedTickets()
    {
      return ticketBookingService.getAllBookedTickets();
    }

    @ApiOperation(value = "Deletes a ticket")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "Successful"),
            @ApiResponse(code = 403,message = "Forbidden"),
            @ApiResponse(code = 404,message ="Not found"),
            @ApiResponse(code = 500,message ="Internal Server Error"),
            @ApiResponse(code = 503,message ="Service Unavailable"),
            @ApiResponse(code = 504,message ="gateway timeOut")

    })
    @DeleteMapping(value="/ticket/{ticketId}")
    public void deleteTicket(@PathVariable("ticketId") Integer ticketId)
    {
        ticketBookingService.deleteTicket(ticketId);
    }
    /*
    @PutMapping(value="/ticket/{ticketId}/{newEmail}")
    public Ticket updateTicket(@PathVariable("ticketId")Integer ticketId,String newEmail)
    {
        return ticketBookingService.updateTicket(ticketId,newEmail);
    }
*/
}
