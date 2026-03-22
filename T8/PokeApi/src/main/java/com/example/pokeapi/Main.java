package com.example.pokeapi;

public class Main {

    public static void main(String[] args) {

        PokeService pokeService = new PokeService();

        System.out.println(pokeService.buscarPokemon("pikachu"));
    }

}
