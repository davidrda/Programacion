package com.example.pokeapi.controller;

import com.example.pokeapi.model.Pokemon;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PokeController {

    @FXML
    private Label nombreLabel;

    @FXML
    private ImageView imagenView;

    public void setPokemon(Pokemon pokemon) {

        // Nombre
        nombreLabel.setText(pokemon.getName());

        // Imagen (Sprite)
        String urlImagen = pokemon.getSprites().getFrontDefault();
        Image image = new Image(urlImagen);
        imagenView.setImage(image);
    }

}
