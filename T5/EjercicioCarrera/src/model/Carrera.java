package model;

public class Carrera {

    private int distanciaTotal;
    private Coche[] listaCoches;

    public Carrera() {
    }

    public Carrera(int distanciaTotal, Coche[] listaCoches) {
        this.distanciaTotal = distanciaTotal;
        this.listaCoches = listaCoches;
    }

    public int getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(int distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public Coche[] getListaCoches() {
        return listaCoches;
    }

    public void setListaCoches(Coche[] listaCoches) {
        this.listaCoches = listaCoches;
    }
}