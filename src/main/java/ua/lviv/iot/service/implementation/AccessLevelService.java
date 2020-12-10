package ua.lviv.iot.service.implementation;


import ua.lviv.iot.dao.IGeneralDao;
import ua.lviv.iot.dao.implementation.AccessLevelDao;
import ua.lviv.iot.dao.implementation.GeneralDao;
import ua.lviv.iot.model.implementation.AccessLevel;

public class AccessLevelService extends GeneralService<AccessLevel> {
    private final GeneralDao<AccessLevel> ACCESS_LEVEL_DAO = new AccessLevelDao();

    @Override
    public IGeneralDao<AccessLevel> getDAO() {
        return ACCESS_LEVEL_DAO;
    }
}
