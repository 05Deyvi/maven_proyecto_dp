package ejercicios.nonaccess.staticos;

public class MainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paciente paciente1= new Paciente();
		paciente1.setNombre("juanito");
		paciente1.setEdad(25);
		
		paciente1.registar(paciente1.getNombre());
		Paciente.consultarNacionalidadStatica();

	}

}
