package ua.lviv.iot.dao.implementation;


import ua.lviv.iot.model.implementation.Zone;

public class ZoneDao extends GeneralDao<Zone> {
    public final Class<Zone> getClazz() {
        return Zone.class;

    }
}