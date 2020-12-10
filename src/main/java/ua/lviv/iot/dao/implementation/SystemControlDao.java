package ua.lviv.iot.dao.implementation;


import ua.lviv.iot.model.implementation.SystemControl;


public class SystemControlDao extends GeneralDao<SystemControl> {
    public final Class<SystemControl> getClazz() {
        return SystemControl.class;

    }
}