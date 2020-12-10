package ua.lviv.iot.dao.implementation;


import ua.lviv.iot.model.implementation.ObjectAndSecurity;

public class ObjectAndSecurityDao extends GeneralDao<ObjectAndSecurity> {
    public final Class<ObjectAndSecurity> getClazz() {
        return ObjectAndSecurity.class;

    }
}