package com.countries;

import com.google.gson.annotations.SerializedName;

public class Lang {
    @SerializedName("name")
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
