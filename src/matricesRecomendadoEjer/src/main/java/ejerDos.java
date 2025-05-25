import java.util.Random;

public class ejerDos {
    public static void main(String[] args) {
        int matriz[][]=new int[4][4];
        Random aletorio = new Random();

        for (int i =0; i<matriz.length; i++){
            for (int j = 0; j< matriz.length; j++){
                matriz[i][j]= aletorio.nextInt(100)+1;
            }

        }
        System.out.println("La matriz de cuatro columnas y cuatro filas es: ");
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz.length;j++){
                System.out.printf("%4d", matriz[i][j]); //%4d alinea los mumeros de la matriz
            }                                           // quitamos el ln del sout
            System.out.println();
        }

    }
}
