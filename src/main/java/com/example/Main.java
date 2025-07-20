package com.example;

public class Main {
    public static void main(String[] args) {
         
        System.out.println("ESTADIOS: \n");

        Estadio estadio1 = new Estadio();
        Estadio estadio2 = new Estadio();

        estadio1.nombre = "Estadio Metropolitano";
        estadio1.ciudad = "Madrid";
        estadio1.capacidad = 36000;

        estadio2.nombre = "Estadio El Campín";
        estadio2.ciudad = "Madrid";
        estadio2.capacidad = 46692;

        estadio1.mostrarInformacion();
        System.out.println("\n");
        estadio2.mostrarInformacion();

        JugadorFutbol jugador1 = new JugadorFutbol();
        JugadorFutbol jugador2 = new JugadorFutbol();

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("PRESENTACION DE JUGADORES: \n");

        jugador1.nombreJugador = "James";
        jugador1.edad = 34;
        jugador1.posicion = "Delantero";

        jugador2.nombreJugador = "Quintero";
        jugador2.edad = 35;
        jugador2.posicion = "Lateral izquierdo";

        jugador1.presentarse();
        jugador2.presentarse();

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("CAMBIO DE POSICIONES: \n");

        jugador1.cambiarPosicion("Arquero");
        jugador2.cambiarPosicion("Lateral derecho");

    }
}
