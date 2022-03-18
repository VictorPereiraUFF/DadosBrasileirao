package utilidades;

import java.util.function.Consumer;

import dados.Times;

public class BonusPontuacao implements Consumer<Times>{

	@Override
	public void accept(Times t) {
		// TODO Auto-generated method stub
		if (t.getPontos() >= 70) {
			t.setPontos(t.getPontos() + 15);
		}
		else if (t.getPontos() >= 55) {
			t.setPontos(t.getPontos() + 10);
		}
		else {
			t.setPontos(t.getPontos() + 5);
		}
	}

}
