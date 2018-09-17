package com.airwave.holamundo;

public class HolaMundo {

	public static void main(String[] args) {
		
		int i9 = 7;
		char c9 = 'w'; 
		System.out.println((i9 >= 6) && (c9 == 'w'));

		
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
		//mala practica hacer arrays de mas de 3 dimensiones
		
		/**
		 * La diferencia entre colocar los corchetes en el tipo de variable y colocarlos en el nombre de la variable, es que 
		 * en el primer caso todas las variables declaradas serán arreglos, 
		 * mientras que en la segunda solo las variables con corchetes serán arreglos.

		// Todas las variables declaradas serán arreglos
		int[] arreglo1, arreglo2;
		// Solo la variable con [] será un arreglo
		int arreglo3[], arreglo4;
		
		arreglo1 = newint[4]; // Correcto
		arreglo2 = newint[4]; // Correcto
		arreglo3 = newint[4]; // Correcto
		arreglo4 = newint[4]; // Error*/
		
		int[] intArray = new int[2];
		double doubleArray[];
		
		int[][] array2D = new int[2][3];
		
		int[][][] array3D = new int[3][3][2];
		
		int[][][][] array4D = new int[1][2][3][4];
		
		char[][] days = {{'M', 'T', 'W'}, {'m','t', 'w'}};
		
		char[][][] days2 = {{{'a', 'b', 'c'}, {'a', 'b', 'c'}, {'a', 'b', 'c'}}, {{'a', 'b', 'c'}, {'a', 'b', 'c'}, {'a', 'b', 'c'}}};
		
		char[] names = new char[4];
		names[0] = 'h';
		names[1] = 'o';
		names[2] = 'l';
		names[3] = 'a';
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		
		char[][][][] monkey = new char[2][3][2][2];
		monkey[1][0][0][1] = 'm';
		System.out.println(monkey[1][0][0][1]);
		
		//Operadores artimeticos
		int n1 = 1;
		int n2 = n1 + n1;
		System.out.println("El valor de n2 es " + n2);
		
		double n3 = 2.56;
		int n4 = 9;
		float n5 = (float)n3 + n4;
		System.out.println(n5);
		
		System.out.println(n5 * 2);
		
		double k = 4/0.00002;
		System.out.println(k);
		
		System.out.println(7 % 2);
		
		int f = 2;
		int g = 3;
		f = f + g;
		f += g;
		f -= g;
		f *= g;
		f /= g;
		f %= g;
		System.out.println(f);
		
		//Operador incremento - decremento
		
		int l = 3;
		l++;	//asigna y aumenta
		++l;	//aumenta y asigna
		System.out.println(l);
		
		//Operadores de equidad
		int v1 = 5;
		int v2 = 4;
		System.out.println(v1 == v2);
		
		//Operadores relacionales
		System.out.println("v1 > v2 -> " + (v1 > v2));
		System.out.println("v1 < v2 -> " + (v1 < v2));
		System.out.println("v1 >= v2 -> " + (v1 >= v2));
		System.out.println("v1 <= v2 -> " + (v1 <= v2));
		
		//Operadores logicos
		boolean m1 = false;
		boolean m2 = true;
		System.out.println("m1 && m2 -> " + (m1 && m2));
		System.out.println("m1 || m2 -> " + (m1 || m2));
		System.out.println("!m1 -> " + (!m1));
		System.out.println("!m2 -> " + (!m2));
		
		//Controles de flujo
		//	if/else
		
		if(v1 > v2) {
			//true
			System.out.println("si es mayor");
		}else {
			//false
			System.out.println("no es mayor");
		}
		v2 += 2;
		if(v1 > v2) {
			//true
			System.out.println("si es mayor");
		}else {
			//false
			System.out.println("no es mayor");
		}
		v1++;
		if(v1 == v2) {
			//true
			System.out.println("son iguales");
		}else {
			//false
			System.out.println("no es mayor");
		}
		
		//	switch
		int mes = 3;
		switch (mes) {
		case 1:
			System.out.println("enero");
			break;
		case 2:
			System.out.println("febrero");
			break;
		case 3:
			System.out.println("marzo");
			break;
		default:
			System.out.println("otro mes");
			break;
		}
		
		//	while
		int e = 1;
		while(e <= 5) {
			System.out.println("e es igual a " + e);
			e++;
		}
		
		//	do while
		int numVer = 5;
		int intent = 0;
		boolean ver = false;
		do {
			if(intent == numVer) {
				System.out.println("Intento 5 autorizado");
				ver = true;
			}else {
				System.out.println("Intento " + intent + " no autorizado");
				intent++;
			}
		} while (ver != true);
		System.out.println("luego de 5 intentos se dio autorizacion");
		
		int[] numeros = new int[5];
		
		
		//	for
		for(int c = 0; c < 5; c++) {
			numeros[c] = 2 + c;
			System.out.println("indice: " + c + " valor:" + numeros[c]);
			
		}
		
		//	foreach
		for (int j : numeros) {
			System.out.println(j);
		}
		
		//Break
		//La sentencia “break” termina el bucle inmediatamente, y el control del programa 
		//se mueve a la siguiente sentencia después del bucle.
		
		for (int ii = 1; ii <= 10; ++ii) {      
	         if (ii == 5) {
	            break;
	         }      
	         System.out.println(ii);
	     }
		
		//Continue
		//La sentencia “continue” salta la iteración actual de un bucle.
		
		for (int ix = 1; ix <= 10; ++ix) {      
	         if (ix > 4 && ix < 9) {
	            continue;
	         }      
	         System.out.println(ix);
		}
		//Return
	    //es usado para retornar un valor u objeto o salirse de un método. 
		//Causando que el control del programa sea transferido a la instrucción 
		//que invoco el metodo.     
	    
		if (true)
	        return;

	    // Compiler will bypass every statement 
	    // after return
	    System.out.println("This won't execute.");
	    
	    // for anidado
	    //Definimos un array de 3 filas x 5 columnas
        int array[][]={{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
 
        //Recorremos el array multidimensional
        for (int ie=0;ie<array.length;ie++){
            for(int je=0;je<array[0].length;je++){
                System.out.println(array[i][je]);
            }
        }
        
        /*
         * Clases anidadas (nested class / inner class)
         * 
         * ej)
         * class ClaseExterio{
         * 	
         * 	class ClaseAnidada {
         * 
         * 	}
         * }
         * 
         * surge a base de la necesidad de tener agrupada la logica para 
         * ciertos modelos de clases, aveces no necesitamos que la clase 
         * sea independiente, sino interior a otra. Tambien para anidar cosas
         * pequenas
         * 											Nested classes
         * 								/												\
         * 	 >						inner classes				<					static nested classes
         * 	/							|						 \
         * inner clases		method local inner classes 	Anonymous inner classes
         * como el ej--		--clase dentro de metodo--		--como clases abstractas
         * 
         * Clase estatica ejemplo:
         * 
         * public class ClaseExterior{
         * 		static class ClaseStaticaAnidada{
         * 			// - no es recomendable mas de 3 clases anidadas
         *			// - no necesitamos crear instancias para llamarlas
         *			// - no pueden ser privados
         *			// - solo pueden llamar metodos estaticos(de la clase exterior) dentro de estas
         *			// - en android y en spring se usas muchas clases anidadas
         * 		}
         * 
         * 		class ClaseInterna{
         * 
         * 		}
         * }
         * 
         * ejemplo 2)
         * 
         * public class Enclosing {
         * 		
         * 		private static int x = 1;
         * 
         * 		public static class StaticNested {
         * 			
         * 			private void run() {
         * 
         * 				//method impl
         * 
         * 			}
         * 
         * 		}
         * 
         * 		@Test
         * 		public void test() {
         * 
         * 		Enclosing.StaticNested nested = new Enclosing.StaticNested();
         * 		nested.run();
         * 
         * 		}
         * 
         * }
         * 
         * ejemplo clases anidadas - inner
         * 
         * public class Outer {
         * 
         * 		public class Inner {
         * 			// ...
         * 		}
         * 
         * }
         * 
         * Instancia:
         * Outer outer = new Outer();
         * Outer.Inner inner = outer.new Inner();
         * 
         * ejemplo clases locales al metodo:
         * 
         * public class NewEnclosing {
         * 
         * 		void run() {
         * 			class Local {
         * 				void run() {
         * 					//method impl
         * 				}
         * 			}
         * 			Local local = new Local();
         * 			local.run();
         * 		}
         * 
         * 		@Test
         * 		public void test() {
         * 			NewEnclosing newEnclosing = new NewEnclosing();
         * 			newEnclosing.run();
         * 		}
         * 
         * ejemplo clases anonimas:
         * 
         * abstract class SimpleAbstractClass {
         * 		abstract void run();
         * }
         * 
         * public class AnonymousInnerTest {
         * 		@Test
         * 		public void whenRunAnonymousClass_thenCorrect() {
         * 			SimpleAbstractClass sac = new SimpleAbstractClass(){
         * 				void run() {
         * 					// method impl
         * 				}
         * 			};
         * 			simpleAbstractClass.run();
         * 		}
         * }
         * 
         * }
         * 
         * */
        
        //Enumerations
        
        /*
         * 	Los enumerations son tipos de datos muy especiales pues es el único tipo de dato que posee una colección de constantes, al ser constantes estaremos obligados a escribirlos con mayúsculas.

			Usaremos enum cada vez que necesitemos representar un conjunto fijo de constantes. Por ejemplo los días de la semana.

			Así podemos declarar un enumeration usando la palabra reservada enum.
			
			public enumDay { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
			Day.FRIDAY;
			
			public enumDay {
			  SUNDAY("Domingo"),
			  MONDAY("Lunes"),
			  TUESDAY("Martes"),
			  WEDNESDAY("Miercoles"),
			  THURSDAY("Jueves"),
			  FRIDAY("Viernes"),
			  SATURDAY("Sabado")
			
			  private String spanish;
			  private Day(String s) { spanish = s; }
			  public String getSpanish() { return spanish; }
			}
			
			Day.MONDAY  # MONDAY
			Day.MONDAY.getSpanish()  # Lunes
         * */
        
        
		
	}

}
