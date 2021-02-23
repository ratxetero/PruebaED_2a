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
		Integer Numerobefore = curso.numeroAlumnos();

		Persona test = new Persona("11111111A", "Alejandro", "Agudelo");
		curso.aniadirAlumno(test);

		assertEquals(Numerobefore.intValue() + 1, curso.numeroAlumnos().intValue());
		assertTrue(curso.estaRegistrado(test.getDni()));

	}

	@Test
	public void testEstaRegistrado() {
		Persona test1 = new Persona("11111111A", "Alejandro", "Agudelo");
		Persona test2 = new Persona("11111111L", "Pedro", "Soldevilla");

		curso.aniadirAlumno(test1);

		assertTrue(curso.estaRegistrado(test1.getDni()));
		assertFalse(curso.estaRegistrado(test2.getDni()));;
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
