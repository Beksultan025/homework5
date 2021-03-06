package com.geektech.homework53.data.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.geektech.homework53.common.Resource;
import com.geektech.homework53.data.model.WeatherApp;
import com.geektech.homework53.data.repositories.MainRepositoryImpl;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class WeathViewModel extends ViewModel {
    public LiveData<Resource<WeatherApp>> liveData;
    private MainRepositoryImpl repository;

    @Inject
    public WeathViewModel(MainRepositoryImpl repository) {
        this.repository = repository;
    }

    public WeathViewModel() {
    }


    public void getWeatherByCityName(String cityName) {
        liveData = repository.getWeatherByCityName(cityName);
    }
}
