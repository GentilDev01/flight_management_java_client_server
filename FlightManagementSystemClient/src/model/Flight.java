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

public class Flight implements Serializable{
    private static final long serialVersionUID = 1476103156069150501l;
   
    private String flight_no;
    private String flightNo;
    private String source;
    private String destination;
    private String date;
    private String departure;
    private String arrival;
    private Double price;  

    public Flight() {
    }
    

    public Flight(String flightNo) {
        this.flight_no = flightNo;
    }

    public String getFlightNo() {
        return flight_no;
    }

    public void setFlightNo(String flightNo) {
        this.flight_no = flightNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    
    
    
}
