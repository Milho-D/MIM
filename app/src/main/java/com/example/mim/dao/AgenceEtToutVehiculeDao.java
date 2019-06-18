package com.example.mim.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Transaction;

import com.example.mim.model.AgenceEtToutVehicule;
import com.example.mim.model.ClientEtToutContrat;

@Dao
public interface AgenceEtToutVehiculeDao {

    @Transaction
    @Query("select * from agence where id = :idAgence")
    AgenceEtToutVehicule loadAllAgenceVehicules(int idAgence);

}
