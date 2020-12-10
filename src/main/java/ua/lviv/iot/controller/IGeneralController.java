package ua.lviv.iot.controller;


import org.hibernate.Session;
import ua.lviv.iot.service.IGeneralService;

import java.sql.SQLException;

public interface IGeneralController<T> {

  void create(T entity, Session session) throws SQLException;

  void update(T entity, Session session) throws SQLException;

  void delete(int id, Session session) throws SQLException;

  void getAll(Session session) throws SQLException;

  void getById(int id, Session session) throws SQLException;

  IGeneralService<T> getService();

}
