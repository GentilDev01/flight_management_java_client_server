package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author arthur.mugwaneza
 */
@Entity
public class Ticket implements Serializable{
    @Id
    private String ticketNo;
    @ManyToOne
    @JoinColumn(name = "flight_no")
    private Flight theflight;
    @OneToOne
    @JoinColumn(name = "customer_id")
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
    
    
   
    

    
}
