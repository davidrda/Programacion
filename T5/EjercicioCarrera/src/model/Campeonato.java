package model;

public class Campeonato {

    private Carrera[] listaCarreras;
    private Coche[] coches;

    public Campeonato() {
    }

    public Campeonato(Carrera[] listaCarreras, Coche[] coches) {
        this.listaCarreras = listaCarreras;
        this.coches = coches;
    }

    public Coche[] getCoches() {
        return coches;
    }

    public void setCoches(Coche[] coches) {
        this.coches = coches;
    }

    public Carrera[] getListaCarreras() {
        return listaCarreras;
    }

    public void setListaCarreras(Carrera[] listaCarreras) {
        this.listaCarreras = listaCarreras;
    }
}
