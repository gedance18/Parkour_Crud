package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Terminal {
    Controlador controlador = new Controlador();
    Scanner scanner = new Scanner(System.in);

    public void MenuCrearGrupoParkour(){
        System.out.println("Grupo de Parkour");
        System.out.println("Nombre: ");
        String nombre = scanner.next();
        System.out.println("Cuantos Traceurs quieres añadir?: ");
        MenuVisualizarTraceur();
        int traceursRequeridos = scanner.nextInt();
        ArrayList<TraceursB> arrayList = new ArrayList<>();
        GruposParkourA gruposParkourA = new GruposParkourA(nombre);

        for (int i = 0; i < traceursRequeridos; i++) {
            System.out.println("Que Traceurs quieres añadir? (Escribe su ID)");
            int IDdeTraceur = scanner.nextInt();
            for (TraceursB t: controlador.lista_traceurs){
                if(IDdeTraceur == t.getIDTraceur()){
                    t.setGrupoParkour(gruposParkourA);
                    arrayList.add(t);
                }
            }
        }
        gruposParkourA.setLista_de_traceurs(arrayList);
        controlador.CrearGrupoParkour(gruposParkourA);
    }


    public void MenuCrearTraceur(){
        System.out.println("Traceur:");


        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Altura: ");
        float altura = scanner.nextFloat();
        System.out.print("Experiencia: ");
        int experiencia = scanner.nextInt();
        System.out.print("Experto en?: ");
        String experto = scanner.next();
       // Experto experto
        TraceursB traceur = new TraceursB(nombre, edad, altura, experiencia);
        controlador.CrearTraceur(traceur);

    }

    public void MenuEliminarTraceur(){
        System.out.println("Que Traceur quieres eliminar? (Escribe la ID)");
        MenuVisualizarTraceur();
        int TraceurEliminar = scanner.nextInt();
        controlador.EliminarTraceur(TraceurEliminar);
    }

    public void MenuEliminarGrupoParkour(){
        System.out.println("Que Grupo de Parkour quieres eliminar? (Escribe la ID)");
        MenuVisualizarGrupoParkour();
        int GrupoEliminar = scanner.nextInt();
        controlador.EliminarGrupoParkour(GrupoEliminar);
    }

    public void MenuVisualizarTraceur(){
        for (TraceursB t: controlador.lista_traceurs){
            System.out.println(t);
        }

    }

    public void MenuVisualizarGrupoParkour(){
        for (GruposParkourA g: controlador.lista_grupos){
            System.out.println(g);
        }
    }

    public void MenuModificarTraceur(){
        System.out.println("Que Traceur quieres modificar?: (Escribe su ID)");
        MenuVisualizarTraceur();
        int TraceurIDModificar = scanner.nextInt();
        System.out.print("Modifica el Nombre: ");
        String nombre = scanner.next();
        System.out.print("Modifica la Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Modifica la Altura: ");
        float altura = scanner.nextFloat();
        System.out.print("Modifica la Experiencia: ");
        int experiencia = scanner.nextInt();

        for (TraceursB t: controlador.lista_traceurs){
            if(TraceurIDModificar == t.getIDTraceur()){
                t.setNombre(nombre);
                t.setEdad(edad);
                t.setAltura(altura);
                t.setExperiencia(experiencia);
            }
        }

    }

    public void MenuModificarGrupoParkour(){
        System.out.println("Que GrupoParkour quieres modificar?: (Escribe su ID)");
        MenuVisualizarGrupoParkour();
        int GrupoIDModificar = scanner.nextInt();
        System.out.print("Modifica el Nombre del Grupo: ");
        String nombre = scanner.next();
        System.out.println("Modificar la lista de traceurs:");
        System.out.println("Cuantos Traceurs quieres añadir? ");
        MenuVisualizarTraceur();
        int traceursRequeridos = scanner.nextInt();
        ArrayList<TraceursB> arrayList = new ArrayList<>();

        for (GruposParkourA g: controlador.lista_grupos){
            if(GrupoIDModificar == g.getIDGrupoParkour()){
                g.setNombre(nombre);
                for (int i = 0; i < traceursRequeridos; i++) {
                    System.out.println("Que Traceurs quieres añadir? (Escribe su ID)");
                    int IDdeTraceur = scanner.nextInt();
                    for (TraceursB t: controlador.lista_traceurs){
                        if(IDdeTraceur == t.getIDTraceur()){
                            t.setGrupoParkour(g);
                            arrayList.add(t);
                        }
                    }
                }
                g.setLista_de_traceurs(arrayList);
            }
        }
    }

}
