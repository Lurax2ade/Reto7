package Vehículo;

public class Particular extends Turismo implements Iniciable {
	public Particular(String marca, String modelo, String numeroBastidor, int numeroPuertas, Asientos tiposAsiento) {
		super(marca, modelo, numeroBastidor, numeroPuertas, tiposAsiento);
		// TODO Auto-generated constructor stub

	}

	private String propietario;

	@Override
	public double calcularPrecioAlquiler(int dias) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxVelocidad() {
		// TODO Auto-generated method stub
		return 0;
	}}
