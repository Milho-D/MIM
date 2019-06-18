package com.example.mim.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.mim.model.Gerant;

import java.util.List;

@Dao
public interface GerantDao {

    @Query("SELECT * FROM gerant")
    List<Gerant> getAllGerants();

    @Query("SELECT * FROM gerant WHERE id IN (:idsGerant)")
    Gerant loadAllGerantsById(int[] idsGerant);

    @Query("SELECT * FROM gerant WHERE prenom Like :prenom AND nom LIKE :nom")
    List<Gerant> findByName(String prenom, String nom);

}
