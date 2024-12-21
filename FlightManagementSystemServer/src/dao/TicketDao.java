package dao;

import java.util.List;
import model.Ticket;
import org.hibernate.Session;

/**
 *
 * @author arthur.mugwaneza
 */
public class TicketDao {
    public String AutoTicketNo() {
    try  {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "select max(t.ticketNo) from Ticket t";
        
        String maxTicketNo =(String) session.createQuery(hql).uniqueResult();

        if (maxTicketNo == null) {
            return "TK001";
        }

        Integer id = Integer.parseInt(maxTicketNo.substring(2));
        id++;
        maxTicketNo = String.format("TK%03d", id);

        return maxTicketNo;
    } catch (Exception e) {
        e.printStackTrace();
        return "Server Error";
    }
}

    public String registerTicket(Ticket ticketObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(ticketObj);
            ss.beginTransaction().commit();
            ss.close();
            return "Ticket Registered Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
    }
    public String updateTicket(Ticket ticketObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(ticketObj);
            ss.beginTransaction().commit();
            ss.close();
            return "Ticket updated Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
    }
    public String deleteTicket(Ticket ticketObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(ticketObj);
            ss.beginTransaction().commit();
            ss.close();
            return "Ticket deleted Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
    }
    public Ticket searchTicket(Ticket ticketObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            
            Ticket theticket =(Ticket) ss.get(Ticket.class, ticketObj.getTicketNo());
            
            ss.close();
            return theticket;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Ticket> retrieveTickets(){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Ticket> tickets = ss.createQuery("select theticket from Ticket theticket").list();

            ss.close();
            return tickets;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
}
