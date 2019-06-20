package com.example.mim.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.mim.model.Agence;
import com.example.mim.model.Vehicule;

import java.util.List;

@Dao
public interface VehiculeDao {

    @Query("SELECT * FROM vehicule")
    LiveData<List<Vehicule>> getAll();

    @Query("SELECT * FROM vehicule WHERE id = :idsVehicule LIMIT 1")
    Vehicule loadAllVehiculesById(int[] idsVehicule);

    @Query("SELECT * FROM vehicule WHERE numeroSerie LIKE :vNumeroSerie")
    List<Vehicule> findByNumeroSerie(String vNumeroSerie);

    @Query("SELECT * FROM vehicule WHERE marque LIKE :vMarque")
    List<Vehicule> findByMarque(String vMarque);

    @Query("SELECT * FROM vehicule WHERE immatriculation LIKE :vImmatriculation LIMIT 1")
    Vehicule findByImmatriculation(String vImmatriculation);

    @Query("SELECT * FROM vehicule WHERE id = :vehiculeId AND etatLocation = :vehiculeLoue")
    List<Vehicule> findByEtatLocation(int vehiculeId, boolean vehiculeLoue);

    @Query("SELECT * FROM vehicule WHERE id = :vehiculeId AND estRendu = :vehiculeEstRendu")
    Vehicule findByVehiculeRendu(int vehiculeId, boolean vehiculeEstRendu);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(Vehicule... vehicules);

    @Delete
    void delete(Vehicule vehicule);

    @Query("DELETE FROM vehicule")
    void deleteAll();
}
