package com.countries;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Countries {

    @SerializedName("name")
    String name;

    @SerializedName("capital")
    String capital;

    @SerializedName("region")
    String region;

    @SerializedName("subregion")
    String subregion;

    @SerializedName("population")
    String population;

    @SerializedName("borders")
    List<String> borders;

    @SerializedName("languages")
    List<Lang> languages;

    @SerializedName("flag")
    String flag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public List<String> getBorders() {
        return borders;
    }

    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    public List<Lang> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Lang> languages) {
        this.languages = languages;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
