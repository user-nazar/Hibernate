package ua.lviv.iot.service.implementation;


import ua.lviv.iot.dao.IGeneralDao;
import ua.lviv.iot.dao.implementation.GeneralDao;
import ua.lviv.iot.dao.implementation.SensorSettingsDao;
import ua.lviv.iot.model.implementation.SensorSettings;

public class SensorSettingsService extends GeneralService<SensorSettings> {
    private final GeneralDao<SensorSettings> SENSOR_SETTINGS_DAO = new SensorSettingsDao();

    @Override
    public IGeneralDao<SensorSettings> getDAO() {
        return SENSOR_SETTINGS_DAO;
    }
}
