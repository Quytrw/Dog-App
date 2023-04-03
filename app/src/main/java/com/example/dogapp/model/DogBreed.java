package com.example.dogapp.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DogBreed implements Serializable {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("life_span")
    private String lifeSpan;

    @SerializedName("origin")
    private String origin;

    @SerializedName("bred_for")
    private String bredFor;

    @SerializedName("temperament")
    private String temperament;

    @SerializedName("height")
    private DogHeight heightMetric;

    @SerializedName("weight")
    private DogWeight weightMetric;

    @SerializedName("url")
    private String url;

    public DogBreed(int id, String name, String lifeSpan, String origin, String bredFor, String temperament, DogHeight heightMetric, DogWeight weightMetric, String url) {
        this.id = id;
        this.name = name;
        this.lifeSpan = lifeSpan;
        this.origin = origin;
        this.bredFor = bredFor;
        this.temperament = temperament;
        this.heightMetric = heightMetric;
        this.weightMetric = weightMetric;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBredFor() {
        return bredFor;
    }

    public void setBredFor(String bredFor) {
        this.bredFor = bredFor;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    public String getHeightMetric() {
        return heightMetric.getMetric();
    }

    public void setHeightMetric(DogHeight heightMetric) {
        this.heightMetric = heightMetric;
    }

    public String getWeightMetric() {
        return weightMetric.getMetric();
    }

    public void setWeightMetric(DogWeight weightMetric) {
        this.weightMetric = weightMetric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(String lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
