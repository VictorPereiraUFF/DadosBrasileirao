package utilidades;

import java.util.function.Predicate;

import dados.Times;

public class Predicado implements Predicate<Times>{

	@Override
	public boolean test(Times t) {
		return t.getPontos() >= 60;
	}

}
