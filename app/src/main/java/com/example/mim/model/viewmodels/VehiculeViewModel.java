package com.example.mim.model.viewmodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModelProvider;

import com.example.mim.dao.repositories.VehiculeRepository;
import com.example.mim.model.Vehicule;

import java.util.List;

public class VehiculeViewModel extends AndroidViewModel {

    private VehiculeRepository vehiculeRepository;
    private LiveData<List<Vehicule>> allVehicules;

    public VehiculeViewModel(Application application) {
        super(application);
        vehiculeRepository = new VehiculeRepository(application);
        allVehicules = vehiculeRepository.getAllVehicules();
    }

    public LiveData<List<Vehicule>> getAllVehicules() {
        return allVehicules;
    }

    public void insert(Vehicule vehicule) {
        vehiculeRepository.insert(vehicule);
    }
}
