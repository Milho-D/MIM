package com.example.mim.model;

import java.util.List;

public class Client {

    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private int telephone;
    private String email;
    private List<ContratLocation> lesContratsLocation;

    private Client() {}

    public Client(int id, String nom, String prenom, String adresse, int telephone, String email, List<ContratLocation> lesContratsLocation) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.lesContratsLocation = lesContratsLocation;
    }

    public int getId() { return id;  }

    public void setId(int id) { this.id = id;  }

    public String getNom() { return nom;  }

    public void setNom(String nom) { this.nom = nom;  }

    public String getPrenom() {  return prenom;  }

    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getAdresse() { return adresse;  }

    public void setAdresse(String adresse) { this.adresse = adresse; }

    public int getTelephone() { return telephone; }

    public void setTelephone(int telephone) { this.telephone = telephone; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public List<ContratLocation> getLesContratsLocation() {  return lesContratsLocation; }

    public void setLesContratsLocation(List<ContratLocation> lesContratsLocation) { this.lesContratsLocation = lesContratsLocation; }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone=" + telephone +
                ", email='" + email + '\'' +
                ", lesContratsLocation=" + lesContratsLocation +
                '}';
    }
}
