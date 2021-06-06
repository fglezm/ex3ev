package ejercicio1;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Prueba {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Set<Alumno> alumnos1 = new TreeSet<>();

		alumnos1.add(new Alumno("Fernando", "L�pez", LocalDate.of(1997, 10, 30), "DAW", 1));
		alumnos1.add(new Alumno("Ana", "Rodr�guez", LocalDate.of(1990, 1, 3), "DAM", 2));
		alumnos1.add(new Alumno("Mar�a", "Navarro", LocalDate.of(2000, 5, 15), "DAW", 1));

		Set<Alumno> alumnos2 = new TreeSet<>(new AlumnoComparator());
		alumnos2.addAll(alumnos1);

		System.out.println(alumnos1);
		System.out.println(alumnos2);

		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("alumnos")))) {
			out.writeObject(alumnos1);
			out.writeObject(alumnos2);
		}

	}

}
