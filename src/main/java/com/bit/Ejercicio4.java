package com.bit;
import java.util.InputMismatchException;
import java.util.Scanner;


//Crea una aplicaci�n que nos calcule el �rea de un circulo, cuadrado o triangulo.
//Pediremos que figura queremos calcular su �rea y seg�n lo introducido pedir� los valores necesarios
//para calcular el �rea. Crea un m�todo por cada figura para calcular cada �rea, este devolver� un n�mero real.
//Muestra el resultado por pantalla

public class Ejercicio4 {
	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion; // Guardaremos la opcion del usuario

		while (!salir) {

			System.out.println("1. Circulo");
			System.out.println("2. Triangulo");
			System.out.println("3. Cuadrado");
			System.out.println("4. Salir");

			try {

				System.out.println("Escribe una de las opciones");
				opcion = sn.nextInt();

				switch (opcion) {
				case 1:
					System.out.println("Introduce un valor numerico: ");
					double valor1 = 0;
					Scanner v1 = new Scanner(System.in);
					valor1 = v1.nextDouble();
					System.out.println("El area del circulo es: " + Math.PI * Math.pow(valor1, 2));
					break;
				case 2:
					System.out.println("Introduce un valor numerico para la base: ");
					System.out.println("Introduce un valor numerico para la altura: ");
					double base = 0;
					double altura = 0;
					Scanner b = new Scanner(System.in);
					Scanner a = new Scanner(System.in);
					base = b.nextDouble();
					altura = a.nextDouble();
					System.out.println("El area del triangulo es: " + (base * altura) / 2);
					break;
				case 3:
					System.out.println("Introduce un valor numerico: ");
					double lado = 0;
					Scanner l = new Scanner(System.in);
					lado = l.nextDouble();
					System.out.println("El area del cuadrado es: " + lado * lado);
					break;
				case 4:
					salir = true;
					break;
				default:
					System.out.println("Solo n�meros entre 1 y 4");
				}

			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un n�mero");
				sn.next();
			}
		}
	}
}
