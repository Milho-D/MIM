package com.example.mim.model;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

public class VehiculeEtToutContrat {

    @Embedded
    public Vehicule vehicule;

    @Relation(parentColumn = "id",entityColumn = "id_vehicule",entity = ContratLocation.class)
    public List<ContratLocation> contratsLoc;
}
