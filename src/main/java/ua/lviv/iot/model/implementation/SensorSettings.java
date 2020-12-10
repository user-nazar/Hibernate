package ua.lviv.iot.model.implementation;


import ua.lviv.iot.model.IGeneralModel;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "sensor_settings", schema = "laboratorna5")
public class SensorSettings implements IGeneralModel {


    private static final String tableName = SensorSettings.class.getSimpleName();
    private Integer id;
    private double sensorRange;
    private double sensorResolution;
    private SensorSettings thisSystemId;

    public SensorSettings(Integer id, double sensorRange, double sensorResolution, SensorSettings thisSystemId) {
        this.id = id;
        this.sensorRange = sensorRange;
        this.sensorResolution = sensorResolution;
        this.thisSystemId = thisSystemId;
    }

    public SensorSettings() {

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
    @Column(name = "sensor_range")

    public double getSensorRange() {
        return sensorRange;
    }

    public void setSensorRange(double sensorRange) {
        this.sensorRange = sensorRange;
    }

    @Basic
    @Column(name = "sensor_resolution")

    public double getSensorResolution() {
        return sensorResolution;
    }

    public void setSensorResolution(double sensorResolution) {
        this.sensorResolution = sensorResolution;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SensorSettings sensorSettings = ( SensorSettings) o;
        return Objects.equals(id, sensorSettings.id) &&
                Objects.equals(sensorRange, sensorSettings.sensorRange) &&
                Objects.equals(sensorResolution, sensorSettings.sensorResolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sensorRange, sensorResolution);
    }

    @ManyToOne
    @JoinColumn(name = "system_id", referencedColumnName = "id", nullable = false)
    public SensorSettings getThisSystemId() {
        return thisSystemId;
    }

    public void setThisSystemId(SensorSettings thisSystemId) {
        this.thisSystemId = thisSystemId;
    }


    @Override
    public String toString() {
        return "ObjectAndSecurity{"
                + "id=" + id
                + ", sensor_range='"
                + sensorRange
                + ", sensor_resolution="
                + sensorResolution
                + ", this_system_id="
                + thisSystemId
                + '}';
    }
}