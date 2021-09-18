package ejercicios.seleccion.switchs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		// el switch hasta antes de la version 1.7
		// solo funcionaba para byte, short , char e int
		String opcion;

		do {
			System.out.println("Escoja  opcion");
			System.out.println("1. realizar transferencia");
			System.out.println("2 consultar pagos");
			System.out.println("3 salir");
			opcion = teclado.nextLine();

			switch (opcion) {
			case "1":
				System.out.println("ingrese numero de cuenta");
				break;
			case "2":
				System.out.println("no existen pagos ");
				break;
			case "3":
				System.out.println("cerrando sistema");
				break;
			default:
				System.out.println("no ha elegido ninguna opcion valida");
				break;
			}
			
		} while (!opcion.equals("3"));
		System.out.println("gracias por preferirnos");
	}

}
