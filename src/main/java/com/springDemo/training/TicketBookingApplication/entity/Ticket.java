package com.springDemo.training.TicketBookingApplication.entity;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.Optional;

@Entity
@Table(name = "ticket")
public class Ticket
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ticket_Id")
    @ApiModelProperty(notes = "Id of the ticket")
    private Integer ticketId;

    @Column(name="passenger_name",nullable = false)
    @ApiModelProperty(notes = "name of the passenger")
    private String passengerName;

    @Column(name = "booking_date")
    @ApiModelProperty(notes = "Booking date")
    private Date bookingDate;

    @Column(name="source_station")
    @ApiModelProperty(notes = "source station")
    private String sourceStation;

    @Column(name="destination_station")
    @ApiModelProperty(notes = "destination station")
    private String destinationStation;
    @ApiModelProperty(notes = "email Id of the passenger")
    @Column(name="email")
    private String email;

    public Ticket()
    {
    }

    //getter and setter

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {

    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
