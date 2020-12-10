package ua.lviv.iot.service.implementation;


import ua.lviv.iot.dao.IGeneralDao;
import ua.lviv.iot.dao.implementation.GeneralDao;
import ua.lviv.iot.dao.implementation.UserDao;
import ua.lviv.iot.model.implementation.User;

public class UserService extends GeneralService<User> {
  private final GeneralDao<User> USER_DAO = new UserDao();

  @Override
  public IGeneralDao<User> getDAO() {
    return USER_DAO;
  }
}
