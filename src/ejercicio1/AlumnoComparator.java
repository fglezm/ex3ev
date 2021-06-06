package ejercicio1;

import java.io.Serializable;
import java.util.Comparator;

public class AlumnoComparator implements Comparator<Alumno>, Serializable {

	@Override
	public int compare(Alumno o1, Alumno o2) {

		int resultado = o1.getCiclo().compareTo(o2.getCiclo());
		if (resultado == 0)
			resultado = o1.getCurso().compareTo(o2.getCurso());
		if (resultado == 0)
			resultado = o1.getApellidos().compareTo(o2.getApellidos());
		if (resultado == 0)
			resultado = o1.getNombre().compareTo(o2.getNombre());
		return resultado;
	}

}
