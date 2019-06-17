package com.example.mim.model;

public class Gerant {

    private int id;
    private String nom;
    private String prenom;
    private String motDePasse;
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
