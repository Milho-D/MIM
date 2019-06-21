package com.example.mim.dao.repositories;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.example.mim.dao.db.AppDatabase;
import com.example.mim.dao.db.Connexion;
import com.example.mim.dao.VehiculeDao;
import com.example.mim.model.Vehicule;

import java.util.List;

public class VehiculeRepository {

    private VehiculeDao vehiculeDao;
    private LiveData<List<Vehicule>> allVehicules;

    public VehiculeRepository(Application application) {
        AppDatabase db = Connexion.getConnexion(application);
        vehiculeDao = db.vehiculeDao();
        allVehicules = vehiculeDao.getAll();
    }

    /**
     * Récupère tous les véhicules dynamiquement
     * @return une liste de tous les véhicules
     */
    public LiveData<List<Vehicule>> getAllVehicules() { return allVehicules; }

    public void insert(Vehicule vehicule) {
        new insertAsyncTask(vehiculeDao).execute(vehicule);
    }

    private static class insertAsyncTask extends AsyncTask<Vehicule, Void, Void> {

        private VehiculeDao vehiculeDaoAsync;

        insertAsyncTask(VehiculeDao vehiculeDao) {
            vehiculeDaoAsync = vehiculeDao;
        }

        @Override
        protected Void doInBackground(final Vehicule... params) {
            vehiculeDaoAsync.insertAll(params[0]);
            return null;
        }
    }

}
