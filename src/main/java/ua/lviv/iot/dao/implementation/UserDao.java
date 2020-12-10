package ua.lviv.iot.dao.implementation;


import ua.lviv.iot.model.implementation.User;

public class UserDao extends GeneralDao<User> {
  public final Class<User> getClazz() {
    return User.class;

  }
}