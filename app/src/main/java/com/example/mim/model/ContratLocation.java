package com.example.mim.model;

import java.util.Date;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(
        tableName = "contratlocation",
        foreignKeys = {
            @ForeignKey(
                entity = Client.class,
                parentColumns = "id",
                childColumns = "id_client",
                onDelete = ForeignKey.SET_NULL
            ),
            @ForeignKey(
                entity = Vehicule.class,
                parentColumns = "id",
                childColumns = "id_vehicule",
                onDelete = ForeignKey.SET_NULL
            )},
        indices = {@Index("id"), @Index("id_client"), @Index("id_vehicule")}
    )
public class ContratLocation {
    @ColumnInfo(name="id")
    @PrimaryKey(autoGenerate = true)
    private long id;

    @ColumnInfo(name = "id_client")
    private long idClient;

    @ColumnInfo(name = "id_vehicule")
    private long idVehicule;

    @ColumnInfo(name = "dateEnlevement")
    private Date dateEnlevement;

    @ColumnInfo(name = "dateRestitution")
    private Date dateRestitution;

    @Ignore
    public ContratLocation() {}

    public ContratLocation(long idClient, long idVehicule, Date dateEnlevement, Date dateRestitution) {
        this.idClient = idClient;
        this.idVehicule = idVehicule;
        this.dateEnlevement = dateEnlevement;
        this.dateRestitution = dateRestitution;
    }

    public long getId() { return id;  }

    public void setId(long id) { this.id = id;  }

    public long getIdClient() {return idClient;  }

    public void setIdClient(long idClient) { this.idClient = idClient;  }

    public long getIdVehicule() {  return idVehicule;  }

    public void setIdVehicule(long idVehicule) { this.idVehicule = idVehicule;  }

    public Date getDateEnlevement() { return dateEnlevement;  }

    public void setDateEnlevement(Date dateEnlevement) {  this.dateEnlevement = dateEnlevement; }

    public Date getDateRestitution() { return dateRestitution;  }

    public void setDateRestitution(Date dateRestitution) { this.dateRestitution = dateRestitution; }

    @Override
    public String toString() {
        return "ContratLocation{" +
                "id=" + id +
                ", idClient=" + idClient +
                ", idVehicule=" + idVehicule +
                ", dateEnlevement=" + dateEnlevement +
                ", dateRestitution=" + dateRestitution +
                '}';
    }
}
