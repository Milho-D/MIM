package com.example.mim.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(
        tableName = "agence",
        foreignKeys =
            @ForeignKey(
                    entity = Gerant.class,
                    parentColumns = "id",
                    childColumns = "id_gerant",
                    onDelete = ForeignKey.SET_NULL
            ),
        indices = {@Index("id"), @Index("id_gerant")}
)
public class Agence {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "nom")
    private String nom;
    @ColumnInfo(name = "adresse")
    private String adresse;
    @ColumnInfo(name = "chiffreAffaire")
    private double chiffreAffaire;
    @ColumnInfo(name = "id_gerant")
    private int idGerant;

    @Ignore
    public Agence() {}

    public Agence(int id, String nom, String adresse, double chiffreAffaire, int idGerant) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;

        this.chiffreAffaire = chiffreAffaire;
        this.idGerant = idGerant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public int getIdGerant() {
        return idGerant;
    }

    public void setIdGerant(int idGerant) {
        this.idGerant = idGerant;
    }

    @Override
    public String toString() {
        return "Agence{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", chiffreAffaire=" + chiffreAffaire +
                ", idGerant=" + idGerant +
                '}';
    }
}
