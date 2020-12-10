package ua.lviv.iot.controller.implementation;


import ua.lviv.iot.model.implementation.Zone;
import ua.lviv.iot.service.IGeneralService;
import ua.lviv.iot.service.implementation.GeneralService;
import ua.lviv.iot.service.implementation.ZoneService;

public class ZoneController extends GeneralController<Zone> {

    private final GeneralService<Zone> zoneService = new ZoneService();

    @Override
    public final IGeneralService<Zone> getService() {
        return zoneService;
    }

}
