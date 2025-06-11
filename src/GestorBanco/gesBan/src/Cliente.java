public class Cliente {

    private String nombre;
    private String DNI;
    private double saldo;

    public Cliente(String DNI, double salo, String nombre){
        this.nombre = nombre;
        this.DNI = DNI;
        this.saldo = saldo;
    }
}