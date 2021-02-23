package ed.examen.modelo;
/**
 * 
 * 
 * @author Alejandro Agudelo
 * Version 1.0.0
 *
 */
public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	
	/**
	 * 
	 * Constructor que nos permite crear una nueva persona
	 * 
	 * @param dni El documento de la persona que queremos crear
	 * @param nombre nombre de la persona que queremos crear
	 * @param apellido1 El  apellido de la persona que queremos crear
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	/**
	 * 
	 * Metodo que nos permite ver el dni de una persona
	 * 
	 * @return devuelve el dni de la persona
	 */
	public String getDni() {
		return dni;
	}
	
	
/**
 * 
 * Metodo que nos permite cambiar el dni de una persona ya creada
 * 
 * @param dni El nuevo dni de la persona
 * @throws Exception Excepcion lanzada si el ultimo caracter no es una letra
 */
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	/**
	 * 
	 * Metodo que nos muestra el nombre de la persona
	 * 
	 * @return nos devuelve el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * Metodo que nos permite cambiar el nombre de una persona
	 * 
	 * @param Nuevo nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * Metodo que nos muestra el apellido de una persona
	 * 
	 * @return nos devuelve el apellido de la persona
	 */
	public String getApellido1() {
		return apellido1;
	}
	
	/**
	 * 
	 * Metodo que nos permite cambiar el apellido de una persona
	 * 
	 * @param apellido1 Nuevo apellido de la persona
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
