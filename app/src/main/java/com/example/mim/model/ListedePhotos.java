package com.example.mim.model;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

public class ListedePhotos {

    @Embedded
    Vehicule vehicule;

    @Embedded
    EtatDesLieux etatDesLieux;

    @Relation(parentColumn = "id", entityColumn = "id_vehicule", entity = Photo.class)
    public List<Photo> lesPhotosDeVehicule;


    @Relation(parentColumn = "id",entityColumn = "id_etatDesLieux", entity = Photo.class)
    public List<Photo> lesPhotoDEtatDesLieux;
}
