package com.example;

class JugadorFutbol {

    String nombreJugador;
    int edad;
    String posicion;

    public void presentarse() {

        System.out.println("Hola soy " + nombreJugador + " tengo " + edad + " años y soy " + posicion);

    }

    public void cambiarPosicion (String nuevaPosicion){

        posicion = nuevaPosicion;

        System.out.println(nombreJugador + " ha cambiado de posicion, ahora juega como " + nuevaPosicion);

    }

    
}

