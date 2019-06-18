package com.example.mim.dao;

import android.arch.persistence.room.Room;
import android.content.Context;

/**
 * Created by acoss on 27/03/2018.
 */

public class Connexion
{
    public static AppDatabase getConnexion(Context context)
    {
        return Room.databaseBuilder(context,AppDatabase.class, "database-name").build();
    }
}
