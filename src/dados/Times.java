package dados;

public class Times {

	private String time;
	private Integer pontos;
	private Integer ataque;
	private Integer defesa;
	
	public Times(String time, Integer pontos, Integer ataque, Integer defesa) {
		this.time = time;
		this.pontos = pontos;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}

	public Integer getAtaque() {
		return ataque;
	}

	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}

	public Integer getDefesa() {
		return defesa;
	}

	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}
	
	public static void staticBonusPontuacao (Times t) {
		if (t.getAtaque() >= 60) {
			t.setPontos(t.getPontos() + 10);
		}
		else {
			t.setPontos(t.getPontos() + 5);
		}
	}
	
	@Override
	public String toString() {
		return time + ", " + pontos + " pontos, " + ataque + " gols marcados, " + defesa + " gols sofridos";
	}
	
	
}
