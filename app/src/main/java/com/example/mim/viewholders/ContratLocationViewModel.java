package com.example.mim.viewholders;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.example.mim.dao.repositories.ContratLocationRepository;
import com.example.mim.model.ContratLocation;

import java.util.List;

public class ContratLocationViewModel extends AndroidViewModel
{
    private ContratLocationRepository contratLocationRepository;

    private LiveData<List<ContratLocation>> mAllContratLoc;

    public ContratLocationViewModel (Application application)
    {
        super(application);
        contratLocationRepository = new ContratLocationRepository(application);
        mAllContratLoc = contratLocationRepository.getAllContratLocation();
    }

     LiveData<List<ContratLocation>> getAllContratLocation() { return mAllContratLoc; }

    public void insert(ContratLocation contratLocation) { contratLocationRepository.insert(contratLocation); }

}




