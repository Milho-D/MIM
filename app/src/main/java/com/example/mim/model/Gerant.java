package com.example.mim.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(
        tableName = "gerant",
        foreignKeys =
        @ForeignKey(
                entity = Agence.class,
                parentColumns = "id",
                childColumns = "id_agence",
                onDelete = ForeignKey.SET_NULL
        ),
        indices = {@Index("id"),@Index("id_agence")}
)
public class Gerant {

    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    private long id;

    @ColumnInfo(name="nom")
    private String nom;

    @ColumnInfo(name="prenom")
    private String prenom;

    @ColumnInfo(name="motdepasse")
    private String motDePasse;

    @ColumnInfo(name="id_agence")
    private long idAgence;

    @Ignore
    public Gerant() {}

    public Gerant(String nom, String prenom, String motDePasse, long idAgence) {
        this.nom = nom;
        this.prenom = prenom;
        this.motDePasse = motDePasse;
        this.idAgence = idAgence;
    }

    public long getId() { return id;  }

    public void setId(long id) { this.id = id;  }

    public String getNom() { return nom;  }

    public void setNom(String nom) { this.nom = nom;  }

    public String getPrenom() { return prenom; }

    public void setPrenom(String prenom) { this.prenom = prenom;  }

    public String getMotDePasse() { return motDePasse;  }

    public void setMotDePasse(String motDePasse) { this.motDePasse = motDePasse; }

    public long getIdAgence() {  return idAgence;  }

    public void setIdAgence(long idAgence) { this.idAgence = idAgence; }

    @Override
    public String toString() {
        return "Gerant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", idAgence=" + idAgence +
                '}';
    }
}
