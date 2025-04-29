import java.util.Arrays;
import java.util.Scanner;
public class EjerciciosArrays {
    public static void main(String[] args) {

        /*1. Declarar y mostrar Declara un array de 5 números enteros,
            asígnales valores y muéstralos por pantalla.*/
        Scanner ejerarrays = new Scanner(System.in);

        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Elemento " + (i + 1) + ": ");
            numeros[i] = ejerarrays.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + numeros[i]);
        }
/*2. Sumar elementos
Suma todos los valores de un array de enteros y muestra el total.*/
        int numerosEjer2[] = new int[5];
        int suma = 0;
        for (int j = 0; j < numerosEjer2.length; j++) {
            System.out.println("Dinos la posición " + (j + 1) + ":");
            numerosEjer2[j] = ejerarrays.nextInt();
        }
        for (int numeroEjer2 : numerosEjer2) {
            suma = suma + numeroEjer2;
        }
        System.out.println("Suma: " + suma);

/*3. Valor máximo y mínimo
Dado un array de enteros, muestra el valor más alto y el más bajo.*/
        int numerosEj3[] = new int[5];
        for (int k = 0; k < numerosEj3.length; k++) {
            System.out.println("Dinos la posición " + (k + 1) + ":");
            numerosEj3[k] = ejerarrays.nextInt();
        }

        int maximo = numerosEj3[0];
        int minimo = numerosEj3[0];

        for (int k = 1; k < numerosEj3.length; k++) {
            if (numerosEj3[k] > maximo) {
                maximo = numerosEj3[k];
            }
            if (numerosEj3[k] < minimo) {
                minimo = numerosEj3[k];
            }
        }
        System.out.println("El valor máximo es: " + maximo);
        System.out.println("El valor mínimo es: " + minimo);
/*4. Buscar un elemento
Pide al usuario un número y muestra si está presente en un array, y en qué posición.*/
        int[] numerosEj4 = new int[5];

        numerosEj4[0] = 1;
        numerosEj4[1] = 2;
        numerosEj4[2] = 3;
        numerosEj4[3] = 4;
        numerosEj4[4] = 5;


        System.out.println("Introduce un número para buscar en el array:");
        int valorBuscado = ejerarrays.nextInt();

        boolean encontrado = false;

        for (int l = 0; l < numerosEj4.length; l++) {
            if (numerosEj4[l] == valorBuscado) {
                System.out.println("El número " + valorBuscado + " está en la posición " + l + " del array.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El número " + valorBuscado + " no se encuentra en el array.");
        }
    }
}



