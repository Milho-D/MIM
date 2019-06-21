package com.example.mim.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import com.example.mim.model.Gerant;

import java.util.List;

@Dao
public interface GerantDao {

    @Query("SELECT * FROM gerant ORDER BY nom ASC")
    LiveData<List<Gerant>> getAll();

    @Query("SELECT * FROM gerant WHERE id IN (:idsGerant)")
    Gerant loadAllGerantsById(int[] idsGerant);

    @Query("SELECT * FROM gerant WHERE prenom Like :prenom AND nom LIKE :nom")
    List<Gerant> findByName(String prenom, String nom);


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long[] insertAll(Gerant... gerants);

    @Delete
    void delete(Gerant gerant);

    @Query("DELETE FROM gerant")
    void deleteAll();

}
