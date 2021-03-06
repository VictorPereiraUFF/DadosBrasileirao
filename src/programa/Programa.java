package programa;

import java.util.ArrayList;
import java.util.List;

import dados.Times;
import utilidades.SomarPontuacao;

public class Programa {

	public static void main(String[] args) {

		List<Times>lista = new ArrayList<>();
		
		lista.add(new Times("Palmeiras", 80, 62, 32));
		lista.add(new Times("Santos", 71, 59, 35));
		lista.add(new Times("Flamengo", 71, 52, 35));
		lista.add(new Times("Atl?tico-MG", 62, 61, 53));
		lista.add(new Times("Botafogo", 59, 43, 39));
		lista.add(new Times("Atl?tico-PR", 57, 38, 32));
		lista.add(new Times("Corinthians", 55, 48, 42));
		lista.add(new Times("Ponte Preta", 55, 48, 52));
		lista.add(new Times("Gr?mio", 53, 41, 44));
		lista.add(new Times("S?o Paulo", 52, 44, 36));	
		
		
		SomarPontuacao sp = new SomarPontuacao();
		
		int soma = sp.somaFiltrada(lista, t -> t.getTime().charAt(0) != 'A');
		
		System.out.println("Soma: " +  soma);

	}

}
