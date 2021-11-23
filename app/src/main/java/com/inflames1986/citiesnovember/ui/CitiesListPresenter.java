package com.inflames1986.citiesnovember.ui;

import com.inflames1986.citiesnovember.domain.CitiesRepository;
import com.inflames1986.citiesnovember.domain.City;

import java.util.List;

public class CitiesListPresenter {

    private final CitiesListView view;

    private final CitiesRepository repository;

    public CitiesListPresenter(CitiesListView view, CitiesRepository repository) {
        this.view = view;
        this.repository = repository;
    }

    public void requestCities() {

        List<City> result = repository.getCities();

        view.showCities(result);

    }
}
