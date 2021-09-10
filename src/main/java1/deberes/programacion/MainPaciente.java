package deberes.programacion;

import java.util.Scanner;

public class MainPaciente extends Paciente {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	
		
		Paciente fila[] = new Paciente [5];
		Paciente paciente1 = new Paciente();
	
		paciente1.setApellido(nombre);
		paciente1.setApellido(apellido);
		paciente1.setEdad(edad);
		paciente1.setDolor(dolor);
		

		Paciente paciente2 = new Paciente();
		paciente2.setNombre(nombre);
		paciente2.setApellido(apellido);
		paciente2.setEdad(edad);
		paciente2.setDolor(dolor);
		

		Paciente paciente3 = new Paciente();
		paciente3.setNombre(nombre);
		paciente3.setApellido(apellido);
		paciente3.setEdad(edad);
		paciente3.setDolor(dolor);
		

		Paciente paciente4 = new Paciente();
		paciente4.setNombre(nombre);
		paciente4.setApellido(apellido);
		paciente4.setEdad(edad);
		paciente4.setDolor(dolor);
		
		
		
		fila[0]=paciente1;
		fila[1]=paciente2;
		fila[2]=paciente3;
		fila[3]=paciente4;
		
		
		
		
		int o = 0;
        do {
			
			Scanner tecladoString = new Scanner(System.in);
			Scanner tecladoInt = new Scanner(System.in);
			
			System.out.println("Bienvenido al sistema del Paciente");
			System.out.println("1. registar Paciente");
			System.out.println("2. imprimir reporte");
			System.out.println("3 salir");
			
			int o1 = tecladoInt.nextInt();
			if (o1 == 1) {
				
				System.out.println("ingrese su nombre: ");
				nombre = tecladoString.nextLine();
				System.out.println("ingrese su apellido");
				apellido = tecladoString.nextLine();
				System.out.println("ingrese su edad");
				edad = tecladoInt.nextInt();
				System.out.println("ingrese el dolor que presemta ");
				dolor = tecladoString.nextLine();
				
			}

			if (o1 == 2) {
				
				
				
				
			}

	}while (o != 3);
		
	}

	

	
	}
	
	




