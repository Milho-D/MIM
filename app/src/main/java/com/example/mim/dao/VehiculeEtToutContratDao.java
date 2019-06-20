package com.example.mim.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Transaction;

import com.example.mim.model.VehiculeEtToutContrat;

@Dao
public interface VehiculeEtToutContratDao {

    @Transaction
    @Query("select * from vehicule where id = :idVehicule")
    VehiculeEtToutContrat loadAllVehiculeContrats(int idVehicule);
}
