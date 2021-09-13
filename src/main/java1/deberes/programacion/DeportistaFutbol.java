package deberes.programacion;

public  class DeportistaFutbol extends Deportista {

	
	public final String horaEntrenamiento = "07:00";
	public String equipo = "Manchester United";
	
	
	public DeportistaFutbol() {
		
		// nose puede reasignar un valor de una clase final 
		horaEntrenamiento="8:30";
		equipo = "Juventus";
	
		
	}
	
	
	public final void entrenar() {
		System.out.println("entrenar las 6 horas para el campeonato");
	}
}
