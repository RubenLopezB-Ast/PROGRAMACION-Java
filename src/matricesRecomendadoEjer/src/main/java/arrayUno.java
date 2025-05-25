import java.util.ArrayList;

public class arrayUno {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> estudiantes = new ArrayList<>();

        ArrayList<String> estud1 = new ArrayList<>();
        estud1.add("Juan");
        estud1.add("Pérez");
        estud1.add("34");

        ArrayList<String> estud2 = new ArrayList<>();
        estud2.add("Eva");
        estud2.add("Riquelme");
        estud2.add("52");

        ArrayList<String> estud3 = new ArrayList<>();
        estud3.add("Triana");
        estud3.add("Trigo");
        estud3.add("43");

        estudiantes.add(estud1);
        estudiantes.add(estud2);
        estudiantes.add(estud3);

        System.out.println("Información de los estudiantes: ");
        for (int i = 0; i < estudiantes.size(); i++) {
            ArrayList<String> estud = estudiantes.get(i);
            System.out.println("Alumno/a: " + (i + 1) + ":" + "Nombre: " + estud.get(0) +
                    ", Apellido:" + estud.get(1) + ", Edad: " + estud.get(2));
        }
    }
}
