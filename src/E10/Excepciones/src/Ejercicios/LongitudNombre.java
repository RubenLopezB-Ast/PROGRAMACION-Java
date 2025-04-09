package Ejercicios;
//Ejercicio 5: Longitud de un nombre
//Objetivo: Añadir manejo de NullPointerException
//Ejercicio 5: Longitud de un nombre
//Objetivo: Añadir manejo de NullPointerException


public class LongitudNombre {
    public static void main(String[] args) {
        try {
            String nombre = null;
            System.out.println("La longitud del nombre es: " + nombre.length());
        } catch (NullPointerException e) {
            System.out.println("El programa no se detiene");
        } finally {
            System.out.println("Fin.");
        }

    }
}

