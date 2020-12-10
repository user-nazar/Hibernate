package ua.lviv.iot.dao.implementation;


import ua.lviv.iot.model.implementation.SensorNotification;

public class SensorNotificationDao extends GeneralDao<SensorNotification> {
    public final Class<SensorNotification> getClazz() {
        return SensorNotification.class;

    }
}

