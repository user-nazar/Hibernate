package ua.lviv.iot.controller.implementation;


import ua.lviv.iot.model.implementation.SensorSettings;
import ua.lviv.iot.service.IGeneralService;
import ua.lviv.iot.service.implementation.GeneralService;
import ua.lviv.iot.service.implementation.SensorSettingsService;

public class SensorSettingsController extends GeneralController<SensorSettings> {

    private final GeneralService<SensorSettings> sensorSettingsService = new SensorSettingsService();

    @Override
    public final IGeneralService<SensorSettings> getService() {
        return sensorSettingsService;
    }

}
