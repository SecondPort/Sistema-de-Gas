package edu.ubp.doo.main;

import edu.ubp.doo.model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Persona p = new Cliente("Juan", "Perez", "12345678", "Jubilado","goubat");
        System.out.println(p);
    }


}