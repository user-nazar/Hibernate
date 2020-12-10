package ua.lviv.iot.dao.implementation;


import ua.lviv.iot.model.implementation.NotificationSettings;

public class NotificationSettingsDao extends GeneralDao<NotificationSettings> {
    public final Class<NotificationSettings> getClazz() {
        return NotificationSettings.class;

    }
}

