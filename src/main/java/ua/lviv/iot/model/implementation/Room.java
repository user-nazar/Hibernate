package ua.lviv.iot.model.implementation;


import ua.lviv.iot.model.IGeneralModel;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "room", schema = "laboratorna5")
public class Room implements IGeneralModel {


    private static final String tableName = Room.class.getSimpleName();

    private Integer id;
    private String nameRoom;
    private double square;

    public Room(Integer id, String nameRoom, double square) {
        this.id = id;
        this.nameRoom = nameRoom;
        this.square = square;
    }

    public Room() {

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
    @Column(name = "name_room")

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    @Basic
    @Column(name = "square")

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       Room room = (Room) o;
        return Objects.equals(id, room.id) &&
                Objects.equals(nameRoom, room.nameRoom) &&
                Objects.equals(square, room.square);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameRoom, square);
    }


    @Override
    public String toString() {
        return "Room{"
                + "id=" + id
                + ", name_room='"
                + nameRoom + '\''
                + ", square="
                + square
                + '}';
    }
}