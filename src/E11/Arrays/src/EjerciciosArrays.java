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
/*2. Sumar elementos
Suma todos los valores de un array de enteros y muestra el total.*/
        int numerosEjer2[] = new int[5];
        int suma=0;
        for (int j = 0; j < numerosEjer2.length; j++){
            System.out.println("Dinos la posición "+ (j+1)+":");
            numerosEjer2[j] = ejerarrays.nextInt();
        }
        for (int numeroEjer2 : numerosEjer2){
            suma = suma + numeroEjer2;
        }
        System.out.println("Suma: " + suma);

/*3. Valor máximo y mínimo
Dado un array de enteros, muestra el valor más alto y el más bajo.*/
        int numerosEj3[] = new int[5];
        for (int k = 0; k < numerosEj3.length; k++){
            System.out.println("Dinos la posición "+(k+1)+":");
            numerosEj3[k]= ejerarrays.nextInt();
        }


    }
}


