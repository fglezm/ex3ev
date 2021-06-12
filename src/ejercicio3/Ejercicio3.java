package ejercicio3;

import java.util.*;

public class Ejercicio3 {

	public static void invertir(int n, Queue<Integer> q) {

		if (n <= 0)
			return;
		if (q == null || n > q.size())
			throw new IllegalArgumentException();
		Deque<Integer> p = new ArrayDeque<>();
		int r = q.size() - n;
		
		while (n-- > 0)
			p.push(q.poll());// quitamos los cuatro primeros de q y los vamos metiendo en p
		
		while (!p.isEmpty())
			q.offer(p.pop());// añadimos al final de q los de p y este queda vacio
		
		while (r-- > 0) // añadimos los que no tenemos que cambiar al final 
			q.offer(q.poll());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer>(Arrays.asList(2, 13, -42, 21, 4, 9, 14, -3, 11, 5));
		//cola FIFO
		System.out.println(q);
		invertir(4, q);
		System.out.println(q);
		

	}

}
