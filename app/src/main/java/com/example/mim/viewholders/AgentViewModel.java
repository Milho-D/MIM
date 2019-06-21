package com.example.mim.viewholders;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.mim.dao.repositories.AgenceRepository;
import com.example.mim.model.Agence;

import java.util.List;

public class AgentViewModel extends AndroidViewModel {
    private AgenceRepository agenceRepository;
    private LiveData<List<Agence>> getAllAgence;

    public AgentViewModel(@NonNull Application application) {
        super(application);
        agenceRepository = new AgenceRepository(application);
        getAllAgence = agenceRepository.getAllAgence();
    }

    public LiveData<List<Agence>> getGetAllAgence() {
        return getAllAgence;
    }

    public void insert(Agence agence){
        agenceRepository.insert(agence);
    }
}
