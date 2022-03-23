package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import dados.Times;

public class Programa {

	public static void main(String[] args) {

		List<Times>lista = new ArrayList<>();
		
		lista.add(new Times("Palmeiras", 80, 62, 32));
		lista.add(new Times("Santos", 71, 59, 35));
		lista.add(new Times("Flamengo", 71, 52, 35));
		lista.add(new Times("Atlético-MG", 62, 61, 53));
		lista.add(new Times("Botafogo", 59, 43, 39));
		lista.add(new Times("Atlético-PR", 57, 38, 32));
		lista.add(new Times("Corinthians", 55, 48, 42));
		lista.add(new Times("Ponte Preta", 55, 48, 52));
		lista.add(new Times("Grêmio", 53, 41, 44));
		lista.add(new Times("São Paulo", 52, 44, 36));	
		
		
		List<String>times = lista.stream().map(t -> t.getTime().toLowerCase()).collect(Collectors.toList()); 
		
		times.forEach(System.out::println);

	}

}
