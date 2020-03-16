package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import logic.OperacionesCoche;
import model.Coche;

class TestCoche {

	@Test
	void testCalculoAutonomia() {
		Coche c1 = new Coche("Toyota","Azul",50,"Coupe", 10, 20, 120);
		assertEquals(500,OperacionesCoche.calculoAutonomia(c1));
	}
	
	@Test
	void testCalculoVelocidad() {
		Coche c1 = new Coche("Toyota","Azul",50,"Coupe", 10, 15, 120);
		assertEquals(120, OperacionesCoche.calculoVelocidad(c1, 50));
		assertEquals(30, OperacionesCoche.calculoVelocidad(c1, 2));
		assertEquals(60, OperacionesCoche.calculoVelocidad(c1, 4));
	}

}
