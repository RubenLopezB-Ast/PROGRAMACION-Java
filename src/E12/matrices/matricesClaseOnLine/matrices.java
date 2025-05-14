import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        int[][] matriz1 = new int[3][4];
        int[][] matriz2 = {
                {1,2,3,14},
                {4,5,6,17},
                {7,8,9,20}
        };
        System.out.println("Número de filas: "+ matriz2.length);
        System.out.println("Número de columnas: "+ matriz2[0].length);

        for (int i = 0; i< matriz2.length; i++){
            for (int j=0; j< matriz2[i].length; j++){
                System.out.println(matriz2[i][j]+" ");
            }
            System.out.println();
        }
        matriz2[1][1]=30;
        for (int[] fila : matriz2) {
            for (int valor : fila ){
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
