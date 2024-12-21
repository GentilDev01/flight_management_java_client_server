/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service.implementation;

import Service.TicketService;
import dao.TicketDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Ticket;

/**
 *
 * @author arthur.mugwaneza
 */
public class TicketServiceImpl extends UnicastRemoteObject implements TicketService{
    public  TicketServiceImpl() throws RemoteException{
        
    }
    TicketDao dao = new TicketDao();
    
    @Override
    public String registerTicket(Ticket ticketObj) throws RemoteException {
        return dao.registerTicket(ticketObj);
    }

    @Override
    public String updateTicket(Ticket ticketObj) throws RemoteException {
        return dao.updateTicket(ticketObj);
    }

    @Override
    public String deleteTicket(Ticket ticketObj) throws RemoteException {
        return dao.deleteTicket(ticketObj);
    }

    @Override
    public Ticket searchTicket(Ticket ticketObj) throws RemoteException {
        return dao.searchTicket(ticketObj);
    }

    @Override
    public List<Ticket> retrieveTickets() throws RemoteException {
        return dao.retrieveTickets();
    }

    @Override
    public String AutoTicketNo() throws RemoteException {
        return dao.AutoTicketNo();
    }
    
}
