package Entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "equipments", schema = "hibernate", catalog = "")
public class EquipmentsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = true, length = -1)
    private String name;
    @Basic
    @Column(name = "type", nullable = true, length = -1)
    private String type;
    @Basic
    @Column(name = "PASSWORD", nullable = true, length = -1)
    private String password;
    @Basic
    @Column(name = "buying_date", nullable = true)
    private Date buyingDate;
    @Basic
    @Column(name = "maintenance_date", nullable = true)
    private Date maintenanceDate;
    @Basic
    @Column(name = "state", nullable = true, length = -1)
    private String state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBuyingDate() {
        return buyingDate;
    }

    public void setBuyingDate(Date buyingDate) {
        this.buyingDate = buyingDate;
    }

    public Date getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(Date maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EquipmentsEntity that = (EquipmentsEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (buyingDate != null ? !buyingDate.equals(that.buyingDate) : that.buyingDate != null) return false;
        if (maintenanceDate != null ? !maintenanceDate.equals(that.maintenanceDate) : that.maintenanceDate != null)
            return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (buyingDate != null ? buyingDate.hashCode() : 0);
        result = 31 * result + (maintenanceDate != null ? maintenanceDate.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }
}
