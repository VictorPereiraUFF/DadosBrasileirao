package utilidades;

import java.util.function.Function;

import dados.Times;

public class Nomear implements Function<Times, String>{

	@Override
	public String apply(Times t) {
		return t.getTime().toLowerCase().replace("a", "@").replace("o", "0").replace("e", "&").replace("i", "1").replace("u", "~");
	}

	

}