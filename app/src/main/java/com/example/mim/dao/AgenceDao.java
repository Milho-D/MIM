package com.example.mim.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.mim.model.Agence;

import java.util.List;

@Dao
public interface AgenceDao {
@Query("select * from agence")
List<Agence> getAll();

@Query("select * from agence where id in (:ids)")
    List<Agence> loadAlllByIds(int[] ids);

@Query("select * from agence where nom like :nom")
Agence findByName(String nom);

@Insert
void  insertAll(Agence... agences);

@Delete
    void delete(Agence agence);
}
