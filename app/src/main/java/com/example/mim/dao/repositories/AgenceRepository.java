package com.example.mim.dao.repositories;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.example.mim.dao.AgenceDao;
import com.example.mim.dao.AppDatabase;
import com.example.mim.dao.Connexion;
import com.example.mim.model.Agence;

import java.util.List;

public class AgenceRepository {
    private AgenceDao agenceDao;
    private LiveData<List<Agence>> getAllAgence;

    AgenceRepository(Application application){
        AppDatabase db = Connexion.getConnexion(application);
        //Agence
        agenceDao = db.agenceDao();
        getAllAgence = agenceDao.getAll();
    }

    /**
     * toute les agences
     * @return
     */
    public LiveData<List<Agence>> getAllAgence() {
        return getAllAgence;
    }


    public void insert(Agence agence){
        new insertAsync(agenceDao).execute(agence);
    }

    private static class insertAsync extends AsyncTask<Agence,Void,Void> {

        private AgenceDao agenceDaoAsync;

         insertAsync(AgenceDao agenceDao){
            agenceDaoAsync = agenceDao;
        }

        @Override
        protected Void doInBackground(Agence... agences) {
            agenceDaoAsync.insertAll(agences);
            return null;
        }
    }

}
