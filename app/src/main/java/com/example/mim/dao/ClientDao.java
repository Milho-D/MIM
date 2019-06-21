package com.example.mim.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.mim.model.Client;

import java.util.List;

@Dao
public interface ClientDao {
    @Query("select * from client")
    List<Client> getAll();

    @Query("select * from client where id in (:ids)")
    List<Client> loadAlllByIds(int[] ids);

    @Query("select * from client where nom like :nom")
    Client findByName(String nom);

    @Insert
    long[] insertAll(Client... clients);

    @Delete
    void delete(Client client);

    @Query("DELETE FROM client")
    void deleteAll();
}
