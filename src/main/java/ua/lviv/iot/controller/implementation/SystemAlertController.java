package ua.lviv.iot.controller.implementation;


import ua.lviv.iot.model.implementation.SystemAlert;
import ua.lviv.iot.model.implementation.User;
import ua.lviv.iot.service.IGeneralService;
import ua.lviv.iot.service.implementation.GeneralService;
import ua.lviv.iot.service.implementation.SystemAlertService;
import ua.lviv.iot.service.implementation.UserService;

public class SystemAlertController extends GeneralController<SystemAlert> {

    private final GeneralService<SystemAlert> systemAlertService = new SystemAlertService();

    @Override
    public final IGeneralService<SystemAlert> getService() {
        return systemAlertService;
    }

}
