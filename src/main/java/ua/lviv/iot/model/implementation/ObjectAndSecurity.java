package ua.lviv.iot.model.implementation;


import ua.lviv.iot.model.IGeneralModel;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "object_and_security", schema = "laboratorna5")
public class ObjectAndSecurity implements IGeneralModel {


    private static final String tableName = ObjectAndSecurity.class.getSimpleName();

    private Integer id;
    private String location;

    public ObjectAndSecurity(Integer id, String location) {
        this.id = id;
        this.location = location;
    }

    public ObjectAndSecurity() {

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
    @Column(name = "location")

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectAndSecurity objectAndSecurity = (ObjectAndSecurity) o;
        return Objects.equals(id, objectAndSecurity.id) &&
                Objects.equals(location, objectAndSecurity.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, location);
    }


    @Override
    public String toString() {
        return "ObjectAndSecurity{"
                + "id=" + id
                + ", location='"
                + location + '\''
                + '}';
    }
}