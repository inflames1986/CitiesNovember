package com.inflames1986.citiesnovember.domain;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

public class City {

    @StringRes
    private int name;

    @DrawableRes
    private int coatOfArms;

    public City(int name, int coatOfArms) {
        this.name = name;
        this.coatOfArms = coatOfArms;
    }

    public int getName() {
        return name;
    }

    public int getCoatOfArms() {
        return coatOfArms;
    }
}
