package com.operaciones.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDividirJUnit {

	@Test
	void test() {
		OperacionesMatematias test;
		test = new OperacionesMatematias();
//Este es el de multiplicar y el otro es el de dividir
		test.setfnumero1(1);
		test.setfnumero2(2);
		float result = test.multiplicar();
		assertTrue(result==2);
	}

}
