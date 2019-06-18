package com.example.mim.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import java.util.List;

@Entity(
        tableName = "vehicule",
        foreignKeys =
                @ForeignKey(
                        entity = ContratLocation.class,
                        parentColumns = "id",
                        childColumns = "id_contratLocation",
                        onDelete = ForeignKey.SET_NULL
                ),
        indices = {@Index("id"), @Index("id_contratLocation")}
)
public class Vehicule {

    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name="numeroSerie")
    private String numeroSerie;

    @ColumnInfo(name="marque")
    private String marque;

    @ColumnInfo(name="immatriculation")
    private String immatriculation;

    @ColumnInfo(name="prixJour")
    private double prixJour;

    @ColumnInfo(name="etatLocation")
    private boolean etatLocation;

    @ColumnInfo(name="estRendu")
    private boolean estRendu;

    @ColumnInfo(name="id_contratLocation")
    private int idContratLocation;

    @Ignore
    public Vehicule() {}

    public Vehicule(String numeroSerie, String marque, String immatriculation, double prixJour, boolean etatLocation, int idContratLocation) {
        this.numeroSerie = numeroSerie;
        this.marque = marque;
        this.immatriculation = immatriculation;
        this.prixJour = prixJour;
        this.etatLocation = etatLocation;
        this.idContratLocation = idContratLocation;
    }

    public int getId() {  return id;  }

    public void setId(int id) { this.id = id; }

    public String getNumeroSerie() { return numeroSerie;  }

    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie;  }

    public String getMarque() { return marque;  }

    public void setMarque(String marque) { this.marque = marque;  }

    public String getImmatriculation() { return immatriculation;  }

    public void setImmatriculation(String immatriculation) { this.immatriculation = immatriculation;  }

    public double getPrixJour() { return prixJour; }

    public void setPrixJour(double prixJour) { this.prixJour = prixJour;  }

    public boolean isEtatLocation() { return etatLocation;  }

    public void setEtatLocation(boolean etatLocation) { this.etatLocation = etatLocation;  }

    public boolean isEstRendu() { return estRendu;  }

    public void setEstRendu(boolean estRendu) { this.estRendu = estRendu;  }

    public int getIdContratLocation() { return idContratLocation;  }

    public void setIdContratLocation(int idContratLocation) { this.idContratLocation = idContratLocation;  }

    @Override
    public String toString() {
        return "Vehicule{" +
                "id=" + id +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", marque='" + marque + '\'' +
                ", immatriculation='" + immatriculation + '\'' +
                ", prixJour=" + prixJour +
                ", etatLocation=" + etatLocation +
                ", estRendu=" + estRendu +
                ", idContratLocation=" + idContratLocation +
                '}';
    }
}
