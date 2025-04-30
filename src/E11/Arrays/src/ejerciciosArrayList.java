import java.util.ArrayList;
import java.util.Scanner;

public class ejerciciosArrayList {
    public static void main(String[] args) {
/*6. Crear una lista de nombres
 Crea una ArrayList de tipo String, añade 5 nombres y muéstralos por pantalla.
*/
        Scanner ejercicios = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        System.out.println("Intruduce nombres: ");
        String nombre;
       while (nombres.size()<5){
           System.out.println("Nombre: ");
           nombre = ejercicios.nextLine();

           if(nombre.equalsIgnoreCase("salir")){
               break;
           }
           nombres.add(nombre);
       }

        System.out.println("\n Los nombres introducidos son: ");
            for ( String n : nombres){
                System.out.println("- "+ n);
            }
    }
}
