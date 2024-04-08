package Vehículo;

public class Autobús extends Vehículo {
    private int numero;
    private int numParadas;

    public Autobús(String marca, String modelo, String numeroBastidor, int numeroPuertas, int numero, int numParadas) {
        super(marca, modelo, numeroBastidor, numeroPuertas);
        this.numero = numero;
        this.numParadas = numParadas;
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumParadas() {
        return numParadas;
    }

    public void setNumParadas(int numParadas) {
        this.numParadas = numParadas;
    }

    // Método toString
    public String toString() {
        return super.toString() + "; Número: " + numero + "; Número de paradas: " + numParadas;
    }
}