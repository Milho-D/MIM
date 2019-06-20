package com.example.mim.dao.repositories;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.example.mim.dao.AppDatabase;
import com.example.mim.dao.Connexion;
import com.example.mim.dao.ContratLocationDao;
import com.example.mim.model.ContratLocation;
import java.util.List;

public class ContratLocationRepository {

    private ContratLocationDao contratLocationDao;

    private LiveData<List<ContratLocation>> getAllContratLocation;

   public ContratLocationRepository(Application application)
    {
        AppDatabase db = Connexion.getConnexion(application);
        contratLocationDao = db.contratLocationDao();
        getAllContratLocation = contratLocationDao.getAll();
    }

    public LiveData<List<ContratLocation>> getAllContratLocation() {
        return getAllContratLocation;
    }

    public void insert(ContratLocation contratLocation){
        new ContratLocationRepository.insertAsync(contratLocationDao).execute(contratLocation);
    }

    private static class insertAsync extends AsyncTask<ContratLocation,Void,Void> {

        private ContratLocationDao contratLocationDaoAsync;

        insertAsync(ContratLocationDao contratLocationDao){
            contratLocationDaoAsync = contratLocationDao;
        }

        @Override
        protected Void doInBackground(ContratLocation... contratLocations) {
            contratLocationDaoAsync.insertAll(contratLocations);
            return null;
        }

}
}
