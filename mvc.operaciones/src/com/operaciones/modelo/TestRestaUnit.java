package com.operaciones.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRestaUnit {

	@Test
	void test() {
		OperacionesMatematias test;
		test = new OperacionesMatematias();

		test.setfnumero1(1);
		test.setfnumero2(2);
		float result = test.restar();
		assertTrue(result==-1);
	}

}
