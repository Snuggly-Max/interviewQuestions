import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class q6 {
    public static void main(String[] args) {
        //用Hibernate 实现分页
        user userone = new user();
        userone.setEmail("525252@qq.com");
        userone.setPassword("12222");
        userone.setUsername("jame");

        //setUpagePage
        page myPage = new page(3,1);
        Integer rowsPerPage = myPage.getRowsPerPage();
        Integer currentPage = myPage.getCurrentPage();

        Configuration con = new Configuration().configure().addAnnotatedClass(user.class );

        SessionFactory SF = con.buildSessionFactory();

        Session session = SF.openSession();
        Transaction tx = session.beginTransaction();



        Query q = session.createQuery("SELECT password FROM user");
        q.setFirstResult(4);                                           //where to start fetching
        q.setMaxResults(5);                                            //amount to fetch at a time
        List l = q.list();

        System.out.println("the result is " +l);
        tx.commit();
    }
}
