package prueba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String claveIngresada;
		String opcionMenu;
		int saldoInicial = 2500;
		do {
		System.out.println("ingrese clave: ");
		Scanner teclado =new Scanner(System.in);
		Scanner tecladoInt =new Scanner(System.in);
		
		 claveIngresada = teclado.nextLine();
		
		if (claveIngresada.equals("85BD")) {
			do {
				
			
		System.out.println("BANCO PRODUBANCO elija una opcion");
		System.out.println("1. consultar pagos");
		System.out.println("2. realizar transferencia");
		System.out.println("salir");
		opcionMenu=teclado.nextLine();
		
		if(opcionMenu.equals("1")) {
			
			System.out.println("No tiene un pago pendiemte");
			
		}else if(opcionMenu.equals("2")) {
			
			System.out.println("Ingrese la cuenta de destino");
			 String cuentaDestino = teclado.nextLine();
			 System.out.println("ingrese el monto a transferir");
			 int montoTransferir =tecladoInt.nextInt();
			 saldoInicial=saldoInicial = montoTransferir;
			 System.out.println("su nuevo saldo es:  "  +saldoInicial);
			 
		}
		
		
		}while(opcionMenu.equals("3") );
			claveIngresada="0";
			
		}else {
			System.out.println(" la clave no es correcta");
		}
		}while(claveIngresada.equals("-1"));
		System.out.println("gracias por preferirnos");
		
		
		
	}

}
