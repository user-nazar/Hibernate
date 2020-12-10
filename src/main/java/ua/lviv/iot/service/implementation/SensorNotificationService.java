package ua.lviv.iot.service.implementation;


import ua.lviv.iot.dao.IGeneralDao;
import ua.lviv.iot.dao.implementation.GeneralDao;
import ua.lviv.iot.dao.implementation.SensorNotificationDao;
import ua.lviv.iot.model.implementation.SensorNotification;

public class SensorNotificationService extends GeneralService<SensorNotification> {
    private final GeneralDao<SensorNotification> SENSOR_NOTIFICATION_DAO = new SensorNotificationDao();

    @Override
    public IGeneralDao<SensorNotification> getDAO() {
        return SENSOR_NOTIFICATION_DAO;
    }
}
