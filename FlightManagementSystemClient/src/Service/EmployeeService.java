/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Employee;

/**
 *
 * @author arthur.mugwaneza
 */
public interface EmployeeService extends Remote{
    
    String AutoEmployee_id() throws RemoteException;
    Employee userLogin(Employee emp)  throws RemoteException;
    String registerEmployee(Employee employeeObj) throws RemoteException;
    String updateEmployee(Employee employeeObj) throws RemoteException;
    String deleteEmployee(Employee employeeObj) throws RemoteException;
    Employee searchEmployee(Employee employeeObj) throws RemoteException;
    List<Employee> retrieveEmployees() throws RemoteException;
    
}
