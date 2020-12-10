package ua.lviv.iot.controller.implementation;


import ua.lviv.iot.model.implementation.SystemControl;
import ua.lviv.iot.model.implementation.User;
import ua.lviv.iot.service.IGeneralService;
import ua.lviv.iot.service.implementation.GeneralService;
import ua.lviv.iot.service.implementation.SystemControlService;
import ua.lviv.iot.service.implementation.UserService;

public class SystemControlController extends GeneralController<SystemControl> {

    private final GeneralService<SystemControl> systemControlService = new SystemControlService();

    @Override
    public final IGeneralService<SystemControl> getService() {
        return systemControlService;
    }

}
