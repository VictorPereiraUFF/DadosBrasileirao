package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import dados.Times;
import utilidades.BonusPontuacao;

public class Programa {

	public static void main(String[] args) {

		List<Times>lista = new ArrayList<>();
		
		lista.add(new Times("Palmeiras", 80));
		lista.add(new Times("Santos", 71));
		lista.add(new Times("Flamengo", 71));
		lista.add(new Times("Atl�tico-MG", 62));
		lista.add(new Times("Botafogo", 59));
		lista.add(new Times("Atl�tico-PR", 57));
		lista.add(new Times("Corinthians", 55));
		lista.add(new Times("Ponte Preta", 55));
		lista.add(new Times("Gr�mio", 53));
		lista.add(new Times("S�o Paulo", 52));	
	
		lista.forEach(new BonusPontuacao());
		
		lista.forEach(System.out::println);
		
	}



}
