package com.example.mim.model;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

public class ClientEtToutContrat {
    @Embedded
    Client client;

    @Relation(parentColumn = "id",entityColumn = "id_client",entity = ContratLocation.class)
    public List<ContratLocation> contratLocations;
}
