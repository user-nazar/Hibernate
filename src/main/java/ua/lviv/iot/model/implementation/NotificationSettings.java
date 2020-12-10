package ua.lviv.iot.model.implementation;


import ua.lviv.iot.model.IGeneralModel;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "notification_settings", schema = "laboratorna5")
public class NotificationSettings implements IGeneralModel {


  public static String getTableName() {
    return tableName;
  }

  private static final String tableName = NotificationSettings.class.getSimpleName();

  private Integer id;
  private double controlAccessLevel;
  private NotificationSettings thisSystemId;

  public NotificationSettings(Integer id, double controlAccessLevel, NotificationSettings thisSystemId) {
    this.id = id;
    this.controlAccessLevel = controlAccessLevel;
    this.thisSystemId = thisSystemId;
  }

  public NotificationSettings() {

  }


  @Id
  @Column(name = "id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Basic
  @Column(name = "control_access_level")
  public double getControlAccessLevel() {
    return controlAccessLevel;
  }

  public void setControlAccessLevel(double controlAccessLevel) {
    this.controlAccessLevel = controlAccessLevel;
  }




  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NotificationSettings notificationSettings = (NotificationSettings) o;
    return Objects.equals(id, notificationSettings.id) &&
            Objects.equals(controlAccessLevel, notificationSettings.controlAccessLevel) &&
            Objects.equals(thisSystemId, notificationSettings.thisSystemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, controlAccessLevel, thisSystemId);
  }

  @ManyToOne
  @JoinColumn(name = "system_id", referencedColumnName = "id", nullable = false)
  public NotificationSettings getThisSystemId() {
    return thisSystemId;
  }

  public void setThisSystemId(NotificationSettings thisSystemId) {
    this.thisSystemId = thisSystemId;
  }

  @Override
  public String toString() {
    return "NotificationSettings{"
            + "id=" + id
            + ", control_access_level=" + controlAccessLevel
            + ", this_system_id=" + thisSystemId
            + '}';
  }
}
