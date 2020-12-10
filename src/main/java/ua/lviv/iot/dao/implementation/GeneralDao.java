package ua.lviv.iot.dao.implementation;


import org.hibernate.Session;
import org.hibernate.query.Query;
import ua.lviv.iot.dao.IGeneralDao;
import ua.lviv.iot.model.IGeneralModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class GeneralDao<T extends IGeneralModel> implements IGeneralDao<T> {
  public abstract Class<T> getClazz();

  @Override
  public final T getById(final Integer id, final Session session) throws SQLException {
    return (T) session.get(getClazz(), id);
  }

  @Override
  public final List<T> getAll(final Session session) throws SQLException {
    List<T> ts = new ArrayList<>();
    Query query = session.createQuery("from " + getClazz().getSimpleName());
    for (Object obj : query.list()) {
      ts.add((T) obj);
    }
    return ts;
  }

  @Override
  public final void create(final T entity, final Session session) throws SQLException {
    session.beginTransaction();
    session.save(entity);
    session.getTransaction().commit();
  }

  @Override
  public final void update(final T entity, final Session session) throws SQLException {
    session.beginTransaction();
    session.update(entity);
    session.getTransaction().commit();
  }

  @Override
  public final void delete(final Integer id, final Session session) throws SQLException {
    session.beginTransaction();
    Object obj = getById(id, session);
    session.delete(obj);
    session.getTransaction().commit();
  }
}
