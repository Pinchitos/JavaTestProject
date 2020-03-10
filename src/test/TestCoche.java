package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import logic.OperacionesCoche;
import model.Coche;

class TestCoche {

	@Test
	void testCalculoAutonomia() {
		Coche c1 = new Coche("Toyota","Azul",50,"Coupe", 10);
		assertEquals(OperacionesCoche.calculoAutonomia(c1), 500);
	}

}
