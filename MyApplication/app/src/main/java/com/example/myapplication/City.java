package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

public class City {
    private int id;
    @SerializedName("body")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
