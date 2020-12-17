package ua.lviv.iot.model.implementation;

import ua.lviv.iot.model.IGeneralModel;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "system_control", schema = "laboratorna5")
public class SystemControl implements IGeneralModel {


    private static final String tableName = SystemControl.class.getSimpleName();
    private Integer id;
    private int quantityControlProcessings;

    public SystemControl(Integer id, int quantityControlProcessings) {
        this.id = id;
        this.quantityControlProcessings = quantityControlProcessings;
    }

    public SystemControl() {

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
    @Column(name = "quantity_control_processings")

    public int getQuantityControlProcessings() {
        return quantityControlProcessings;
    }

    public void setQuantityControlProcessings(int quantityControlProcessings) {
        this.quantityControlProcessings = quantityControlProcessings;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemControl systemControl = (SystemControl) o;
        return Objects.equals(id, systemControl.id) &&
                Objects.equals(quantityControlProcessings, systemControl.quantityControlProcessings);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantityControlProcessings);
    }


    @Override
    public String toString() {
        return "SystemControl{"
                + "id=" + id
                + ", quantity_control_processings='"
                + quantityControlProcessings
                + '}';
    }
}