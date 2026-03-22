package com.example.pokeapi.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Sprites {

    @SerializedName("front_default")
    private String frontDefault;
}