package logic;

import model.Coche;

public class OperacionesCoche {

	public static double calculoAutonomia(Coche coche) {
		// Fórmula autonomía: 7 litros a los 100, y tiene 70 litros : 1000 km
		double autonomia = coche.getCapacidad() / coche.getGastoCombustible() * 100;
		return autonomia;
	}

}
