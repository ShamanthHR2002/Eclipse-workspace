package com.shamanth.enum1.dto;

import com.shamanth.enum1.constants.SeatType;
import com.shamanth.enum1.constants.TicketType;

public class TicketBookDTO {
    private String movieName;
    private String theaterName;
    private TicketType ticketType;
    private SeatType seatType;

 
    public TicketBookDTO(String movieName, String theaterName, TicketType ticketType, SeatType seatType) {
        this.movieName = movieName;
        this.theaterName = theaterName;
        this.ticketType = ticketType;
        this.seatType = seatType;
    }

   
    public String getMovieName() {
        return movieName;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    
    public void printDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Theater Name: " + theaterName);
        System.out.println("Ticket Type: " + ticketType + " (Cost: " + ticketType.getCost() + ")");
        System.out.println("Seat Type: " + seatType + " (Seat No: " + seatType.getSeatNo() + ")");
    }
}
