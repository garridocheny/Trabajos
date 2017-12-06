package com.operaciones.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSumarJUnit {

	@Test
	public void test() {
		OperacionesMatematias test;
		test = new OperacionesMatematias();

		test.setfnumero1(1);
		test.setfnumero2(2);
		float result = test.sumar();
		assertTrue(result==3);
	}

}
