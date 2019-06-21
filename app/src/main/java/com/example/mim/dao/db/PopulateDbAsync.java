package com.example.mim.dao.db;

import android.os.AsyncTask;

import com.example.mim.dao.AgenceDao;
import com.example.mim.dao.ClientDao;
import com.example.mim.dao.ContratLocationDao;
import com.example.mim.dao.GerantDao;
import com.example.mim.dao.VehiculeDao;
import com.example.mim.model.Agence;
import com.example.mim.model.Client;
import com.example.mim.model.ContratLocation;
import com.example.mim.model.Gerant;
import com.example.mim.model.Vehicule;

import java.util.Date;

class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

    private final VehiculeDao vehiculeDao;
    private final AgenceDao agenceDao;
    private final GerantDao gerantDao;
    private final ContratLocationDao contratLocationDao;
    private final ClientDao clientDao;

    PopulateDbAsync(AppDatabase db) {

        vehiculeDao = db.vehiculeDao();
        agenceDao = db.agenceDao();
        gerantDao = db.gerantDao();
        contratLocationDao = db.contratLocationDao();
        clientDao = db.clientDao();

    }

    @Override
    protected Void doInBackground(Void... voids) {
        // Start the app with a clean database every time.
        // Not needed if you only populate on creation.

        //Génération d'une agence
        //agenceDao.deleteAll();
        Agence theShield = new Agence("The Shield", "New York DC", 120045210.12);
        long[] agenceIds = agenceDao.insertAll(theShield);
        theShield.setId( agenceIds[0]);
        //Génération d'un client
        //clientDao.deleteAll();
        Client loki = new Client("God","Loki", "Azgard", 0213, "loki@mail.god");
        long[] clientIds = clientDao.insertAll(loki);
        loki.setId(clientIds[0]);

        //Génération d'un gérant
        //gerantDao.deleteAll();
        Gerant tStark = new Gerant("Stark", "Tony", "ironman", theShield.getId());
        long[] gerantIds = gerantDao.insertAll(tStark);
        tStark.setId(gerantIds[0]);

        // Génération de véhicules
        //vehiculeDao.deleteAll();
        Vehicule delorean = new Vehicule("DMC-12", "Delorean","OUT-A-TIME", 250.00, false,  false,theShield.getId());
        Vehicule falconMillenium = new Vehicule("Millenium", "Falcon","OUT-A-SPACE", 520.00, false,  false ,theShield.getId());
        Vehicule batMobile = new Vehicule("confidentiel", "WayneCorp","OUTATIME", 300.00, false,  false,theShield.getId());
        long[] vehiculeIds = vehiculeDao.insertAll(delorean, falconMillenium, batMobile);
        delorean.setId(vehiculeIds[0]);
        falconMillenium.setId(vehiculeIds[1]);
        batMobile.setId(vehiculeIds[2]);

        //Génération d'un contrat de location
        //contratLocationDao.deleteAll();
        ContratLocation contratLoc = new ContratLocation(loki.getId(), delorean.getId(), new Date(), new Date());
        long[] contratLocIds = contratLocationDao.insertAll(contratLoc);
        contratLoc.setId(contratLocIds[0]);

        return null;
    }
}
