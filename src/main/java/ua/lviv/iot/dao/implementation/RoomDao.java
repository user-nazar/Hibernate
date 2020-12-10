package ua.lviv.iot.dao.implementation;


import ua.lviv.iot.model.implementation.Room;

public class RoomDao extends GeneralDao<Room> {
    public final Class<Room> getClazz() {
        return Room.class;

    }
}

