package ua.lviv.iot.controller.implementation;


import ua.lviv.iot.model.implementation.AccessLevel;
import ua.lviv.iot.service.IGeneralService;
import ua.lviv.iot.service.implementation.AccessLevelService;
import ua.lviv.iot.service.implementation.GeneralService;

public class AccessLevelController extends GeneralController<AccessLevel> {

  private final GeneralService<AccessLevel> accessLevelService = new AccessLevelService();

  @Override
  public final IGeneralService<AccessLevel> getService() {
    return accessLevelService;
  }

}
