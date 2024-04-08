package Vehículo;

public class Taxi extends Turismo implements Calculable, Iniciable {
    private static final double IMPORTE_INICIO = 2.0;
    private double kmRecorridos;
    private double importeKm;

    public Taxi(String marca, String modelo, String numeroBastidor, int numeroPuertas, Asientos tiposAsiento, double kmRecorridos, double importeKm) {
        super(marca, modelo, numeroBastidor, numeroPuertas, tiposAsiento);
        this.kmRecorridos = kmRecorridos;
        this.importeKm = importeKm;
    }

    // Getters y Setters
    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public double getImporteKm() {
        return importeKm;
    }

    public void setImporteKm(double importeKm) {
        this.importeKm = importeKm;
    }

    // Métodos de la interfaz Calculable
    @Override
    public double calcularCosteTrayecto() {
        return IMPORTE_INICIO + (kmRecorridos * importeKm);
    }

    // Métodos de la interfaz Iniciable
    @Override
    public void reiniciarContador(double kilometros) {
        this.kmRecorridos = kilometros;
        System.out.println("El Taxi tiene acumulados un total de " + kilometros + "km");
    }

    // Implementación del método abstracto de Turismo
    @Override
    public double calcularPrecioAlquiler(int dias) {
        return dias * 50.0; // Precio indicado para Taxi
    }

    // Implementación del método abstracto de Turismo
    @Override
    public int getMaxVelocidad() {
        return 200; // Velocidad máxima para Taxi
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "; Importe inicio: " + IMPORTE_INICIO + "; Importe Km: " + importeKm + "; KmRecorridos: " + kmRecorridos + "; Coste del trayecto: " + calcularCosteTrayecto();
    }
}