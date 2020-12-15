package es.studium.leer10numeros;

import java.util.Scanner;

public class leer10numeros
{

	public static void main(String[] args)
	{
		final int TAM = 10;
		int tabla[]=new int[TAM];
		int suma;
		suma = 0;
		Scanner teclado = new Scanner (System.in);
		for (int i=0;i<TAM;i++)
		{
			System.out.println("Ingrese el valor de la posicion " +i);
			tabla[i] = teclado.nextInt(); 

		}
		for (int i=0;i<=TAM-1;i++)
		{
			suma = (suma+tabla[i]);
		}
		System.out.println("La media de todos los números introducidos es: "+ media(suma)); 	
		for (int i = 0; i <= 9; i++) 
		{ 
			System.out.println(tabla[i]); 
		} 

		teclado.close(); 

	}
	public static float media(int suma)
	{
		final int TAM=10;
		float resultado;
		resultado = (float)suma /TAM;
		return (resultado);
	}


}
