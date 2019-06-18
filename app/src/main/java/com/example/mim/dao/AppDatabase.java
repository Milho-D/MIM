package com.example.mim.dao;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.mim.model.ContratLocation;
import com.example.mim.model.EtatDesLieux;

@Database(entities = {ContratLocation.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase
{
    public abstract ContratLocationDao contratLocationDao();
    public abstract EtatDesLieuxDao etatDesLieuxDao();
}
