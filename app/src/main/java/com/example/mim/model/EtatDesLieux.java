package com.example.mim.model;

import android.provider.MediaStore;

import java.util.Date;
import java.util.List;

public class EtatDesLieux {

    private int id;
    private Date dateEtatDesLieux;
    private String description;
    private Vehicule leVehicule;
    private List<MediaStore.Images.Media> lesPhotosEtatDesLieux;

    private EtatDesLieux(){}

    public EtatDesLieux(int id, Date dateEtatDesLieux, String description, Vehicule leVehicule, List<MediaStore.Images.Media> lesPhotosEtatDesLieux) {
        this.id = id;
        this.dateEtatDesLieux = dateEtatDesLieux;
        this.description = description;
        this.leVehicule = leVehicule;
        this.lesPhotosEtatDesLieux = lesPhotosEtatDesLieux;
    }

    public int getId() { return id;  }

    public void setId(int id) { this.id = id;  }

    public Date getDateEtatDesLieux() { return dateEtatDesLieux;  }

    public void setDateEtatDesLieux(Date dateEtatDesLieux) { this.dateEtatDesLieux = dateEtatDesLieux; }

    public String getDescription() { return description;  }

    public void setDescription(String description) {  this.description = description;  }

    public Vehicule getLeVehicule() { return leVehicule;  }

    public void setLeVehicule(Vehicule leVehicule) { this.leVehicule = leVehicule;  }

    public List<MediaStore.Images.Media> getLesPhotosEtatDesLieux() { return lesPhotosEtatDesLieux; }

    public void setLesPhotosEtatDesLieux(List<MediaStore.Images.Media> lesPhotosEtatDesLieux) { this.lesPhotosEtatDesLieux = lesPhotosEtatDesLieux;  }

    @Override
    public String toString() {
        return "EtatDesLieux{" +
                "id=" + id +
                ", dateEtatDesLieux=" + dateEtatDesLieux +
                ", description='" + description + '\'' +
                ", leVehicule=" + leVehicule +
                ", lesPhotosEtatDesLieux=" + lesPhotosEtatDesLieux +
                '}';
    }
}
