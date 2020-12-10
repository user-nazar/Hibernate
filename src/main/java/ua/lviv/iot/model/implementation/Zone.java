package ua.lviv.iot.model.implementation;


import ua.lviv.iot.model.IGeneralModel;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "zone", schema = "laboratorna5")
public class Zone implements IGeneralModel {


    private static final String tableName = Zone.class.getSimpleName();
    private Integer id;
    private int quantityRooms;
    private double levelRange;

    public Zone(Integer id, int quantityRooms, double levelRange) {
        this.id = id;
        this.quantityRooms = quantityRooms;
        this.levelRange = levelRange;
    }

    public Zone() {

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
    @Column(name = "quantity_rooms")

    public int getQuantityRooms() {
        return quantityRooms;
    }

    public void setQuantityRooms(int quantityRooms) {
        this.quantityRooms = quantityRooms;
    }

    @Basic
    @Column(name = "level_range")

    public double getLevelRange() {
        return levelRange;
    }

    public void setLevelRange(double levelRange) {
        this.levelRange = levelRange;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zone zone = (Zone) o;
        return Objects.equals(id, zone.id) &&
                Objects.equals(quantityRooms, zone.quantityRooms) &&
                 Objects.equals(levelRange, zone.levelRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantityRooms);
    }


    @Override
    public String toString() {
        return "Zone{"
                + "id=" + id
                + ", quantity_rooms='"
                + quantityRooms
                + ", level_range='"
                + levelRange
                + '}';
    }
}