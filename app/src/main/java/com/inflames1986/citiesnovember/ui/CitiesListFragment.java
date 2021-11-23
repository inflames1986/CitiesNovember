package com.inflames1986.citiesnovember.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.inflames1986.citiesnovember.R;
import com.inflames1986.citiesnovember.domain.City;
import com.inflames1986.citiesnovember.domain.DeviceCitiesRepository;

import java.util.List;

public class CitiesListFragment extends Fragment implements CitiesListView {

    private CitiesListPresenter presenter;

    private LinearLayout container;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = new CitiesListPresenter(this, new DeviceCitiesRepository());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cities_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        container = view.findViewById(R.id.root);

        presenter.requestCities();
    }

    @Override
    public void showCities(List<City> cities) {

        for (City city : cities) {

            View cityItem = LayoutInflater.from(requireContext()).inflate(R.layout.item_city, container, false);

            TextView cityName = cityItem.findViewById(R.id.city_name);

            cityName.setText(city.getName());

            container.addView(cityItem);
        }

    }
}
