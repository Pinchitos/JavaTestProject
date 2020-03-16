package logic;

import model.Coche;

public class OperacionesCoche {

	
	public static double calculoAutonomia(Coche coche) {
		// Fórmula autonomía: 7 litros a los 100, y tiene 70 litros : 1000 km
		double autonomia = coche.getCapacidad() / coche.getGastoCombustible() * 100;
		return autonomia;
	}

	public static double calculoVelocidad(Coche coche, int segundos) {
		// Fórmula velocidad: aceleracion por el tiempo, si pasa de velocidad maxima se limitará a esta misma
		double velocidad = coche.getAceleracion() * segundos;
		if (velocidad > coche.getVelocidadMaxima()) {
			velocidad = coche.getVelocidadMaxima();
		}
		return velocidad;
	}

}
