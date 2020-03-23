package com.bit;
import java.util.Scanner;

//Crea un array de 10 posiciones de números con valores pedidos por teclado.
//Muestra por consola el indice y el valor al que corresponde.
//Haz dos métodos, uno para rellenar valores y otro para mostrar.

public class Ejercicio6 {
	public static void main(String[] args) {

		final int tamanio = 5;
		int num[] = new int[tamanio];

		llenarArreglo(num);
		mostrarArreglo(num);
	}

	public static void llenarArreglo(int lista[]) {
		
		for (int i = 0; i < lista.length; i++) {
			
			System.out.println("ingresa valores: ");
			Scanner n = new Scanner(System.in);
			int num = n.nextInt();
			lista[i] = num;
		}
	}

	public static void mostrarArreglo(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println("En el indice " + i + " esta el valor " + lista[i]);
		}
	}
}
