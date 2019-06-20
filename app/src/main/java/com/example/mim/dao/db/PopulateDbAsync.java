package com.example.mim.dao.db;

import android.os.AsyncTask;

import com.example.mim.dao.VehiculeDao;
import com.example.mim.model.Vehicule;

class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

    private final VehiculeDao vehiculeDao;

    PopulateDbAsync(AppDatabase db) {
        vehiculeDao = db.vehiculeDao();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        // Start the app with a clean database every time.
        // Not needed if you only populate on creation.

        // Génération de véhicules
        vehiculeDao.deleteAll();

        Vehicule delorean = new Vehicule("DMC-12", "Delorean","OUT-A-TIME", 250.00, false,  false, 0, 0);
        Vehicule falconMillenium = new Vehicule("Millenium", "Falcon","OUT-A-SPACE", 520.00, false,  false, 0, 0);
        Vehicule batMobile = new Vehicule("confidentiel", "WayneCorp","OUTATIME", 300.00, false,  false, 0, 0);
        vehiculeDao.insertAll(delorean, falconMillenium, batMobile);


        return null;
    }
}
