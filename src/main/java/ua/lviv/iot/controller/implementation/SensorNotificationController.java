package ua.lviv.iot.controller.implementation;


import ua.lviv.iot.model.implementation.SensorNotification;
import ua.lviv.iot.model.implementation.User;
import ua.lviv.iot.service.IGeneralService;
import ua.lviv.iot.service.implementation.GeneralService;
import ua.lviv.iot.service.implementation.SensorNotificationService;
import ua.lviv.iot.service.implementation.UserService;

public class SensorNotificationController extends GeneralController<SensorNotification> {

  private final GeneralService<SensorNotification> sensorNotificationService = new SensorNotificationService();

  @Override
  public final IGeneralService<SensorNotification> getService() {
    return sensorNotificationService;
  }

}
