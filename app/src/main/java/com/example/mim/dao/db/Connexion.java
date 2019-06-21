package com.example.mim.dao.db;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

import com.example.mim.dao.VehiculeDao;
import com.example.mim.model.Vehicule;


/**
 * Created by acoss on 27/03/2018.
 */

public class Connexion {

    private static volatile AppDatabase CONNEXION;

    /**
     *singleton de la connexion
     *Evite d'avoir plusieur instance ouverte
     * @param context
     * @return CONNEXION
     */
    public static AppDatabase getConnexion(final Context context) {
        if (CONNEXION == null){
            synchronized (AppDatabase.class){
                if (CONNEXION == null){
                    CONNEXION = Room.databaseBuilder(context, AppDatabase.class, "MIM-bdd")
                            .fallbackToDestructiveMigration()
                            .addCallback(appDatabaseCallback)
                            .build();
                }
            }
        }
        return CONNEXION;
    }

    private static AppDatabase.Callback appDatabaseCallback =
            new RoomDatabase.Callback() {

        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);
            new PopulateDbAsync(CONNEXION).execute();
        }
    };

}
