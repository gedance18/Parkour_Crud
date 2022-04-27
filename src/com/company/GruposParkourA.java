package com.company;

import java.util.ArrayList;

public class GruposParkourA {
    private int IDGrupoParkour;
    private String nombre;
    private ArrayList<TraceursB> lista_de_traceurs = new ArrayList();



    public GruposParkourA(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "GruposParkourA{" +
                "IDGrupoParkour=" + IDGrupoParkour +
                ", nombre='" + nombre + '\'' +
                ", lista_de_traceurs=" + lista_de_traceurs +
                '}';
    }

    public int getIDGrupoParkour() {
        return IDGrupoParkour;
    }

    public void setIDGrupoParkour(int IDGrupoParkour) {
        this.IDGrupoParkour = IDGrupoParkour;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<TraceursB> getLista_de_traceurs() {
        return lista_de_traceurs;
    }

    public void setLista_de_traceurs(ArrayList<TraceursB> lista_de_traceurs) {
        this.lista_de_traceurs = lista_de_traceurs;
    }
}
