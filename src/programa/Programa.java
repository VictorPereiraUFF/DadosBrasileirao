package programa;

import java.util.ArrayList;
import java.util.List;

import dados.Times;
import utilidades.Predicado;

public class Programa {

	public static void main(String[] args) {

		List<Times>lista = new ArrayList<>();
		
		lista.add(new Times("Flamengo", 71, 52, 35));
		lista.add(new Times("Botafogo", 59, 43, 39));
		lista.add(new Times("Fluminense", 50, 45, 45));	
		
		lista.removeIf(new Predicado());
		
		for (Times t : lista) {
			System.out.println(lista);
		}
	}
}
