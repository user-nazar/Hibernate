package ua.lviv.iot.model.implementation;


import ua.lviv.iot.dao.implementation.SystemAlertDao;
import ua.lviv.iot.model.IGeneralModel;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "system_alert", schema = "laboratorna5")
public class SystemAlert implements IGeneralModel {


    private static final String tableName = SystemAlert.class.getSimpleName();
    private Integer id;
    private int manyNotifications;
    private String textsNotifications;
    private String aboutProcessings;
    private SystemAlert thisSystemId;

    public SystemAlert(Integer id, int manyNotifications, String textsNotifications, String aboutProcessings, SystemAlert thisSystemId) {
        this.id = id;
        this.manyNotifications = manyNotifications;
        this.textsNotifications = textsNotifications;
        this.aboutProcessings = aboutProcessings;
        this.thisSystemId = thisSystemId;
    }

    public SystemAlert() {

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
    @Column(name = "many_notifications")

    public int getManyNotifications() {
        return manyNotifications;
    }

    public void setManyNotifications(int manyNotifications) {
        this.manyNotifications = manyNotifications;
    }

    @Basic
    @Column(name = "texts_notifications")

    public String getTextsNotifications() {
        return textsNotifications;
    }

    public void setTextsNotifications(String textsNotifications) {
        this.textsNotifications = textsNotifications;
    }

    @Basic
    @Column(name = "about_processings")

    public String getAboutProcessings() {
        return aboutProcessings;
    }

    public void setAboutProcessings(String aboutProcessings) {
        this.aboutProcessings = aboutProcessings;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       SystemAlert systemAlert = (SystemAlert) o;
        return Objects.equals(id, systemAlert.id) &&
                Objects.equals(manyNotifications, systemAlert.manyNotifications) &&
                Objects.equals(textsNotifications, systemAlert.textsNotifications) &&
                Objects.equals(aboutProcessings, systemAlert.aboutProcessings);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, manyNotifications, textsNotifications, aboutProcessings);
    }

    @ManyToOne
    @JoinColumn(name = "system_id", referencedColumnName = "id", nullable = false)
    public SystemAlert getThisSystemId() {
        return thisSystemId;
    }

    public void setThisSystemId(SystemAlert thisSystemId) {
        this.thisSystemId = thisSystemId;
    }


    @Override
    public String toString() {
        return "SystemAlert{"
                + "id=" + id
                + ", many_notifications='"
                + manyNotifications
                + ", texts_notifications="
                + textsNotifications + '\''
                + ", about_processings="
                + aboutProcessings + '\''
                + ", this_system_id="
                + thisSystemId
                + '}';
    }
}