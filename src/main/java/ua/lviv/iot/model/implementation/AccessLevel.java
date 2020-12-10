package ua.lviv.iot.model.implementation;


import ua.lviv.iot.model.IGeneralModel;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "access_level", schema = "laboratorna5")
public class AccessLevel implements IGeneralModel {


    private static final String tableName = AccessLevel.class.getSimpleName();
    private Integer id;
    private double rangeSensor;
    private double resolution;

    public AccessLevel(Integer id, double rangeSensor, double resolution) {
        this.id = id;
        this.rangeSensor = rangeSensor;
        this.resolution = resolution;
    }

    public AccessLevel() {

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
    @Column(name = "range_sensor")
    public double getRangeSensor() {
        return rangeSensor;
    }

    public void setRangeSensor(double rangeSensor) {
        this.rangeSensor = rangeSensor;
    }

    @Basic
    @Column(name = "resolution")
    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccessLevel accessLevel = (AccessLevel) o;
        return Objects.equals(id, accessLevel.id) &&
                Objects.equals(rangeSensor, accessLevel.rangeSensor) &&
                Objects.equals(resolution, accessLevel.resolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rangeSensor, resolution);
    }

    @Override
    public String toString() {
        return "AccessLevel{"
                + "id=" + id
                + ", rangeSensor='" + rangeSensor
                + ", resolution=" + resolution
                + '}';
    }
}

