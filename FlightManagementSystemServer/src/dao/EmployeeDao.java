package dao;

import java.util.List;
import model.Employee;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author arthur.mugwaneza
 */
public class EmployeeDao {
    
    public String AutoEmployee_id() {
    try  {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        String hql = "select max(e.emp_id) from Employee e";
        
        String maxEmployeeId =(String) session.createQuery(hql).uniqueResult();

        if (maxEmployeeId == null) {
            return "EM001";
        }

        Integer id = Integer.parseInt(maxEmployeeId.substring(2));
        id++;
        maxEmployeeId = String.format("EM%03d", id);

        return maxEmployeeId;
    } catch (Exception e) {
        e.printStackTrace();
        return "Server Error";
    }
}

    
    public Employee userLogin(Employee emp) {
    try  {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        String hql = "from Employee e where e.username = :username and e.password = :password";
        Query query = session.createQuery(hql);
        query.setParameter("username", emp.getUsername());
        query.setParameter("password", emp.getPassword());

        List<Employee> resultList = query.list();
        if (!resultList.isEmpty()) {
            // Assuming username is unique, so taking the first result
            return resultList.get(0);
        } else {
            return null;
        }
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }

}

    public String registerEmployee(Employee employeeObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(employeeObj);
            ss.beginTransaction().commit();
            ss.close();
            return "Employee Registered Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
    }
    public String updateEmployee(Employee employeeObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(employeeObj);
            ss.beginTransaction().commit();
            ss.close();
            return "Employee updated Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
    }
    public String deleteEmployee(Employee employeeObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(employeeObj);
            ss.beginTransaction().commit();
            ss.close();
            return "Employee deleted Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
    }
    public Employee searchEmployee(Employee employeeObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            
            Employee theemployee =(Employee) ss.get(Employee.class, employeeObj.getEmp_id());
            
            ss.close();
            return theemployee;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Employee> retrieveEmployees(){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Employee> employees = ss.createQuery("select theemployee from Employee theemployee").list();

            ss.close();
            return employees;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
}
