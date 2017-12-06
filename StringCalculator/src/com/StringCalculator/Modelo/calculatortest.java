package com.StringCalculator.Modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatortest {

	StringCalculator calculadora = new StringCalculator();
	int iqCaracteres;
	String cadena="1,2,3";
	int resultadoEsperado=3;
	
	
	@Test
	public void testIAdd() {
		iqCaracteres = calculadora.iAdd(cadena);
		assertEquals(resultadoEsperado, (iqCaracteres,0);
	}

	@Test
	public void testFAdd() {
		fail("Not yet implemented");
	}

}
