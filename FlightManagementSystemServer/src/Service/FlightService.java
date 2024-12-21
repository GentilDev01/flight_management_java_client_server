/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Flight;

/**
 *
 * @author arthur.mugwaneza
 */
public interface FlightService extends Remote{
    
    String autoGenerateFlightNo() throws RemoteException;
    String registerFlight(Flight flightObj) throws RemoteException;
    String updateFlight(Flight flightObj) throws RemoteException;
    String deleteFlight(Flight flightObj) throws RemoteException;
    Flight searchFlight(Flight flightObj) throws RemoteException;
    List<Flight> retrieveFlights() throws RemoteException;
    
}
