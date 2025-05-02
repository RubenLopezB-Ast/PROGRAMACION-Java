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
        while (nombres.size() < 5) {
            System.out.println("Nombre: ");
            nombre = ejercicios.nextLine();

            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }
            nombres.add(nombre);
        }

        System.out.println("\n Los nombres introducidos son: ");
        for (String n : nombres) {
            System.out.println("- " + n);
        }

            /*7. Añadir y eliminar elementos
 Crea una lista de tareas (ArrayList<String>), añade elementos y elimina uno por su nombre. */

        ArrayList<String> nombresEj7 = new ArrayList<>();
        nombresEj7.add("Juan");
        nombresEj7.add("Jose");
        nombresEj7.add("Eva");

        System.out.println(nombresEj7.size());
        System.out.println(nombresEj7);

        System.out.println("Introduce tareas y cuando quieras acabar escribe FIN");
        String tarea;
        while (true) {
            tarea = ejercicios.nextLine();
            if (tarea.equalsIgnoreCase("fin")) {
                break;
            }
            nombresEj7.add(tarea);
        }
        System.out.println("Lista tareas: ");
        System.out.println(nombresEj7);

        System.out.println("Escribe nombre de la tarea a eliminar: ");
        String eliminar = ejercicios.nextLine();

        if (nombresEj7.remove(eliminar)) {
            System.out.println("Tarea " + eliminar + " eliminada");
        }

        System.out.println("Lista tareas");
        System.out.println((nombresEj7));

    /*8. Buscar en la lista
 Pregunta al usuario un nombre, y busca si está en la lista. Si está, muestra su posición.
*/

        String [] frutas = {"manzana","platano","pera"};
        System.out.println("Introduce el término a buscar: ");
        String busca = ejercicios.nextLine();

        boolean encontrada = false;

        for (int i = 0; i< frutas.length; i++){
            if (frutas[i].equalsIgnoreCase(busca)){
                System.out.println("La palabra introducida "+ busca + " se encuentra en la posición "+(i+1 ));
                encontrada = true;
                break;
            }
        }
        if (!encontrada){
            System.out.println("La palabra " + busca + " no se encuentra en la lista frutas");}

        /*9. Convertir array a lista
 Dado un array de enteros, conviértelo a una ArrayList<Integer> y muestra su contenido.
*/
        int[]numerinos = {1,2,3,45,5,223,23,};

        ArrayList<Integer> listanumerinos = new ArrayList<>();
        for(int nu : numerinos){
            listanumerinos.add(nu);
        }
        System.out.println("El contenido de la lista es: "+ listanumerinos);
            }

        }



