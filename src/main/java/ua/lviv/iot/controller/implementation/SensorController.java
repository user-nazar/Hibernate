package ua.lviv.iot.controller.implementation;


import ua.lviv.iot.model.implementation.Sensor;
import ua.lviv.iot.service.IGeneralService;
import ua.lviv.iot.service.implementation.GeneralService;
import ua.lviv.iot.service.implementation.SensorService;

public class SensorController extends GeneralController<Sensor> {

    private final GeneralService<Sensor> sensorService = new SensorService();

    @Override
    public final IGeneralService<Sensor> getService() {
        return sensorService;
    }

}
