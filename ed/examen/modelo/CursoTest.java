package ed.examen.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CursoTest {
	private Curso curso = new Curso();
	@Test
	public void testEliminarAlumno() throws Exception {
		Persona test = new Persona("11111111A", "Alejandro", "Agudelo");
		curso.aniadirAlumno(test);

		Integer Numerodealumnosantes = curso.numeroAlumnos();

		curso.eliminarAlumno(test.getDni());

		assertEquals(Numerodealumnosantes.intValue() - 1, curso.numeroAlumnos().intValue());
		assertFalse(curso.estaRegistrado(test.getDni()));

	}
	

	@Test
	public void testAniadirAlumno() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstaRegistrado() {
		fail("Not yet implemented");
	}

	@Test
	public void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	public void testNumeroAlumnos() {
		assertEquals(curso.numeroAlumnos(), new Integer(0));
		}


	@Test
	public void testMostrarTodos() {
		fail("Not yet implemented");
	}

}
