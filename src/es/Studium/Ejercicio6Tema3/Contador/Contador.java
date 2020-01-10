package es.Studium.Ejercicio6Tema3.Contador;

import java.util.Scanner;

public class Contador 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int tabla[] = new int[2];
		int numero=1, contador1=0, contador2=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Vamos a contar los numeros positivos y negativos que introduzca");
		System.out.println("Puede segir introduciendo numeros hasta que ingrese el número '0'");
		while (numero!=0)
		{
			System.out.println("Ingrese un número");
			numero = teclado.nextInt();
			if(numero<0)
			{
				contador1=contador1+1;
				tabla[0] = contador1;
			}
			else if (numero>0)
			{
				contador2=contador2+1;
				tabla[1] = contador2;
			}
		}
		System.out.println("Ha introducido "+ tabla[1]+" números positivos y "+tabla[0]+" números negativos");
		teclado.close();
	}
}
