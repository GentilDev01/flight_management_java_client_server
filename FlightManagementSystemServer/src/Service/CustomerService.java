/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Customer;

/**
 *
 * @author ingab
 */
public interface CustomerService extends Remote{
    String autoGenerateCustomerId() throws RemoteException;
    String registerCustomer(Customer customerObj) throws RemoteException;
    String updateCustomer(Customer customerObj) throws RemoteException;
    String deleteCustomer(Customer customerObj) throws RemoteException;
    Customer searchCustomer(Customer customerObj) throws RemoteException;
    List<Customer> retrieveCustomers() throws RemoteException;
    
}
