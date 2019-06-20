package com.example.mim.dao.repositories;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.example.mim.dao.AppDatabase;
import com.example.mim.dao.Connexion;
import com.example.mim.dao.EtatDesLieuxDao;
import com.example.mim.model.EtatDesLieux;

import java.util.List;


public class EtatDesLieuxRepository {

    private EtatDesLieuxDao etatDesLieuxDao;
    private LiveData<List<EtatDesLieux>> getAllEtatDesLieux;

    public EtatDesLieuxRepository(Application application){
        AppDatabase db = Connexion.getConnexion(application);
        etatDesLieuxDao = db.etatDesLieuxDao();
        getAllEtatDesLieux = etatDesLieuxDao.getAll();
    }


    public LiveData<List<EtatDesLieux>> getAllEtatDesLieux() {
        return getAllEtatDesLieux;
    }


    public void insert(EtatDesLieux etatDesLieux){
        new insertAsync(etatDesLieuxDao).execute(etatDesLieux);
    }

    private static class insertAsync extends AsyncTask<EtatDesLieux,Void,Void> {

        private EtatDesLieuxDao etatDesLieuxDaosync;
        insertAsync(EtatDesLieuxDao etatDesLieuxDao){
            etatDesLieuxDaosync = etatDesLieuxDao ;
        }

        @Override
        protected Void doInBackground(EtatDesLieux... etatDesLieuxes) {
            etatDesLieuxDaosync.insertAll(etatDesLieuxes);
            return null;
        }
    }
}
