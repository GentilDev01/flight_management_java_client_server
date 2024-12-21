/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.implementation;

import Service.EmployeeService;
import dao.EmployeeDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Employee;

/**
 *
 * @author arthur.mugwaneza
 */
public class EmployeeServiceImpl extends UnicastRemoteObject implements EmployeeService{
    public  EmployeeServiceImpl() throws RemoteException{
        
    }
    EmployeeDao dao = new EmployeeDao();
    
    @Override
    public String registerEmployee(Employee employeeObj) throws RemoteException {
        return dao.registerEmployee(employeeObj);
    }

    @Override
    public String updateEmployee(Employee employeeObj) throws RemoteException {
        return dao.updateEmployee(employeeObj);
    }

    @Override
    public String deleteEmployee(Employee employeeObj) throws RemoteException {
        return dao.deleteEmployee(employeeObj);
    }

    @Override
    public Employee searchEmployee(Employee employeeObj) throws RemoteException {
        return dao.searchEmployee(employeeObj);
    }

    @Override
    public List<Employee> retrieveEmployees() throws RemoteException {
        return dao.retrieveEmployees();
    }

    @Override
    public Employee userLogin(Employee emp) throws RemoteException {
        return dao.userLogin(emp);
    }

    @Override
    public String AutoEmployee_id() throws RemoteException {
        return dao.AutoEmployee_id();
    }
    
}
