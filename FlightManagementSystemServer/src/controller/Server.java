/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Service.implementation.CustomerServiceImpl;
import Service.implementation.EmployeeServiceImpl;
import Service.implementation.FlightServiceImpl;
import Service.implementation.TicketServiceImpl;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;



/**
 *
 * @author arthur.mugwaneza
 */
public class Server {
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            
            Registry theRegistry = LocateRegistry.createRegistry(6000);
            theRegistry.rebind("customer",new CustomerServiceImpl());
            theRegistry.rebind("employee", new EmployeeServiceImpl());
            theRegistry.rebind("flight", new FlightServiceImpl());
            theRegistry.rebind("ticket", new TicketServiceImpl());
            System.out.println("Server is running on port 6000");
            Thread.currentThread().join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
