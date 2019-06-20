package com.example.mim.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.mim.model.ContratLocation;

import java.util.List;

@Dao
public interface ContratLocationDao {
    @Query("SELECT * FROM contratlocation")
    LiveData<List<ContratLocation>> getAll();

    @Query("SELECT * FROM contratlocation WHERE id IN (:cIds)")
    LiveData<List<ContratLocation>> loadAllByIds(int[] cIds);

    @Insert
    void insertAll(ContratLocation... contratLocations);

    @Delete
    void delete(ContratLocation contratLocation);

    @Query("DELETE FROM contratlocation")
    void deleteAll();

}
