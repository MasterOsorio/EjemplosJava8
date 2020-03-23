package com.bit;

public class Ejemplo1 {
	public void tirarDados() {

		System.out.println("Dos jugadores realizan lanzamiento de dados.");
		
		//Math.random elige un numero aleatorio en este caso limitado hasta 6
		//Math.round devuelve el numero entero mas cercano
		double aux1 = (Math.random() * 6) + 0.5;
		double aux2 = (Math.random() * 6) + 0.5;
		double intento1 = Math.round(aux1);
		double intento2 = Math.round(aux2);
		int jugador1 = (int) intento1;
		int jugador2 = (int) intento2;

		System.out.println("El jugador 1 ha sacado: " + jugador1 + " y el jugador 2 ha sacado: " + jugador2);

		int ganador = Math.max(jugador1, jugador2);

		System.out.println("Quien sacó " + ganador + " es el ganador :D Felicitaciones");
	}

	public static void main(String args[]) {
		Ejemplo1 c = new Ejemplo1();
		c.tirarDados();
	}
}
