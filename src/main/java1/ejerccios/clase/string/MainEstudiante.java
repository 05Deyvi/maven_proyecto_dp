package ejerccios.clase.string;

import java.util.Scanner;

public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String cedula = "";
		Estudiante fila[] = new Estudiante [5];
		
		Estudiante deyvi= new Estudiante();
	
		deyvi.setCedula(cedula);
		deyvi.setNombre("deyvi");
		
		Estudiante joel= new Estudiante();
		joel.setCedula(cedula);
		joel.setNombre("joel");
		
		Estudiante sofia = new Estudiante();
		sofia.setCedula(cedula);
		sofia.setNombre("sofia");
		
		Estudiante angel= new Estudiante();
		angel.setCedula(cedula);
		angel.setNombre("angel");
		
		
		Estudiante marco = new Estudiante();
		marco.setCedula(cedula);
		marco.setNombre("marco");
		
		
		
		int o = 0;
		do {
			
			Scanner tecladoString = new Scanner(System.in);
			System.out.println("Bienvenido al sistema del Estudiante");
			System.out.println("1. ingresar Estudiante");
			System.out.println("2. Buscar Estudiante");
			System.out.println("3 salir");
			Scanner tecladoInt = new Scanner(System.in);
			int o1 = tecladoInt.nextInt();

			if (o1 == 1) {

				System.out.println("ingrese el numero de cedula del estudiante");
				 cedula = tecladoString.nextLine();
			}
			if (o1 == 2) {
				System.out.println("ingrese cedula para la busqueda del estudiante ");	
				 cedula = tecladoString.nextLine();
				 
				 for(int i =0; i<5; i++) {
					 Estudiante estudiante = fila[i];
					 String cedulaObtenida=estudiante.getCedula();
					 if(cedula.equals(cedulaObtenida)) {
						 System.out.println("el estudiante  ha sido guardado");
						 int opcionguardar=0;
						 opcionguardar++;
					 }else {
						 System.out.println("el estudiante no ha sido guardado");
					 }
				 }

			} else {
				System.out.println("Gracias por consultar");

			}

		} while (o != 3);

	}

}
