/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.implementation;

import Service.FlightService;
import dao.FlightDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Flight;

/**
 *
 * @author arthur.mugwaneza
 */
public class FlightServiceImpl extends UnicastRemoteObject implements FlightService{
    public  FlightServiceImpl() throws RemoteException{
        
    }
    FlightDao dao = new FlightDao();
    
    @Override
    public String registerFlight(Flight flightObj) throws RemoteException {
        return dao.registerFlight(flightObj);
    }

    @Override
    public String updateFlight(Flight flightObj) throws RemoteException {
        return dao.updateFlight(flightObj);
    }

    @Override
    public String deleteFlight(Flight flightObj) throws RemoteException {
        return dao.deleteFlight(flightObj);
    }

    @Override
    public Flight searchFlight(Flight flightObj) throws RemoteException {
        return dao.searchFlight(flightObj);
    }

    @Override
    public List<Flight> retrieveFlights() throws RemoteException {
        return dao.retrieveFlights();
    }

    @Override
    public String autoGenerateFlightNo() throws RemoteException {
        return  dao.autoGenerateFlightNo();
    }
    
}
