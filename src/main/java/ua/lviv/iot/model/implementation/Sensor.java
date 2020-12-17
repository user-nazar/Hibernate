package ua.lviv.iot.model.implementation;


import ua.lviv.iot.model.IGeneralModel;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "sensor", schema = "laboratorna5")
public class Sensor implements IGeneralModel {


    private static final String tableName = Sensor.class.getSimpleName();

    private Integer id;
    private double processingTime;
    private String nameModel;
    private String typeSensor;
    private int calibration;
    private String classification;

    public Sensor(Integer id, double processingTime, String nameModel, String typeSensor, int calibration, String classification) {
        this.id = id;
        this.processingTime = processingTime;
        this.nameModel = nameModel;
        this.typeSensor = typeSensor;
        this.calibration = calibration;
        this.classification = classification;
    }

    public Sensor() {

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
    @Column(name = "processing_time")

    public double getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(double processingTime) {
        this.processingTime = processingTime;
    }


    @Basic
    @Column(name = "name_model")
    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }


    @Basic
    @Column(name = "type_sensor")
    public String getTypeSensor() {
        return typeSensor;
    }

    public void setTypeSensor(String typeSensor) {
        this.typeSensor = typeSensor;
    }

    @Basic
    @Column(name = "calibration")
    public int getCalibration() {
        return calibration;
    }

    public void setCalibration(int calibration) {
        this.calibration = calibration;
    }

    @Basic
    @Column(name = "classification")
    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sensor sensor = (Sensor) o;
        return Objects.equals(id, sensor.id) &&
                Objects.equals(processingTime, sensor.processingTime) &&
                Objects.equals(nameModel, sensor.nameModel) &&
                Objects.equals(typeSensor, sensor.typeSensor) &&
                Objects.equals(calibration, sensor.calibration) &&
                Objects.equals(classification, sensor.classification);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, processingTime, nameModel, calibration, classification);
    }

    @Override
    public String toString() {
        return "Sensor{"
                + "id=" + id
                + "  processing_time=" + processingTime
                + ", name_model='" +  nameModel + '\''
                + ", type_sensor'" + typeSensor + '\''
                + ", calibration=" + calibration
                + ", classification=" + classification + '\''
                + '}';
    }
}