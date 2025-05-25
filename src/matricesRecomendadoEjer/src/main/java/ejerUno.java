//1. Suma de Dos Matrices:
//Crea dos matrices de 3x3 y suma sus elementos.
//Imprime el resultado de la suma.

import java.util.Arrays;
import java.util.Random;

public class ejerUno {
    public static void main(String[] args) {
int matrizA[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
int matrizB[][]=new int[][]{{9,8,7},{6,5,4},{3,2,1}};
int matrizC[][]=new int[3][3];
for (int i = 0; i< matrizA.length; i++){
    for (int j = 0; j < matrizA[i].length; j++){
        matrizC[i][j]=matrizA[i][j]+matrizB[i][j];
    }
    System.out.println(Arrays.toString(matrizC[i]));
}
    }
}




