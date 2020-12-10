package ua.lviv.iot.dao.implementation;


import ua.lviv.iot.model.implementation.SensorSettings;

public class SensorSettingsDao extends GeneralDao<SensorSettings> {
    public final Class<SensorSettings> getClazz() {
        return SensorSettings.class;

    }
}

