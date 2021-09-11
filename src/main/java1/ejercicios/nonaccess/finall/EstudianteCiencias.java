package ejercicios.nonaccess.finall;

public final class EstudianteCiencias extends Estudiante {

	public final String horarioEntrada = "08:00";
	public String ciudadNacimiento = "Quito";
	

	public EstudianteCiencias() {
		// nsoe puede reasignar un valor de una clase final 
		horarioEntrada = "08:30";
		ciudadNacimiento ="guayaquil";
	}

}
