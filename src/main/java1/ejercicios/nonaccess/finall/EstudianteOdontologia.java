package ejercicios.nonaccess.finall;

public class EstudianteOdontologia extends EstudianteMedicina {
	
	//no se puede sobreescrbir un metodo final del padre
	@Override
	public  void realizarPracticas() {
		System.out.println("realizar 100 horas de practicas");
		
	}

	protected void realizarPasantias() {
		System.out.println("realizar 100 horas de pasantias");
	}
}
