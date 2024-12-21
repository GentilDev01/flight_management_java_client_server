/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author arthur.mugwaneza
 */

public class Ticket implements Serializable{

    private String ticketNo;
   
    private Flight theflight;
   
    private Customer thecustomer;   

    public Ticket() {
    }

    public Ticket(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public Ticket(String ticketNo, Flight theflight, Customer thecustomer) {
        this.ticketNo = ticketNo;
        this.theflight = theflight;
        this.thecustomer = thecustomer;
    }

    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public Flight getTheflight() {
        return theflight;
    }

    public void setTheflight(Flight theflight) {
        this.theflight = theflight;
    }

    public Customer getThecustomer() {
        return thecustomer;
    }

    public void setThecustomer(Customer thecustomer) {
        this.thecustomer = thecustomer;
    }

//    @Override
//    public String toString() {
//        Flight flight = n
//        return Flight.;
//    }

  
    
    
   
    

    
}
