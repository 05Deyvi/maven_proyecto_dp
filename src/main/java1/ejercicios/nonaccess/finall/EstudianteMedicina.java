package ejercicios.nonaccess.finall;

public class EstudianteMedicina {

	
	private String CodigoMSP;
	
	protected final void realizarPracticas() {
		System.out.println("realizar 50 horas de practicas");
	}
	
	protected void realizarPasantias() {
		System.out.println("realizar 100 horas de pasantias");
	
	}
}
