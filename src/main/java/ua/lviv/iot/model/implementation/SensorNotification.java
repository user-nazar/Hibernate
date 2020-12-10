package ua.lviv.iot.model.implementation;


import ua.lviv.iot.model.IGeneralModel;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "sensor_notification", schema = "laboratorna5")
public class SensorNotification implements IGeneralModel {


    private static final String tableName = SensorNotification.class.getSimpleName();
    private Integer id;
    private double rangeLevel;
    private double resolutionLevel;
    private SensorNotification thisSystemId;

    public SensorNotification(Integer id, double rangeLevel, double resolutionLevel, SensorNotification thisSystemId) {
        this.id = id;
        this.rangeLevel = rangeLevel;
        this.resolutionLevel = resolutionLevel;
        this.thisSystemId = thisSystemId;
    }

    public SensorNotification() {

    }

    public static String getTableName() {
        return tableName;
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
    @Column(name = "range_level")

    public double getRangeLevel() {
        return rangeLevel;
    }

    public void setRangeLevel(double rangeLevel) {
        this.rangeLevel = rangeLevel;
    }

    @Basic
    @Column(name = "resolution_level")

    public double getResolutionLevel() {
        return resolutionLevel;
    }

    public void setResolutionLevel(double resolutionLevel) {
        this.resolutionLevel = resolutionLevel;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SensorNotification sensorNotification = (SensorNotification) o;
        return Objects.equals(id, sensorNotification.id) &&
                Objects.equals(rangeLevel, sensorNotification.rangeLevel) &&
                Objects.equals(resolutionLevel, sensorNotification.resolutionLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rangeLevel, resolutionLevel);
    }

    @ManyToOne
    @JoinColumn(name = "this_system_id", referencedColumnName = "id", nullable = false)
    public SensorNotification getThisSystemId() {
        return thisSystemId;
    }

    public void setThisSystemId(SensorNotification thisSystemId) {
        this.thisSystemId = thisSystemId;
    }

   
    @Override
    public String toString() {
        return "ObjectAndSecurity{"
                + "id=" + id
                + ", range_level='"
                + rangeLevel
                + ", resolution_level="
                + resolutionLevel
                + ", this_system_id="
                + thisSystemId
                + '}';
    }
}