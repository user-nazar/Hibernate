package ua.lviv.iot.service;


import org.hibernate.Session;
import ua.lviv.iot.dao.IGeneralDao;

import java.sql.SQLException;
import java.util.List;


public interface IGeneralService<T> {
  IGeneralDao<T> getDAO();

  List<T> getAll(Session session) throws SQLException;

  T getById(Integer id, Session session) throws SQLException;

  void create(T entity, Session session) throws SQLException;

  void update(T entity, Session session) throws SQLException;

  void delete(Integer id, Session session) throws SQLException;

}