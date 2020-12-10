package ua.lviv.iot.model.implementation;


import ua.lviv.iot.model.IGeneralModel;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "user", schema = "laboratorna5")
public class User implements IGeneralModel {


    private static final String tableName = User.class.getSimpleName();

    private Integer id;
    private String firstName;
    private String lastName;
    private String country;
    private User thisSystemId;

    public User(Integer id, String firstName, String lastName, String country, User thisSystemId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.thisSystemId = thisSystemId;
    }

    public User() {

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
    @Column(name = "first_name")

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(country, user.country);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, country);
    }

    @ManyToOne
    @JoinColumn(name = "this_system_id", referencedColumnName = "id", nullable = false)
    public User getThisSystemId() {

        return thisSystemId;
    }

    public void setThisSystemId(User thisSystemId) {
        this.thisSystemId = thisSystemId;
    }

    @Override
    public String toString() {
        return "Story{"
                + "id=" + id
                + ", firstName='" + firstName + '\''
                + ", lastName='" + lastName + '\''
                + ", country=" + country + '\''
                + '}';
    }
}