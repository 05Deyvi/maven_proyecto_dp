package ejerccios.clase.string;

import java.util.Scanner;

public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String cedula = "";
		Estudiante fila[] = new Estudiante [5];
		
		Estudiante estudiante1= new Estudiante();
	
		estudiante1.setCedula(cedula);
		estudiante1.setNombre("deyvi");
		
		Estudiante estudiante2= new Estudiante();
		estudiante2.setCedula(cedula);
		estudiante2.setNombre("joel");
		
		Estudiante estudiante3 = new Estudiante();
		estudiante3.setCedula(cedula);
		estudiante3.setNombre("sofia");
		
		Estudiante estudiante4= new Estudiante();
		estudiante4.setCedula(cedula);
		estudiante4.setNombre("angel");
		
		
		Estudiante estudiante5 = new Estudiante();
		estudiante5.setCedula(cedula);
		estudiante5.setNombre("marco");
		
		
		fila[0]=estudiante1;
		fila[1]=estudiante2;
		fila[2]=estudiante3;
		fila[3]=estudiante4;
		fila[4]=estudiante5; 
		
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
				 
				 
		      String cedulaBuscar= cedula;
			
				 
				 for(int i =0; i<5; i++) {
					 
					 Estudiante estudiante = fila[i];
					 String cedulaObtenida=estudiante.getCedula();
					 boolean respuestaLocal = cedulaBuscar.equals(cedulaObtenida);
					if(respuestaLocal == true) {
						 boolean respuesta = true;
						 
						 System.out.println("el estudiante  ha sido encontrado");
						 
					 }else {
						 System.out.println("el estudiante no ha sido encontrado");
					 }
				 }

			} else {
				System.out.println("Gracias por consultar");

			}

		} while (o != 3);

	}

}
