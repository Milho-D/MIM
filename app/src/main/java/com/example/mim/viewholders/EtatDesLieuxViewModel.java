package com.example.mim.viewholders;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.example.mim.dao.repositories.EtatDesLieuxRepository;
import com.example.mim.model.EtatDesLieux;

import java.util.List;

public class EtatDesLieuxViewModel extends AndroidViewModel {

    private EtatDesLieuxRepository etatDesLieuxRepository;

    private LiveData<List<EtatDesLieux>> mAllEtatDesLieux;

    public EtatDesLieuxViewModel (Application application) {
        super(application);
        etatDesLieuxRepository = new EtatDesLieuxRepository(application);
        mAllEtatDesLieux = etatDesLieuxRepository.getAllEtatDesLieux();
    }

    LiveData<List<EtatDesLieux>> getAllEtatDesLieux() { return mAllEtatDesLieux; }

    public void insert(EtatDesLieux etatDesLieux) { etatDesLieuxRepository.insert(etatDesLieux); }

}
