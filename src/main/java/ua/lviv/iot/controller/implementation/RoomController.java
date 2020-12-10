package ua.lviv.iot.controller.implementation;


import ua.lviv.iot.model.implementation.Room;
import ua.lviv.iot.service.IGeneralService;
import ua.lviv.iot.service.implementation.GeneralService;
import ua.lviv.iot.service.implementation.RoomService;

public class RoomController extends GeneralController<Room> {

  private final GeneralService<Room> roomService = new RoomService();

  @Override
  public final IGeneralService<Room> getService() {
    return roomService;
  }

}
