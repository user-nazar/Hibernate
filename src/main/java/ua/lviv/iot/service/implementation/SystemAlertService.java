package ua.lviv.iot.service.implementation;

import ua.lviv.iot.dao.IGeneralDao;
import ua.lviv.iot.dao.implementation.GeneralDao;
import ua.lviv.iot.dao.implementation.SystemAlertDao;
import ua.lviv.iot.model.implementation.SystemAlert;

public class SystemAlertService extends GeneralService<SystemAlert> {
    private final GeneralDao<SystemAlert> SYSTEM_ALERT_DAO = new SystemAlertDao();

    @Override
    public IGeneralDao<SystemAlert> getDAO() {
        return SYSTEM_ALERT_DAO;
    }
}
