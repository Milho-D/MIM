package com.example.mim.model;

import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.Index;

import java.util.Date;
import java.util.List;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(
        tableName = "etatdeslieux",
        foreignKeys =
            @ForeignKey(
                    entity = Vehicule.class,
                    parentColumns = "id",
                    childColumns = "id_vehicule",
                    onDelete = ForeignKey.SET_NULL
            ),
        indices = {@Index("id"), @Index("id_vehicule")}
)
public class EtatDesLieux {

    @ColumnInfo(name="id")
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "dateEtatDesLieux")
    private Date dateEtatDesLieux;

    @ColumnInfo(name = "description")
    private String description;

    @ColumnInfo(name = "id_vehicule")
    private int idVehicule;

    @Ignore
    public EtatDesLieux(){}

    public EtatDesLieux(int id, Date dateEtatDesLieux, String description, int idVehicule) {
        this.id = id;
        this.dateEtatDesLieux = dateEtatDesLieux;
        this.description = description;
        this.idVehicule = idVehicule;
    }

    public int getId() { return id;  }

    public void setId(int id) { this.id = id;  }

    public Date getDateEtatDesLieux() { return dateEtatDesLieux;  }

    public void setDateEtatDesLieux(Date dateEtatDesLieux) { this.dateEtatDesLieux = dateEtatDesLieux; }

    public String getDescription() { return description;  }

    public void setDescription(String description) {  this.description = description;  }

    public int getIdVehicule() { return idVehicule;  }

    public void setIdVehicule(int idVehicule) { this.idVehicule = idVehicule;  }

    @Override
    public String toString() {
        return "EtatDesLieux{" +
                "id=" + id +
                ", dateEtatDesLieux=" + dateEtatDesLieux +
                ", description='" + description + '\'' +
                ", idVehicule=" + idVehicule +
                '}';
    }
}
