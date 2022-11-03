package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {
	private Geometria geo; 
	
	
	@BeforeEach
	public void testBeforeAll() {
		geo = new Geometria();
	}
	@AfterEach
	public void testAfterAll() {
		//geo.Clear();
	}
	@Test
	public void areacuadrado(){
		int n = geo.areacuadrado(5);
		assertEquals(25, n);
	}
	
	@Test
	public void areaCirculo() {
		double n = geo.areaCirculo(5);
		assertEquals(78.53999999999999, n);
	}
	
	@Test
	public void areaTriangulo() {
		int n = geo.areatriangulo(10, 16);
		assertEquals(80, n);
	}
	
	@Test
	public void areaRectangulo() {
		int n = geo.arearectangulo(5, 2);
		assertEquals(10, n);
	}
	
	@Test
	public void areaPentagono() {
		int n = geo.areapentagono(10, 4);
		assertEquals(20, n);
	}
	
	@Test
	public void areaRombo() {
		int n = geo.arearombo(10, 4);
		assertEquals(20, n);
	}
	
	@Test
	public void areaRomboide() {
		int n = geo.arearomboide(5,10);
		assertEquals(50, n);
	}
	
	@Test
	public void areaTrapecio() {
		int n = geo.areatrapecio(10, 7, 13);
		assertEquals(104, n);
	}
	
	@Test
	public void figura() {
		assertEquals("cuadrado", geo.figura(1));
		assertEquals("Circulo", geo.figura(2));
		assertEquals("Triangulo", geo.figura(3));
		assertEquals("Rectangulo", geo.figura(4));
		assertEquals("Pentagono", geo.figura(5));
		assertEquals("Rombo", geo.figura(6));
		assertEquals("Romboide", geo.figura(7));
		assertEquals("Trapecio", geo.figura(8));
		assertEquals("Default", geo.figura(9));
		/**
		String[] respuestas = {"cuadrado","Circulo",
				"Triangulo","Rectangulo","Pentagono",
				"Rombo","Romboide","Trapecio","Default"};
		for (int i = 0; i < respuestas.length; i++) {
			String a = geo.figura((i+1));
			assertEquals(respuestas[i], a);
		}
		aqui tengo la duda de cual es la forma en la que se hace
		ambas van igual
		*/
	}
	
	@Test
	public void testObject() {
		Geometria geo2 = new Geometria(1);
		geo2.setArea(geo2.areacuadrado(5));
		String aux = "Geometria [id=" + 1 + ", nom=" + "cuadrado" + ", area=" + 25.0 + "]";
		System.out.println(aux + "\n" + geo2.toString());
		assertAll(
				()->assertEquals(1, geo2.getId()),
				()->assertEquals("cuadrado", geo2.getNom()),
				()->assertEquals(25, geo2.getArea()),
				()->assertEquals(aux,geo2.toString())
				);
		
	}
	

}
