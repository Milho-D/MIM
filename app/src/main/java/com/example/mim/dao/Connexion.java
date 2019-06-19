package com.example.mim.dao;

import android.arch.persistence.room.Room;
import android.content.Context;

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
                    CONNEXION = Room.databaseBuilder(context, AppDatabase.class, "MIM-bdd").build();
                }
            }
        }
        return CONNEXION;
    }
}
