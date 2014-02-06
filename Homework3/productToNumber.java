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
   		String num= args[0];
		
numero = Integer.parseInt(num);

				System.out.print(1);
	for (int i = 1; i <= numero; i ++)

		{
		factorial = factorial * i;
		if(i!=1){
		System.out.print(" x " + i);
		}
		
   		}
		System.out.println("="+factorial);
	      }
	    }
	