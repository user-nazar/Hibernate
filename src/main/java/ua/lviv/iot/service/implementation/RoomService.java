package ua.lviv.iot.service.implementation;

import ua.lviv.iot.dao.IGeneralDao;
import ua.lviv.iot.dao.implementation.GeneralDao;
import ua.lviv.iot.dao.implementation.RoomDao;
import ua.lviv.iot.model.implementation.Room;

public class RoomService extends GeneralService<Room> {
    private final GeneralDao<Room> ROOM_DAO = new RoomDao();

    @Override
    public IGeneralDao<Room> getDAO() {
        return ROOM_DAO;
    }
}
