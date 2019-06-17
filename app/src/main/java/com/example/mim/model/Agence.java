package com.example.mim.model;

import java.util.List;

public class Agence {

    private int id;
    private String nom;
    private String adresse;
    private List<Vehicule>  lesVehicules;
    private double chiffreAffaire;
    private Gerant unGerant;

    private Agence() {}

    public Agence(int id, String nom, String adresse, List<Vehicule> lesVehicules, double chiffreAffaire, Gerant unGerant) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.lesVehicules = lesVehicules;
        this.chiffreAffaire = chiffreAffaire;
        this.unGerant = unGerant;
    }

    public int getId() { return id;  }

    public void setId(int id) { this.id = id;  }

    public String getNom() { return nom;  }

    public void setNom(String nom) { this.nom = nom; }

    public String getAdresse() { return adresse;   }

    public void setAdresse(String adresse) { this.adresse = adresse; }

    public List<Vehicule> getLesVehicules() { return lesVehicules; }

    public void setLesVehicules(List<Vehicule> lesVehicules) { this.lesVehicules = lesVehicules; }

    public double getChiffreAffaire() { return chiffreAffaire; }

    public void setChiffreAffaire(double chiffreAffaire) { this.chiffreAffaire = chiffreAffaire; }

    public Gerant getUnGerant() {  return unGerant; }

    public void setUnGerant(Gerant unGerant) { this.unGerant = unGerant; }

    @Override
    public String toString() {
        return "Agence{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", lesVehicules=" + lesVehicules +
                ", chiffreAffaire=" + chiffreAffaire +
                ", unGerant=" + unGerant +
                '}';
    }
}
