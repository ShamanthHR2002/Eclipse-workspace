package com.shamanth.enum1.runner;

import com.shamanth.enum1.constants.ProductType;
import com.shamanth.enum1.constants.SeatType;
import com.shamanth.enum1.constants.TicketType;
import com.shamanth.enum1.dto.CustomerDTO;
import com.shamanth.enum1.dto.TicketBookDTO;

public class Runner {
    public static void main(String[] args) {
    
        CustomerDTO customer = new CustomerDTO("Shamanthhr ", "shamanthhr52@gmail.com", ProductType.KITCHEN);
        customer.printDetails();
        
        System.out.println("------");

     
        TicketBookDTO ticket = new TicketBookDTO("Inception", "PVR Cinemas", TicketType.ONLINE, SeatType.RECLINER);
        ticket.printDetails();
    }
}
