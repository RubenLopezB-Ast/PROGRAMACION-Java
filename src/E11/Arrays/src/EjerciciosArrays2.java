import java.util.Arrays;

public class EjerciciosArrays2 {
    public static void main(String[] args) {
        /* Ejercicios con Arrays 2
6. Invertir un array
Crea un programa que invierta los elementos de un array. Por ejemplo, si el array es {1,
2, 3, 4, 5}, el resultado debe ser {5, 4, 3, 2, 1}.
 */
        int[] array = {1,2,3,4,5};
        int[] invertido = new int[array.length];

        for(int i=0 ; i < array.length; i++){
            invertido[i]= array [array.length -1 -i];

        }
        System.out.println("El array normal es"+ Arrays.toString(array)+" y el array invertido es: " + Arrays.toString(invertido));

        /*7. Copiar sin duplicados
Dado un array con posibles números repetidos, crea un nuevo array que contenga los
mismos elementos sin duplicados.
Ejemplo: {1, 2, 2, 3, 4, 4, 5} → {1, 2, 3, 4, 5}.*/

        /*8. Rotar elementos
Escribe un programa que rote los elementos de un array una posición hacia la derecha.
Ejemplo: {1, 2, 3, 4, 5} → {5, 1, 2, 3, 4}.*/
        //Guardo último elemento
        int ultimo = array[array.length-1];

        //Recorrido inverso
        for (int i= array.length-1; i>0; i--){
            array[i]= array[i-1];
        }
        array[0] = ultimo;

        /*9. Comparar arrays
Pide al usuario que introduzca dos arrays de enteros del mismo tamaño y muestra
cuántos elementos coinciden en la misma posición.
Ejemplo:
Array 1: {1, 2, 3, 4, 5}
Array 2: {1, 4, 3, 0, 5}
Coinciden en 3 posiciones (índices 0, 2 y 4).*/

        /*10. Frecuencia de elementos
Dado un array de enteros, muestra cuántas veces se repite cada valor.
Ejemplo: {1, 2, 2, 3, 1, 1} →
1 aparece 3 veces
2 aparece 2 veces
3 aparece 1 vez*/
    }
}
