package com.example.dogapp.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DogHeight implements Serializable {
    @SerializedName("imperial")
    private String imperial;

    @SerializedName("metric")
    private String metric;

    public String getMetric() {
        return metric;
    }
}
