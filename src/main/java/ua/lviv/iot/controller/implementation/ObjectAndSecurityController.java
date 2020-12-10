package ua.lviv.iot.controller.implementation;


import ua.lviv.iot.model.implementation.ObjectAndSecurity;
import ua.lviv.iot.service.IGeneralService;
import ua.lviv.iot.service.implementation.GeneralService;
import ua.lviv.iot.service.implementation.ObjectAndSecurityService;

public class ObjectAndSecurityController extends GeneralController<ObjectAndSecurity> {

    private final GeneralService<ObjectAndSecurity> securityService = new ObjectAndSecurityService();

    @Override
    public final IGeneralService<ObjectAndSecurity> getService() {
        return securityService;
    }

}