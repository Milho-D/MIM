package com.example.mim.model.viewmodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.example.mim.dao.repositories.GerantRepository;
import com.example.mim.model.Gerant;

import java.util.List;

public class GerantViewModel extends AndroidViewModel {

    private GerantRepository gerantRepository;

    private LiveData<List<Gerant>> allGerants;

    public GerantViewModel(Application application) {
        super(application);
        gerantRepository = new GerantRepository(application);
        allGerants = gerantRepository.getAllGerants();
    }

    public LiveData<List<Gerant>> getAllGerants() { return allGerants;  }

    public void isnert(Gerant gerant) { gerantRepository.insert(gerant); }

}
