package com.example.mim.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import com.example.mim.model.EtatDesLieux;

import java.util.List;


@Dao
public interface EtatDesLieuxDao {
    @Query("SELECT * FROM etatdeslieux")
    LiveData<List<EtatDesLieux>> getAll();

    @Query("SELECT * FROM etatdeslieux WHERE id IN (:eIds)")
    LiveData<List<EtatDesLieux>> loadAllByIds(int[] eIds);

    @Insert
    void insertAll(EtatDesLieux... etatDesLieux);

    @Delete
    void delete(EtatDesLieux etatDesLieux);
}
