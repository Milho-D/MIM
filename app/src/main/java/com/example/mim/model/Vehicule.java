package com.example.mim.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;


@Entity(
        tableName = "vehicule",
        foreignKeys =
                @ForeignKey(
                        entity = Agence.class,
                        parentColumns = "id",
                        childColumns = "id_agence",
                        onDelete = ForeignKey.SET_NULL
                ),
        indices = {@Index("id"), @Index("id_agence")}
)
public class Vehicule implements Parcelable {

    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    private int id;

    @NonNull
    @ColumnInfo(name="numeroSerie")
    private String numeroSerie;

    @NonNull
    @ColumnInfo(name="marque")
    private String marque;

    @NonNull
    @ColumnInfo(name="immatriculation")
    private String immatriculation;

    @ColumnInfo(name="prixJour")
    private double prixJour;

    @ColumnInfo(name="etatLocation")
    private boolean etatLocation;

    @ColumnInfo(name="estRendu")
    private boolean estRendu;

    @ColumnInfo(name="id_agence")
    private int idAgence;

    @Ignore
    public Vehicule() {}

    public Vehicule(String numeroSerie, String marque, String immatriculation, double prixJour, boolean etatLocation, boolean estRendu, int idAgence) {
        this.numeroSerie = numeroSerie;
        this.marque = marque;
        this.immatriculation = immatriculation;
        this.prixJour = prixJour;
        this.etatLocation = etatLocation;
        this.estRendu = estRendu;
        this.idAgence = idAgence;
    }


    protected Vehicule(Parcel in) {
        id = in.readInt();
        numeroSerie = in.readString();
        marque = in.readString();
        immatriculation = in.readString();
        prixJour = in.readDouble();
        etatLocation = in.readByte() != 0;
        estRendu = in.readByte() != 0;
        idAgence = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(numeroSerie);
        dest.writeString(marque);
        dest.writeString(immatriculation);
        dest.writeDouble(prixJour);
        dest.writeByte((byte) (etatLocation ? 1 : 0));
        dest.writeByte((byte) (estRendu ? 1 : 0));
        dest.writeInt(idAgence);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Vehicule> CREATOR = new Creator<Vehicule>() {
        @Override
        public Vehicule createFromParcel(Parcel in) {
            return new Vehicule(in);
        }

        @Override
        public Vehicule[] newArray(int size) {
            return new Vehicule[size];
        }
    };

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

    public int getIdAgence() { return idAgence;  }

    public void setIdAgence(int idAgence) { this.idAgence= idAgence;  }

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
                ", idAgence=" + idAgence+
                '}';
    }
}
