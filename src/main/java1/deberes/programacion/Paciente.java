package deberes.programacion;

public class Paciente implements Comparable<Paciente>{
	
	protected static String nombre;
	protected static String apellido;
	protected static String dolor;
	protected static int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDolor() {
		return dolor;
	}
	public void setDolor(String dolor) {
		this.dolor = dolor;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int compareTo(Paciente o) {
		// TODO Auto-generated method stub
	
	
	if (this.edad < o.getEdad()) {
		return 0;
	
	}else if(Paciente.edad==o.getEdad()) {
		return 1 ;
	}else {
		return -1;
		
	}
		
	
}
	
	
	}
	

	


