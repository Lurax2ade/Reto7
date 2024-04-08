package Vehículo;

public abstract class Turismo extends Vehículo {
	private Asientos tiposAsiento;

	public Turismo(String marca, String modelo, String numeroBastidor, int numeroPuertas, Asientos tiposAsiento) {
		super(marca, modelo, numeroBastidor, numeroPuertas);
		this.tiposAsiento = tiposAsiento;
	}

	// Getter y Setter para tiposAsiento
	public Asientos getTiposAsiento() {
		return tiposAsiento;
	}

	public void setTiposAsiento(Asientos tiposAsiento) {
		this.tiposAsiento = tiposAsiento;
	}

	// Método abstracto calcularPrecioAlquiler
	public abstract double calcularPrecioAlquiler(int dias);

	// Método abstracto getMaxVelocidad
	public abstract int getMaxVelocidad();

	// Método toString
	@Override
	public String toString() {
		return super.toString() + "; TipoAsiento: " + tiposAsiento;
	}
}
