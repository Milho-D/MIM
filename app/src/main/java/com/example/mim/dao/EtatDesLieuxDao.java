package com.example.mim.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import com.example.mim.model.ContratLocation;
import com.example.mim.model.EtatDesLieux;

import java.util.List;
@Dao
public interface EtatDesLieuxDao {
    @Query("SELECT * FROM etatdeslieux")
    List<EtatDesLieux> getAll();

    @Query("SELECT * FROM etatdeslieux WHERE id IN (:Ids)")
    List<EtatDesLieux> loadAllByIds(int[] Ids);

    @Insert
    void insertAll(EtatDesLieux... etatDesLieux);

    @Delete
    void delete(EtatDesLieux etatDesLieux);
}
