package com.example.mim.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.mim.model.ClientEtToutContrat;

@Dao
public interface ClienContratDao {
    @Query("select * from client where id = :idClient")
    ClientEtToutContrat loadAllClientContrat(int idClient);
}
