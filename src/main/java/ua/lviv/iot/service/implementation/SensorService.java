package ua.lviv.iot.service.implementation;

import ua.lviv.iot.dao.IGeneralDao;
import ua.lviv.iot.dao.implementation.GeneralDao;
import ua.lviv.iot.dao.implementation.SensorDao;
import ua.lviv.iot.model.implementation.Sensor;

public class SensorService extends GeneralService<Sensor> {
    private final GeneralDao<Sensor> SENSOR_DAO = new SensorDao();

    @Override
    public IGeneralDao<Sensor> getDAO() {
        return SENSOR_DAO;
    }
}
