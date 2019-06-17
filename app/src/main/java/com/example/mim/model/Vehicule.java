package com.example.mim.model;

import android.provider.MediaStore;

import java.util.List;

public class Vehicule {

    private int id;
    private String numeroSerie;
    private String marque;
    private String immatriculation;
    private double prixJour;
    private List<MediaStore.Images.Media> lesPhotosVehicule;
    private boolean etatLocation;
    private ContratLocation leContratLocation;

    private Vehicule() {}

    public Vehicule(int id, String numeroSerie, String marque, String immatriculation, double prixJour, List<MediaStore.Images.Media> lesPhotosVehicule, boolean etatLocation, ContratLocation leContratLocation) {
        this.id = id;
        this.numeroSerie = numeroSerie;
        this.marque = marque;
        this.immatriculation = immatriculation;
        this.prixJour = prixJour;
        this.lesPhotosVehicule = lesPhotosVehicule;
        this.etatLocation = etatLocation;
        this.leContratLocation = leContratLocation;
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

    public List<MediaStore.Images.Media> getLesPhotosVehicule() { return lesPhotosVehicule;  }

    public void setLesPhotosVehicule(List<MediaStore.Images.Media> lesPhotosVehicule) { this.lesPhotosVehicule = lesPhotosVehicule; }

    public boolean isEtatLocation() { return etatLocation;  }

    public void setEtatLocation(boolean etatLocation) { this.etatLocation = etatLocation;  }

    public ContratLocation getLeContratLocation() { return leContratLocation;  }

    public void setLeContratLocation(ContratLocation leContratLocation) { this.leContratLocation = leContratLocation;  }

    @Override
    public String toString() {
        return "Vehicule{" +
                "id=" + id +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", marque='" + marque + '\'' +
                ", immatriculation='" + immatriculation + '\'' +
                ", prixJour=" + prixJour +
                ", lesPhotosVehicule=" + lesPhotosVehicule +
                ", etatLocation=" + etatLocation +
                ", leContratLocation=" + leContratLocation +
                '}';
    }
}
