import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateP {
    public static void main(String[] args) {
        user userone = new user();
        userone.setEmail("525252@qq.com");
        userone.setPassword("12222");
        userone.setUsername("jame");

        Configuration con = new Configuration().configure().addAnnotatedClass(user.class );

        SessionFactory SF = con.buildSessionFactory();

        Session session = SF.openSession();
        Transaction tx = session.beginTransaction();
        session.save(userone);
        tx.commit();
    }
}
