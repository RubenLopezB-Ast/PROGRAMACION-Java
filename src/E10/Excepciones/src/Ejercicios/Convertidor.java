package Ejercicios;
//Ejercicio 2: Convertidor de texto a número
//
//        Objetivo: Añadir manejo de NumberFormatException
//        Instrucción: Añade un bloque try-catch para evitar que el programa se rompa si el
//        usuario escribe letras.


import java.util.Scanner;
public class Convertidor {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Escribe un número (en texto): ");
        try {                               //Capturamos las entradas
            String texto = sc2.nextLine();
            int numero = Integer.parseInt(texto);
        System.out.println("Número x 10: " + (numero * 10));
    }catch (NumberFormatException e) {        // Buscamos excepción que sea una letra y devolvemos texto.
            System.out.println("Introduce el número en letra exclusivamente eso.");
        }finally {                          // No es obligatoria pero se cumple haya o no excepción.
            System.out.println("Fin del programa");

        }

        sc2.close();
    }
}


