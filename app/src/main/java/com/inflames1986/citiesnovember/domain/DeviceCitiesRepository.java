package com.inflames1986.citiesnovember.domain;

import com.inflames1986.citiesnovember.R;

import java.util.ArrayList;
import java.util.List;

public class DeviceCitiesRepository implements CitiesRepository{
    @Override
    public List<City> getCities() {

        ArrayList<City> cities = new ArrayList<>();

        cities.add(new City(R.string.city_alushta, R.drawable.alushta));
        cities.add(new City(R.string.city_dzhankoi, R.drawable.dzhankoi));
        cities.add(new City(R.string.city_saki, R.drawable.saki));
        cities.add(new City(R.string.city_sevastopol, R.drawable.sevastopol));
        cities.add(new City(R.string.city_yalta, R.drawable.yalta));

        return cities;

    }
}
