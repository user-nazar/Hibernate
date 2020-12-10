package ua.lviv.iot.controller.implementation;


import org.hibernate.Session;
import ua.lviv.iot.controller.IGeneralController;
import ua.lviv.iot.model.IGeneralModel;
import ua.lviv.iot.service.IGeneralService;

import java.sql.SQLException;
import java.util.List;

public abstract class GeneralController<T extends IGeneralModel> implements IGeneralController<T> {

    @Override
    public abstract IGeneralService<T> getService();

    @Override
    public final void create(final T entity, final Session session) throws SQLException {
        getService().create(entity, session);
        System.out.println("Entity has been created now");
        System.out.println(entity);
    }

    @Override
    public final void update(final T entity, final Session session) throws SQLException {
        getService().update(entity, session);
        System.out.println("Entity has been updated now");
        System.out.println(entity);
    }

    @Override
    public final void delete(final int id, final Session session) throws SQLException {
        getService().delete(id, session);
        System.out.println("Entity has been deleted now");
    }

    @Override
    public final void getAll(final Session session) throws SQLException {
        List<T> ts = getService().getAll(session);
        for (T t : ts) {
            System.out.println(t);
        }
    }

    @Override
    public final void getById(final int id, final Session session) throws SQLException {
        T t = getService().getById(id, session);
        if (t != null) {
            System.out.println("Entity with id " + id + " found");
            System.out.println(t);
        } else {
            System.out.println("Entity with id " + id + " not found");
        }
    }
}
