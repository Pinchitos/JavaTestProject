package controller;

import logic.OperacionesCoche;
import model.Coche;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche coche = new Coche();

		coche.setTipo("Turismo");
		coche.setMarca("Toyota");
		coche.setCapacidad(52);
		coche.setColor("Verde");
		coche.setGastoCombustible(5);

		System.out.println(coche.toString());
		System.out.println("El coche puede recorrer: " + OperacionesCoche.calculoAutonomia(coche) + " Km");

	}

}
