package com.example.mim.dao.db;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import com.example.mim.dao.AgenceDao;
import com.example.mim.dao.AgenceEtToutVehiculeDao;
import com.example.mim.dao.ClientContratDao;
import com.example.mim.dao.ClientDao;
import com.example.mim.dao.ContratLocationDao;
import com.example.mim.dao.EtatDesLieuxDao;
import com.example.mim.dao.GerantDao;
import com.example.mim.dao.VehiculeDao;
import com.example.mim.dao.VehiculeEtToutContratDao;
import com.example.mim.model.Agence;
import com.example.mim.model.Client;
import com.example.mim.model.ContratLocation;
import com.example.mim.model.utils.DateConverter;
import com.example.mim.model.EtatDesLieux;
import com.example.mim.model.Gerant;
import com.example.mim.model.Photo;
import com.example.mim.model.Vehicule;

@Database(
        entities = {
            ContratLocation.class,
            EtatDesLieux.class,
            Vehicule.class,
            Gerant.class,
            Agence.class,
            Client.class,
            Photo.class
        },
        version = 5,
        exportSchema = false
)
@TypeConverters(DateConverter.class)
public abstract class AppDatabase extends RoomDatabase
{
    public abstract ContratLocationDao contratLocationDao();
    public abstract EtatDesLieuxDao etatDesLieuxDao();
    public abstract VehiculeDao vehiculeDao();
    public abstract GerantDao gerantDao();
    public abstract AgenceDao agenceDao();
    public abstract ClientDao clientDao();
    public abstract ClientContratDao clientContratDao();
    public abstract AgenceEtToutVehiculeDao agenceEtToutVehiculeDao();
    public abstract VehiculeEtToutContratDao vehiculeEtToutContratDao();



}
