package com.example.mim.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Gerant {

    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name="nom")
    private String nom;

    @ColumnInfo(name="prenom")
    private String prenom;

    @ColumnInfo(name="motdepasse")
    private String motDePasse;

    @Embedded
    @ColumnInfo(name="uneAgence")
    private Agence uneAgence;

    public Gerant() { }

    public Gerant(int id, String nom, String prenom, String motDePasse, Agence uneAgence) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.motDePasse = motDePasse;
        this.uneAgence = uneAgence;
    }

    public int getId() { return id;  }

    public void setId(int id) { this.id = id;  }

    public String getNom() { return nom;  }

    public void setNom(String nom) { this.nom = nom;  }

    public String getPrenom() { return prenom; }

    public void setPrenom(String prenom) { this.prenom = prenom;  }

    public String getMotDePasse() { return motDePasse;  }

    public void setMotDePasse(String motDePasse) { this.motDePasse = motDePasse; }

    public Agence getUneAgence() {  return uneAgence;  }

    public void setUneAgence(Agence uneAgence) { this.uneAgence = uneAgence; }

    @Override
    public String toString() {
        return "Gerant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", uneAgence=" + uneAgence +
                '}';
    }
}
