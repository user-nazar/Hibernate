package ua.lviv.iot.dao.implementation;


import ua.lviv.iot.model.implementation.SystemAlert;

public class SystemAlertDao extends GeneralDao<SystemAlert> {
  public final Class<SystemAlert> getClazz() {
    return SystemAlert.class;

  }
}