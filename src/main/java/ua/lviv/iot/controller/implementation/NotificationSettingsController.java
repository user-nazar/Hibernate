package ua.lviv.iot.controller.implementation;


;
import ua.lviv.iot.model.implementation.NotificationSettings;
import ua.lviv.iot.service.IGeneralService;
import ua.lviv.iot.service.implementation.GeneralService;
import ua.lviv.iot.service.implementation.NotificationSettingsService;

public class NotificationSettingsController extends GeneralController<NotificationSettings> {

    private final GeneralService<NotificationSettings> notificationSettingsService = new NotificationSettingsService();

    @Override
    public final IGeneralService<NotificationSettings> getService() {
        return notificationSettingsService;
    }

}