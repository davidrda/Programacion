package com.example.practicalibrosss.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class Libro implements Serializable {

    private static final long serialVersionUID = 1L;

    @SerializedName("id")
    private int id;

    @SerializedName("Year")
    private String year;

    @SerializedName("Title")
    private String title;

    @SerializedName("handle")
    private String handle;

    @SerializedName("Publisher")
    private String publisher;

    @SerializedName("ISBN")
    private String isbn;

    @SerializedName("Pages")
    private long pages;

    @SerializedName("Notes")
    private List<String> notes;

    @SerializedName("Villains")
    private List<Villain> villains;

    @Override
    public String toString() {
        return title + " (" + year + ")";
    }
}