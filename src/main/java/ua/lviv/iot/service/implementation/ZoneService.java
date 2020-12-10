package ua.lviv.iot.service.implementation;

import ua.lviv.iot.dao.IGeneralDao;
import ua.lviv.iot.dao.implementation.GeneralDao;
import ua.lviv.iot.dao.implementation.ZoneDao;
import ua.lviv.iot.model.implementation.Zone;

public class ZoneService extends GeneralService<Zone> {
    private final GeneralDao<Zone> ZONE_DAO = new ZoneDao();

    @Override
    public IGeneralDao<Zone> getDAO() {
        return ZONE_DAO;
    }
}