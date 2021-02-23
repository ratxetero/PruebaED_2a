package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Alejandro Agudelo
 * version 1.0.0
 *
 */
public class Curso {
	
	private List<Persona> listaAlumnos;

	/**
	 * 
	 * Metodo que sirve para eliminar a un alumno
	 * 
	 * @param dni documento del alumno que se desea eliminar
	 * @throws Exception Excepcion lanzada si la longitud del dni es mayor o menor de 9 caracteres
	 * 
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	/**
	 * 
	 * Metodo que sirve para añadir a un alumno
	 * 
	 * @param p Persona que queremos añadir a la lista de alumnos de un curso
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	/**
	 * 
	 * Metodo que sirve para comprobar si un alumno está reegsitrado
	 * 
	 * @param dni Documento del alumno que queremos comprobar si esta registrado en la lista de alumnos
	 * @return devuelve true si el alumno está registrado y false si no lo está
	 */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	/**
	 * 
	 * Metodo que añade una lista de personas a un curso
	 * 
	 */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	/**
	 * 
	 * Metodo que nos muestr cuantos alumnos hay en un curso
	 * @return devuelve el numero de alumnos que hay en un curso
	 */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
