package dao;

import java.util.List;
import model.Customer;
import org.hibernate.Session;

/**
 *
 * @author arthur.mugwaneza
 */
public class CustomerDao {
    
    
    
    public String autoGenerateCustomerId() {
    try  {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "select max(c.customer_id) from Customer c";
        String maxCustomerId =(String) session.createQuery(hql).uniqueResult();
        session.close();

        if (maxCustomerId == null) {
            return "PS001";
        }

        Integer id = Integer.parseInt(maxCustomerId.substring(2));
        id++;
        maxCustomerId = String.format("PS%03d", id);

        return maxCustomerId;
    } catch (Exception e) {
        e.printStackTrace();
        return "Server Error";
    }
}

    public String registerCustomer(Customer customerObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(customerObj);
            ss.beginTransaction().commit();
            ss.close();
            return "Customer Registered Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
    }
    public String updateCustomer(Customer customerObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(customerObj);
            ss.beginTransaction().commit();
            ss.close();
            return "Customer updated Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
    }
    public String deleteCustomer(Customer customerObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(customerObj);
            ss.beginTransaction().commit();
            ss.close();
            return "Customer deleted Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
    }
    public Customer searchCustomer(Customer customerObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            
            Customer thecustomer =(Customer) ss.get(Customer.class, customerObj.getCustomer_id());
            
            ss.close();
            return thecustomer;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Customer> retrieveCustomers(){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Customer> customers = ss.createQuery("select thecustomer from Customer thecustomer").list();

            ss.close();
            return customers;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
}
