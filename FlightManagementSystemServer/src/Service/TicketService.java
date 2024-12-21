/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Ticket;

/**
 *
 * @author arthur.mugwaneza
 */
public interface TicketService extends Remote{
    String AutoTicketNo() throws RemoteException;
    String registerTicket(Ticket ticketObj) throws RemoteException;
    String updateTicket(Ticket ticketObj) throws RemoteException;
    String deleteTicket(Ticket ticketObj) throws RemoteException;
    Ticket searchTicket(Ticket ticketObj) throws RemoteException;
    List<Ticket> retrieveTickets() throws RemoteException;
    
}
