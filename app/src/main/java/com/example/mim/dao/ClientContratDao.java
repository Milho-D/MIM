package com.example.mim.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Transaction;

import com.example.mim.model.ClientEtToutContrat;

@Dao
public interface ClientContratDao {

    @Transaction
    @Query("select * from client where id = :idClient")
    ClientEtToutContrat loadAllClientContrat(int idClient);
}
