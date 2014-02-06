/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {

		
		int factorial = 1;
		int numero;	
		int x;
		int val;
   		
		numero= Integer.parseInt(args[0].toString());
		
				
		while(numero!=0) {
		
		factorial = factorial * numero;
		
		numero--;
		}

		{
		
		System.out.println("el producto es: "+factorial);
		
		for(int x = numero; x> 0;x--)
		{
			factorial *=x;
		}
		System.out.println("factorial");
	
		int factorial(int val);{
		
		if(val==0)

		return 1;

		return val*factorial(val-1);
		
		}

   		}
	      }
	    }
	