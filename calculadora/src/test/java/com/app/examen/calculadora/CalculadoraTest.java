package com.app.examen.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	private Calculadora calculadora;
	
	@BeforeEach
	public void testBeforeEach() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void suma() {
	String n = calculadora.suma(1, 5);
		assertEquals("6", n);
	}
	
	@Test
	public void resta() {
	String n = calculadora.resta(8, 7);
		assertEquals("1", n);
	}
	
	@Test
	public void multiplicar() {
		String n = calculadora.multiplicacion(10, 10);
		assertEquals("100", n);
	}
	
	@Test
	public void dividir() {
		String n = calculadora.division(15, 5);
		assertEquals("3", n);
	}
}
