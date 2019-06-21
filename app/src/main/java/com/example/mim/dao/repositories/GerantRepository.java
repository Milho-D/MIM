package com.example.mim.dao.repositories;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.example.mim.dao.GerantDao;
import com.example.mim.dao.db.AppDatabase;
import com.example.mim.dao.db.Connexion;
import com.example.mim.model.Gerant;

import java.util.List;

public class GerantRepository {

    private GerantDao gerantDao;
    private LiveData<List<Gerant>> allGerants;

    public GerantRepository(Application application) {
        AppDatabase db = Connexion.getConnexion(application);
        gerantDao = db.gerantDao();
        allGerants = gerantDao.getAll();
    }

    /**
     * Récupère tous les gérants dynamiquement
     * @return une liste de tous les gérants
     */
    public LiveData<List<Gerant>> getAllGerants() { return allGerants; }

    public void insert(Gerant gerant) {
        new insertAsyncTask(gerantDao).execute(gerant);
    }

    private static class insertAsyncTask extends AsyncTask<Gerant, Void, Void> {

        private GerantDao gerantDaoAsync;

        insertAsyncTask(GerantDao gerantDao) {
            gerantDaoAsync = gerantDao;
        }

        @Override
        protected Void doInBackground(final Gerant... params) {
            gerantDaoAsync.insertAll(params[0]);
            return null;
        }
    }
}
