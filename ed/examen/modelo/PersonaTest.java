package ed.examen.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaTest {
	Persona p = new Persona("123456789Z", "Alejandro", "Agudelo");

	@Test
	public void testPersonaStringStringString() {
		assertEquals("123456789Z", p.getDni());
		assertEquals("Alejandro", p.getNombre());
		assertEquals("Agudelo", p.getApellido1());
	}

	@Test
	public void testGetDni() {
		assertEquals("123456789Z", p.getDni());
	}

	@Test
	public void testSetDni() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNombre() {
		assertEquals("Alejandro", p.getNombre());
	}

	@Test
	public void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetApellido1() {
		assertEquals("Agudelo", p.getApellido1());
	}

	@Test
	public void testSetApellido1() {
		fail("Not yet implemented");
	}

}
