package ua.lviv.iot.service.implementation;


import ua.lviv.iot.dao.IGeneralDao;
import ua.lviv.iot.dao.implementation.GeneralDao;
import ua.lviv.iot.dao.implementation.ObjectAndSecurityDao;
import ua.lviv.iot.model.implementation.ObjectAndSecurity;


public class ObjectAndSecurityService extends GeneralService<ObjectAndSecurity> {
    private final GeneralDao<ObjectAndSecurity> OBJECT_AND_SECURITY_DAO = new ObjectAndSecurityDao();

    @Override
    public IGeneralDao<ObjectAndSecurity> getDAO() {
        return OBJECT_AND_SECURITY_DAO;
    }
}