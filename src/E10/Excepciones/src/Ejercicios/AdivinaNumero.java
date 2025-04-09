package Ejercicios;
import java.util.Scanner;
import java.util.Random;
//Ejercicio 4: Adivina el número aleatorio
//Objetivo: Añadir manejo de NumberFormatException al convertir texto a número
//Instrucción: Añade manejo de NumberFormatException y un finally que diga: "Juego finalizado."

public class AdivinaNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int secreto = random.nextInt(10) + 1;

        Scanner sc3 = new Scanner(System.in);
        System.out.print("Adivina el número (1-10): ");
        try {       //Determinamos la zona de actuación
            String intentoTexto = sc3.nextLine();

            int intento = Integer.parseInt(intentoTexto);

            if (intento == secreto) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto. El número era: " + secreto);
            }
        }catch (NumberFormatException e) { // Utilizamos excepción para identificar error y mostrar mensaje
            System.out.println("Tan solo puedes introducir números del 1 al 10.");
        }finally {  //No es obligatorio pero se ejecuta siempre
            System.out.println("Juego finalizado.");
        }
        sc3.close();

    }
}
