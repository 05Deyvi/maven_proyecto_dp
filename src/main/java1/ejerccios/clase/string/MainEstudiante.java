package ejerccios.clase.string;

import java.util.Scanner;

public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
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
				String cedula = tecladoString.nextLine();
			}
			if (o1 == 2) {
				System.out.println("ingrese cedula para la busqueda del estudiante ");
				String cedula = tecladoString.nextLine();

			} else {
				System.out.println("Gracias por consultar");

			}

		} while (o != 3);

	}

}
