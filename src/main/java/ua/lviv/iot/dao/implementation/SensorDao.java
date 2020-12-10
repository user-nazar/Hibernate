package ua.lviv.iot.dao.implementation;


import ua.lviv.iot.model.implementation.Sensor;

public class SensorDao extends GeneralDao<Sensor> {
  public final Class<Sensor> getClazz() {
    return Sensor.class;

  }
}

