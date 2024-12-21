package dao;

import java.util.List;
import model.Flight;
import org.hibernate.Session;

/**
 *
 * @author arthur.mugwaneza
 */
public class FlightDao {
    public String autoGenerateFlightNo() {
    try  {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "select max(f.flight_no) from Flight f";
        String maxFlightNo =(String) session.createQuery(hql).uniqueResult();

        if (maxFlightNo == null) {
            return "FL001";
        }

        Integer id = Integer.parseInt(maxFlightNo.substring(2));
        id++;
        maxFlightNo = String.format("FL%03d", id);

        return maxFlightNo;
        
    } catch (Exception e) {
        e.printStackTrace();
        return "Server Error";
    }
}

    public String registerFlight(Flight flightObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            flightObj.setFlightNo(autoGenerateFlightNo());
            ss.save(flightObj);
            ss.beginTransaction().commit();
            ss.close();
            return "Flight Registered Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
    }
    public String updateFlight(Flight flightObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(flightObj);
            ss.beginTransaction().commit();
            ss.close();
            return "Flight updated Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
    }
    public String deleteFlight(Flight flightObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(flightObj);
            ss.beginTransaction().commit();
            ss.close();
            return "Flight deleted Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
    }
    public Flight searchFlight(Flight flightObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            
            Flight theflight =(Flight) ss.get(Flight.class, flightObj.getFlightNo());
            
            ss.close();
            return theflight;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Flight> retrieveFlights(){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Flight> flights = ss.createQuery("select theflight from Flight theflight").list();

            ss.close();
            return flights;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
}
