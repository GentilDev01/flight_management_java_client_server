package Service.implementation;

import Service.CustomerService;
import dao.CustomerDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Customer;

/**
 *
 * @author arthur.mugwaneza
 */
public class CustomerServiceImpl extends UnicastRemoteObject implements CustomerService{
    public  CustomerServiceImpl() throws RemoteException{
        
    }
    CustomerDao dao = new CustomerDao();
    
    @Override
    public String registerCustomer(Customer customerObj) throws RemoteException {
        return dao.registerCustomer(customerObj);
    }

    @Override
    public String updateCustomer(Customer customerObj) throws RemoteException {
        return dao.updateCustomer(customerObj);
    }

    @Override
    public String deleteCustomer(Customer customerObj) throws RemoteException {
        return dao.deleteCustomer(customerObj);
    }

    @Override
    public Customer searchCustomer(Customer customerObj) throws RemoteException {
        return dao.searchCustomer(customerObj);
    }

    @Override
    public List<Customer> retrieveCustomers() throws RemoteException {
        return dao.retrieveCustomers();
    }

    @Override
    public String autoGenerateCustomerId() throws RemoteException {
        return dao.autoGenerateCustomerId();
    }
    
}
