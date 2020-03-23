package com.bit;
public class Ejercicio2 {
	public static void main(String[] args) {

		double operador1 = 25.5;
		double operador2 = 15.21;

		//Devuelve el entero más cercano por arriba
		//System.out.println(Math.ceil(operador1)); 
		
		//Devuelve el entero más cercano por debajo
		//System.out.println(Math.floor(operador2)); 
		
		//Devuelve un número elevado a un exponente
		//System.out.println(Math.pow(operador1, operador2)); 
		
		//Devuelve el mayor de dos entre dos valores
		//System.out.println(Math.max(operador1, operador2)); 
		
		//Devuelve la raíz cuadrada de un número
		//System.out.println(Math.sqrt(operador1)); 
		
		//Devuelve el arco tangente entre -PI/2 y PI/2
		//System.out.println(Math.atan(operador2));
		
		//Devuelve el arco tangente entre -PI y P
		System.out.println(Math.atan2(operador1, operador2));
		
		//Devuelve la tangente de un ángulo
		//System.out.println(Math.tan(operador1));
	}
}