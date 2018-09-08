package com.airwave.holamundo;

public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("Hola mundo :)");
		
		//Datos primitivos **Todos los primitivos empizan en minuscula*
		
		// Enteros
		byte edad = 17; // Byte / 1Byte --> -128 a 127
		short year = 2020; // Short / 2Bytes --> -32768 a 32767
		int id_User = 1001; // Int / 4Bytes --> 2147483648 a 2147483647
		long id_Twitter = 138434834738743L; // Long / 8Bytes --> -9223372036854775808	9223372036854775807
		
		//Punto flotante
		float diametro = 32.25F;  // float / 4Bytes - colocar f al final para que sepa que es float
		double precio = 12345.565487123; // double / 8Bytes 
		
		//Texto
		char genero = 'M'; // char / 2Bytes
		
		//Logico
		boolean isVisible = true; // boolean / 2Bytes
		boolean funciona = false;
		
		//Naming
		int variable = 1;
		int Variable = 2;
		int _variable = 3;
		int $variable = 4;
		//int 2variable = 5; -- nunca empizan con numeros
		
		int VALOR = 0; // constantes siempre en mayus
		int VALOR_MAX = 10;
		// uper camel case: nombres de clases y archivos ej: NomClass NomFile
		// lower camel case: nombres de variables, objetos o metodos ej: sumMethod, int minValor
		
		//Cast
		double z = 86.45;
		int y = (int) z;
		
		//   ******===>*******===>*****===>******===>*******===>********
		//   *byte*    *short*    *int*    *long*    *float*    *double*
		//   ******<---*******<---*****<---******<---*******<---********
		//    ^           ^         ^     
		//     \          |        /			==> : conversion automatica
		//      \         |       /				--> : requiere cast
		//       v        v       v				
		//   **************************
		//   *         char           *
		//   **************************
		
		byte b = 6;
		short s = b;
		
		b = (byte)s;
		
		int i = 1;
		double d = 2.5;
		i = (int)d;	//no redondea el dato (i = 3) lo trunquea (truncate) (i = 2) por lo que pierde los decimales
		
		int codigo = 97;
		char codigoASCII = (char)codigo;
		
		System.out.println(codigoASCII);
		
		//cast funciona pero byte solo almacena desde -128 hasta 127 por lo tanto si le agregamos un numero mayor
		//recorre desde el -128 de nuevo
		// EJ) si num = 128 entonces numByte = -128, si num = 129 entonces numbyte = -127, num = 300; numByte = 44
		short num = 30000;
		byte numByte = (byte)num;
		System.out.println(numByte);
		
		/**Teoria
		 * 
		CONVERSIONES NO SEGURAS
		No todos los Cast de variables se puede convertir de forma segura.
		
		Ejemplo:
		Al convertir un Short de 2 bytes a Byte que contiene 1 Byte se deberá cortar los bits superiores ocasionando pérdidas de información.

		short datoShort = 259;
		byte datoByte = (byte) datoShort;

		Al imprimir la variable “datoByte” da como resultado: 3

		259: En binario es 0 0 0 0 0 0 0 1 0 0 0 0 0 0 1 1 que equivale a 2 bytes.

		Al castearlo en Byte toma los primeros 8 bits del lado derecho. 0 0 0 0 0 0 1 1 (descartando el bit 1 de la posición 8). Este binario en formato decimal corresponde a 3.
		 * 
		 * */
		
		//Arreglos
		//definir el tamano  de los arreglos sino no podremos usarlos
		
		
		
		
	}

}
