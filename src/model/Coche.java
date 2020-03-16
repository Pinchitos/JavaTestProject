package model;

public class Coche {

	private String marca;
	private String color;
	private int capacidad;
	private String tipo;
	private int gastoCombustible;
	private int aceleracion;
	private int velocidadMaxima;

	public Coche() {
		super();
	}

	public Coche(String marca, String color, int capacidad, String tipo, int gastoCombustible, int aceleracion, int velocidadMaxima) {
		super();
		this.marca = marca;
		this.color = color;
		this.capacidad = capacidad;
		this.tipo = tipo;
		this.gastoCombustible = gastoCombustible;
		this.aceleracion = aceleracion;
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getGastoCombustible() {
		return gastoCombustible;
	}

	public void setGastoCombustible(int gastoCombustible) {
		this.gastoCombustible = gastoCombustible;
	}

	public int getAceleracion() {
		return aceleracion;
	}

	public void setAceleracion(int aceleracion) {
		this.aceleracion = aceleracion;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", color=" + color + ", capacidad=" + capacidad + ", tipo=" + tipo
				+ ", gastoCombustible=" + gastoCombustible + "]";
	}


}
