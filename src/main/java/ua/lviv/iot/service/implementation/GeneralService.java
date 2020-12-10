package ua.lviv.iot.service.implementation;


import org.hibernate.Session;
import ua.lviv.iot.dao.IGeneralDao;
import ua.lviv.iot.service.IGeneralService;



import java.sql.SQLException;
import java.util.List;

public abstract class GeneralService<T> implements IGeneralService<T> {

  @Override
  public abstract IGeneralDao<T> getDAO();

  @Override
  public List<T> getAll(Session session) throws SQLException {
    return getDAO().getAll(session);
  }

  @Override
  public T getById(Integer id, Session session) throws SQLException {
    return (T) getDAO().getById(id, session);
  }

  @Override
  public void create(T entity, Session session) throws SQLException {
    getDAO().create(entity, session);
  }

  @Override
  public void update(T entity, Session session) throws SQLException {
    getDAO().update(entity, session);
  }

  @Override
  public void delete(Integer id, Session session) throws SQLException {
    getDAO().delete(id, session);
  }
}
