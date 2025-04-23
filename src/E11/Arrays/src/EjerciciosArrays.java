import java.util.Arrays;
import java.util.Scanner;
public class EjerciciosArrays {
    public static void main(String[] args) {

        /*1. Declarar y mostrar Declara un array de 5 números enteros,
            asígnales valores y muéstralos por pantalla.*/
        Scanner ejerarrays = new Scanner(System.in);

        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++){

            System.out.println("Elemento " + (i + 1) + ": ");
            numeros[i]= ejerarrays.nextInt();
            }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + numeros[i]);
        }

    }
}


