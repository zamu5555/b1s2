package com.example;

public class Main {
    public static void main(String[] args) {

        Estadio estadio1 = new Estadio();
        Estadio estadio2 = new Estadio();


        estadio1.nombre = "Estadio Metropolitano";
        estadio1.ciudad = "Madrid";
        estadio1.capacidad = 36000;

        estadio2.nombre = "Estadio El Campín";
        estadio2.ciudad = "Madrid";
        estadio2.capacidad = 46692;



       estadio1.mostrarInformacion();
       System.out.println("----------------------------------------------------------------------------------------");
       estadio2.mostrarInformacion();
    }
}

