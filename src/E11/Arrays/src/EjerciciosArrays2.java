import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Set;

public class EjerciciosArrays2 {
    public static void main(String[] args) {
        /* Ejercicios con Arrays 2
6. Invertir un array
Crea un programa que invierta los elementos de un array. Por ejemplo, si el array es {1,
2, 3, 4, 5}, el resultado debe ser {5, 4, 3, 2, 1}.
 */
        int[] array = {1, 2, 3, 4, 5};
        int[] invertido = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];

        }
        System.out.println("El array normal es" + Arrays.toString(array) + " y el array invertido es: " + Arrays.toString(invertido));

        /*7. Copiar sin duplicados
Dado un array con posibles números repetidos, crea un nuevo array que contenga los
mismos elementos sin duplicados.
Ejemplo: {1, 2, 2, 3, 4, 4, 5} → {1, 2, 3, 4, 5}.*/

        int[] dupli = {1, 2, 2, 3, 1, 2, 43, 4, 3, 33, 4, 4, 3, 46, 65};
        int[] sinDupli = removeDuplicates(dupli);
        System.out.println(Arrays.toString(sinDupli));
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] temp = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean duplicado = false;
            for (int j = 0; j < count; j++) {
                if (array[i] == temp[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                temp[count++] = array[i];
            }
        }

        // Copiar los elementos únicos a un nuevo array con tamaño exacto
        int[] resultado = new int[count];
        for (int i = 0; i < count; i++) {
            resultado[i] = temp[i];
        }

        /*8. Rotar elementos
Escribe un programa que rote los elementos de un array una posición hacia la derecha.
Ejemplo: {1, 2, 3, 4, 5} → {5, 1, 2, 3, 4}.*/
        //Guardo último elemento

        int ultimo = array[array.length - 1];

        //Recorrido inverso
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = ultimo;

        /*9. Comparar arrays
Pide al usuario que introduzca dos arrays de enteros del mismo tamaño y muestra
cuántos elementos coinciden en la misma posición.
Ejemplo:
Array 1: {1, 2, 3, 4, 5}
Array 2: {1, 4, 3, 0, 5}
Coinciden en 3 posiciones (índices 0, 2 y 4).*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño de tus arrays: ");
        int longitudArrays = sc.nextInt();
        int[] array1 = new int[longitudArrays];
        int[] array2 = new int[longitudArrays];

        System.out.println("Introduce los elementos del primer array: ");
        for (int k = 0; k < longitudArrays; k++) {
            System.out.println("Elemento " + k + ": ");
            array1[k] = sc.nextInt();
        }
        System.out.println("Introduce los elementos del segundo array: ");
        for (int k = 0; k < longitudArrays; k++) {
            System.out.println("Elemento " + k + ": ");
            array2[k] = sc.nextInt();
        }
        int coincide = 0;
        System.out.println("Coinciden las posiciones: ");
        for (int k = 0; k < longitudArrays; k++) {
            if (array1[k] == array2[k]) {
                System.out.println(k + " ");
                coincide++;
            }
        }
        System.out.println("\nTotal de coincidencias en la misma posición: " + coincide);
        /*10. Frecuencia de elementos
Dado un array de enteros, muestra cuántas veces se repite cada valor.
Ejemplo: {1, 2, 2, 3, 1, 1} →
1 aparece 3 veces
2 aparece 2 veces
3 aparece 1 vez*/
        int[] enteros = {1, 2, 3, 3, 4, 5, 5, 6};
        boolean[] contado = new boolean[enteros.length];
        for (int i = 0; i < enteros.length; i++) {
            if (!contado[i]) {
                int contador = 1;

                for (int j = i + 1; j < enteros.length; j++) {
                    if (enteros[i] == enteros[j]) {
                        contador++;
                        contado[j] = true;
                    }
                }
                System.out.println(enteros[i] + "aparece" + contador + "vez" + (contador > 1 ? "es" : ""));
            }
        }
        return temp;
    }
}

