package com.bit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomFileReader {
	
	public List<String> readFromFile(String path) throws IOException {
		
		List<String> lista = new ArrayList<>();
		// Verificacion de existencia de archivo
		File archivo = new File(path);
		if (!archivo.exists()) {
			System.out.println("No existe");
		} else {
			/*
			 * BufferedReader es una clase que simplifica la lectura de un texto de una secuencia de entrada de caracteres
			 * almacena los caracteres para permitir una lectura eficiente de los datos de texto.
			 * PrintWriter es un objeto que nos permite imprimir representaciones formateadas de una salida
			 * de stream de texto.
			 * Las clases FileReader y FileWriter permiten leer y escribir, respectivamente, en un fichero
			 * deben estar dentro de un bloque try
			 * readLine lee una línea de texto hasta que encuentra un carácter de salto de línea (\n)
			 * y retorno de carro (\r).
			 */
			BufferedReader inputStream = null;
			//PrintWriter outputStream = null;

			try {
				inputStream = new BufferedReader(new FileReader(archivo));
				//outputStream = new PrintWriter(new FileWriter(salida));

				String l;
				while ((l = inputStream.readLine()) != null) {
					//outputStream.println(l);
					
					lista.add(l);
					
				}
			} finally {
				if (inputStream != null) {
					inputStream.close();
				}
				//if (outputStream != null) {
					//outputStream.close();
				//}
			}
		}
		
		return lista;
	}

	public static void main(String[] args) throws IOException {

		// variable entrada guarda la ruta del archivo de entrada
		String entrada = "C:\\Users\\Adrian\\eclipse-workspace\\ejemplosJava8\\src\\main\\resources\\nombres";
		// variable salida guarda la ruta del archivo de salida, es un nuevo archivo,
		// es la copia del archivo de entrada pero con diferente nombre
		String salida = "C:\\Users\\Adrian\\eclipse-workspace\\ejemplosJava8\\src\\main\\resources\\salida";
		// Comprobacion
		CustomFileReader fr = new CustomFileReader();
		fr.readFromFile(entrada);

		/*
		 * FileReader inputStream = null; //FileWriter outputStream = null;
		 * 
		 * try { inputStream = new FileReader(entrada); //outputStream = new
		 * FileWriter(salida);
		 * 
		 * int c; while ((c = inputStream.read()) != -1) { //outputStream.write(c);
		 * System.out.println(c); }
		 * 
		 * } finally { if (inputStream != null) { inputStream.close(); } //if
		 * (outputStream != null) { //outputStream.close(); //}
		 * 
		 * }
		 */
		for(String i : fr.readFromFile(entrada)) {
			System.out.println(i);
		}
	}
}
