package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Traceur");
            System.out.println("2. Crear GrupoParkour");
            System.out.println("3. Eliminar Traceur");
            System.out.println("4. Eliminar GrupoParkour");
            System.out.println("5. Visualizar Traceur");
            System.out.println("6. Visualizar GrupoParkour");
            System.out.println("7. Modificar Traceur");
            System.out.println("8. Modificar GrupoParkour");
            System.out.println("9. Salir al Escritorio");
            int respuesta = scanner.nextInt();
            if (respuesta == 1) {
                terminal.MenuCrearTraceur();
            } else if (respuesta == 2) {
                terminal.MenuCrearGrupoParkour();
            } else if (respuesta == 5) {
                terminal.MenuVisualizarTraceur();
            } else if (respuesta == 6) {
                terminal.MenuVisualizarGrupoParkour();
            } else if (respuesta == 3) {
                terminal.MenuEliminarTraceur();
            } else if (respuesta == 4) {
                terminal.MenuEliminarGrupoParkour();
            } else if (respuesta == 7) {
                terminal.MenuModificarTraceur();
            } else if (respuesta == 8) {
                terminal.MenuModificarGrupoParkour();
            } else if (respuesta == 9) {
                break;
            }
        }
    }
}
