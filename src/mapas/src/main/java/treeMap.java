import java.util.*;

public class treeMap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double > notas = new HashMap<>();

        notas.put("Ana", 8.5);
        notas.put("Ana", 7.0); //Las claves deben de ser únicas si se repiten ("Ana") coge la última.
        notas.put("Luis", 5.0);
        notas.put("Pepe", 9.0);
        //for each par recorrer el mapa.
        for (Map.Entry<String,Double> entrada : notas.entrySet()){
            System.out.println(entrada.getKey()+ "->"+entrada.getValue());
        }
        System.out.println("Introduce nombre: ");
        String nombre = scanner.nextLine();

        if(notas.containsKey(nombre)){
            System.out.println(nombre + "tiene una notas de: "+ notas.get(nombre));
        }else {
            System.out.println("Estudiante no encontrado");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        TreeMap<String, Double> ordenado = new TreeMap<>(notas);

        for (Map.Entry<String, Double> entrada : ordenado.entrySet()){
            System.out.println(entrada.getKey()+"->"+ entrada.getValue());
            
        }
    }
}

