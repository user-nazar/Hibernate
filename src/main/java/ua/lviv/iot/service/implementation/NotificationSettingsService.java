package ua.lviv.iot.service.implementation;


import ua.lviv.iot.dao.IGeneralDao;
import ua.lviv.iot.dao.implementation.GeneralDao;
import ua.lviv.iot.dao.implementation.NotificationSettingsDao;
import ua.lviv.iot.model.implementation.NotificationSettings;

public class NotificationSettingsService extends GeneralService<NotificationSettings> {
  private final GeneralDao<NotificationSettings> NOTIFICATION_SETTINGS_DAO = new NotificationSettingsDao();

  @Override
  public IGeneralDao<NotificationSettings> getDAO() {
    return NOTIFICATION_SETTINGS_DAO;
  }
}