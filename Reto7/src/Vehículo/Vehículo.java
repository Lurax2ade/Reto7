package Vehículo;

public abstract class Vehículo {
	private String marca;
	private String modelo;
	private String numeroBastidor;
	private int numeroPuertas;
	private static int cantidadVehiculosFuncionando = 0;




	public Vehículo(String marca, String modelo, String numeroBastidor, int numeroPuertas) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroBastidor = numeroBastidor;
		this.numeroPuertas = numeroPuertas;
		cantidadVehiculosFuncionando++;
	}

	// Getters y Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumeroBastidor() {
		return numeroBastidor;
	}

	public void setNumeroBastidor(String numeroBastidor) {
		this.numeroBastidor = numeroBastidor;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public static int getCantidadVehiculosFuncionando() {
		return cantidadVehiculosFuncionando;
	}

	// Método toString
	@Override
	public String toString() {
		return "Marca: " + marca + "; Modelo: " + modelo + "; NBastidor: " + numeroBastidor + "; Npuertas: " + numeroPuertas;
	}
}
