package ejercicio2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Prueba {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Frecuencia quijote = new Frecuencia(
				new File("C:\\Users\\fglezm\\Documents\\FP\\Programación\\El Quijote ISO-8859-1.txt"),
				StandardCharsets.ISO_8859_1);
		String palabra;
		System.out.println("palabra (0 para salir)>");

		while (!(palabra = s.nextLine()).equals("0")) {
			System.out.println("Frecuencia: " + quijote.getFrecuencia(palabra));
			System.out.println("palabra (0 para salir)>");
		}
		s.close();
	}
}
