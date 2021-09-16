package ejercicios.clases.wrappers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// byte primitivo

		byte datoByte = 2;
		Byte datoByteWrapper = 3;// wrapper

		System.out.println("primitivo: " + datoByte);
		System.out.println("Wrapper: " + datoByteWrapper);
		// conversiones
		byte datoByte1 = 6;
		Byte datoConvertido = datoByte1;
		System.out.println("Byte convertido: " + datoConvertido);
		// conversiones 2
		Byte datoConvertido2 = 6;
		byte datoByte2 = datoConvertido2.byteValue();
		System.out.println("dato byte:" + datoByte);

		// short
		short datoShort = 1;// primitivo
		Short datoShortWrapper = 1;// wrapper
		System.out.println("primitivo: " + datoShort);
		System.out.println("Wrapper: " + datoShortWrapper);
		// conversion 1
		short datoShort1 = 4;
		Short shortConvertido = datoShort1;
		System.out.println("Short Convertido: " + shortConvertido);
		// conversion 2
		Short shortConvertido2 = 5;
		short datoShort2=shortConvertido2.shortValue();
		System.out.println("Short Convertido: " + datoShort);

		// int
		int edad = 45;// primitivo
		Integer edadWrapper = 48;// wrapper
		System.out.println("primitivo: " + edad);
		System.out.println("Wrapper: " + edadWrapper);
		// conversiones
		int edad1 = 45;
		Integer IntegerConvertido = 50;
		// conversiones 2
		Integer IntegerConvertido2 = 23;
		int edad2 = IntegerConvertido2.intValue();
		System.out.println("int  convertido: " + edad2);

		// long
		long valorGrande = 125344L;// primitivo
		Long valorGrandeWrapper = 123123L;// wrapper

		System.out.println("primitivo: " + valorGrande);
		System.out.println("Wrapper: " + valorGrandeWrapper);
		//onversiones 1
		long valorGrande1 = 54647L;
		Long valorConvertido1 = valorGrande1;
		System.out.println("valor convertido: " + valorGrande1);
		// converion 2
		
		Long valorConvertido2 = 23642L;
		long valorGrande2 = valorConvertido2.longValue();
		System.out.println("valor convertido:" + valorGrande2);
		

		// float
		float valorFlotante = 128737F;// primitivo
		Float valorFlotanteWrapper = 12873F;// wrapper

		System.out.println("primitivo: " + valorFlotante);
		System.out.println("Wrapper: " + valorFlotanteWrapper);
		
		//conversiones  1
		float valorFlotante1 = 1647477F;
		Float FloatConvertido1= valorFlotante1 ;
		System.out.println("valor convertido: " +FloatConvertido1 );
		// conversiones 2
		Float FloatConvertido2= 632535F;
		float valorFlotante2=FloatConvertido2.floatValue();
		System.out.println("valor flotante:" +valorFlotante2);

		// double

		double valorDoble = 10.3;// primitivo
		Double valorDobleWrapper = 10.3;// wrapper

		System.out.println("primitivo: " + valorDoble);
		System.out.println("Wrapper: " + valorDobleWrapper);
		// conversiones 1
		double valorDoble1 = 20.3;
		Double DoubleConvertido1=valorDoble1;
		System.out.println("double convertido" + DoubleConvertido1);
		//conversiones 2
		Double DoubleConvertido2= 50.4;
		double valorDoble2=DoubleConvertido2.doubleValue();
		System.out.println("Double convertido " + valorDoble2);

		// char
		char valorUno = 8;// primitivo
		Character valorUnoWrapper = 8;// wrapper

		System.out.println("primitivo: " + valorUno);
		System.out.println("Wrapper: " + valorUnoWrapper);
		// conversiones 1
		char valorUno1 = 5;
		Character charConvertido1=valorUno1;
		System.out.println("char convertido" + charConvertido1);
		// conversiones 2
		Character charConvertido2= 7;
		char valorUno2=charConvertido2.charValue();
		System.out.println("char convertido" + valorUno2);

		// boolean
		boolean valor = true;// primitivo
		Boolean valorWrapper = true;// wrapper

		System.out.println("primitivo: " + valor);
		System.out.println("Wrapper: " + valorWrapper);
		// conversiones 1
		boolean valor1 = false;
		Boolean Booleanconvertido1=valor1;
		System.out.println("valor boolean " + Booleanconvertido1);
		// conversiones 2
		Boolean Booleanconvertido2 = true;
		boolean valor2 = Booleanconvertido2.booleanValue();
		System.out.println("boolean convertido " + valor2 );
		

	}

}
