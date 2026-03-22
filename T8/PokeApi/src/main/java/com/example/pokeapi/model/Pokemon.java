package com.example.pokeapi.model;

import lombok.Data;

import java.util.List;

@Data
public class Pokemon {

    private String name;
    private int height;
    private int weight;
    private Sprites sprites;

    private List<Stat> stats;

}