package utilidades;

import java.util.List;
import java.util.function.Predicate;

import dados.Times;

public class SomarPontuacao {

	public int somaFiltrada(List<Times>lista, Predicate<Times> condicao) {
		int soma = 0;
		for (Times t : lista) {
			if(condicao.test(t)) {
				soma += t.getPontos();
			}
		}
		return soma;
	}
	
	

}