package ua.lviv.iot;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.lviv.iot.view.MainView;

public class Main {
    private static final SessionFactory OUR_SESSION_FACTORY;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            OUR_SESSION_FACTORY = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return OUR_SESSION_FACTORY.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        try {
            new MainView(session).show();
        } finally {
            session.close();
        }
    }
}
