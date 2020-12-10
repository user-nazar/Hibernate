package ua.lviv.iot.service.implementation;

import ua.lviv.iot.dao.IGeneralDao;
import ua.lviv.iot.dao.implementation.GeneralDao;
import ua.lviv.iot.dao.implementation.SystemControlDao;
import ua.lviv.iot.model.implementation.SystemControl;

public class SystemControlService extends GeneralService<SystemControl> {
    private final GeneralDao<SystemControl> SYSTEM_CONTROL_DAO = new SystemControlDao();

    @Override
    public IGeneralDao<SystemControl> getDAO() {
        return SYSTEM_CONTROL_DAO;
    }
}
