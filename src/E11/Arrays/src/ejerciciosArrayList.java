import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;




public class ejerciciosArrayList {
    public static void main(String[] args) {
/*6. Crear una lista de nombres
 Crea una ArrayList de tipo String, añade 5 nombres y muéstralos por pantalla.
*/
        Scanner ejercicios = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        System.out.println("Introduce nombres: ");
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

        String[] frutas = {"manzana", "platano", "pera"};
        System.out.println("Introduce el término a buscar: ");
        String busca = ejercicios.nextLine();

        boolean encontrada = false;

        for (int i = 0; i < frutas.length; i++) {
            if (frutas[i].equalsIgnoreCase(busca)) {
                System.out.println("La palabra introducida " + busca + " se encuentra en la posición " + (i + 1));
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("La palabra " + busca + " no se encuentra en la lista frutas");
        }

        /*9. Convertir array a lista
 Dado un array de enteros, conviértelo a una ArrayList<Integer> y muestra su contenido.
*/
        int[] numerinos = {1, 2, 3, 45, 5, 223, 23,};

        ArrayList<Integer> listanumerinos = new ArrayList<>();
        for (int nu : numerinos) {
            listanumerinos.add(nu);
        }
        System.out.println("El contenido de la lista es: " + listanumerinos);
        /*10. Eliminar duplicados de una lista
 Crea una ArrayList con elementos repetidos (por ejemplo: [1, 2, 2, 3, 4, 4, 5])  Elimina los duplicados y muestra la
 lista final sin repetir.*/


        ArrayList<Integer> listaRepe = new ArrayList<Integer>();
        listaRepe.add(1);
        listaRepe.add(2);
        listaRepe.add(3);
        listaRepe.add(3);
        listaRepe.add(3);
        listaRepe = listaRepe.stream().distinct().collect(Collectors.toCollection(ArrayList::new));

        listaRepe.forEach(System.out::println);

        /*DESAFIO FINAL: Haz un pequeño programa que permita al usuario gestionar una lista de la compra:

• Añadir productos.

• Mostrar productos.

• Eliminar productos por nombre.

• Mostrar la lista ordenada alfabéticamente.*/
        ArrayList<String> productos = new ArrayList<>();
        productos.add("Puerta");
        productos.add("Rueda");
        productos.add("Volante");

        int opcion;
        do {
            System.out.println("\n MENU ");
            System.out.println("1. Añadir productos ");
            System.out.println("2. Mostrar productos ");
            System.out.println("3. Eliminar productos por nombre ");
            System.out.println("4. Mostrar lista ordenada alfabéticamente ");
            System.out.println("0. Salir");
            opcion = ejercicios.nextInt();
            ejercicios.nextLine();

            switch (opcion) {
                case 2 -> {
                    if (productos.isEmpty()) {
                        System.out.println("Lista de productos vacía");
                    } else {
                        for (String producto : productos) {
                            System.out.println("-" + producto);
                        }
                    }
                }
                case 1 -> {
                    System.out.println("Introduce productos. Para acabar introduce FIN");
                    String producto;
                    while (true) {
                        producto = ejercicios.nextLine();
                        if (producto.equalsIgnoreCase("fin")) {
                            break;
                        }
                        productos.add(producto);
                    }
                }
                case 3 -> {
                    System.out.println("Escribe el nombre del producto a eliminar: ");
                    String quitar = ejercicios.nextLine();

                    if (productos.remove(quitar)) {
                        System.out.println("Producto: " + quitar + " eliminado");
                    }
                }
                case 0 -> System.out.println( "SALIR");
                default -> {
                    System.out.println("Opcion no válida");

                }
                case 4 -> {
                    for(int i = 0; i < productos.size(); i++){
                        productos.set(i, productos.get(i).toLowerCase());
                    }
                    Collections.sort(productos);

                    for ( String productosOrden : productos){
                        System.out.println(productosOrden);
                    }

                }
            }


        }while( opcion != 0);

    }
}




