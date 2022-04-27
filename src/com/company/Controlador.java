package com.company;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;

public class Controlador {
    ArrayList<TraceursB> lista_traceurs = new ArrayList();
    ArrayList<GruposParkourA> lista_grupos = new ArrayList();

    /*public void CrearTraceur(int IDTraceur, String nombre, int edad, float altura, int experiencia, GruposParkourA GrupoParkour){
        TraceursB traceur = new TraceursB(IDTraceur, nombre, edad, altura, experiencia, GrupoParkour);
    }*/

    int IDTraceur = 1;
    int IDGrupos = 1;


    public void CrearGrupoParkour(GruposParkourA gruposParkourA){
        gruposParkourA.setIDGrupoParkour(IDGrupos ++);
        lista_grupos.add(gruposParkourA);


    }

    public void CrearTraceur(TraceursB traceursB){
        traceursB.setIDTraceur(IDTraceur ++);
        lista_traceurs.add(traceursB);
    }

    public void EliminarTraceur(int IDTraceurAeliminar){
        for (TraceursB t: lista_traceurs) {
            if(IDTraceurAeliminar == t.getIDTraceur()){
                lista_traceurs.remove(t);
                break;
            }

        }

    }

    public void EliminarGrupoParkour(int IDGrupoAeliminar) {
        for (GruposParkourA g : lista_grupos) {
            if (IDGrupoAeliminar == g.getIDGrupoParkour()) {
                lista_grupos.remove(g);
                break;
            }
        }
    }

    public void VisualizarTraceur(){

    }

    public void VisualizarGrupoParkour(){

    }

    public void ModificarTraceur(){

    }

    public void ModificarGrupoParkour(){

    }

    public void listado_Traceurs_y_GruposParkour(){

    }

    public ArrayList<TraceursB> getLista_traceurs() {
        return lista_traceurs;
    }

    public void setLista_traceurs(ArrayList<TraceursB> lista_traceurs) {
        this.lista_traceurs = lista_traceurs;
    }

    public ArrayList<GruposParkourA> getLista_grupos() {
        return lista_grupos;
    }

    public void setLista_grupos(ArrayList<GruposParkourA> lista_grupos) {
        this.lista_grupos = lista_grupos;
    }
}
