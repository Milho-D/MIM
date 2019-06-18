package com.example.mim.model;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Relation;

import java.util.List;


public class AgenceEtToutVehicule {

    @Embedded
    public Agence agence;

    @Relation(parentColumn = "id", entityColumn = "id_agence",entity = Vehicule.class)
    public List<Vehicule> vehicules;
}
