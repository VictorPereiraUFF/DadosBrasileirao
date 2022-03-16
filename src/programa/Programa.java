package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import dados.Times;

public class Programa {

	public static void main(String[] args) {

		List<Times>lista = new ArrayList<>();
		
		lista.add(new Times("Flamengo", 71, 52, 35));
		lista.add(new Times("Botafogo", 59, 43, 39));
		lista.add(new Times("Fluminense", 50, 45, 45));	
		
		Predicate<Times> pred = p -> p.getDefesa() <= 40;
		
		lista.removeIf(pred);
		
		for (Times t : lista) {
			System.out.println(lista);
		}
	}
}
