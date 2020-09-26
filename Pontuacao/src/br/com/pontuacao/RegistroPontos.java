package br.com.pontuacao;

public class RegistroPontos {
	CalculadoraBonus bonus;

	public RegistroPontos(CalculadoraBonus cb) {
		bonus = cb;

	}

	public void fazerUmComentario(Usuario u) {
		u.pontos += 3 * bonus.bonus(u);
	}

	public void criaUmTopico(Usuario u) {
		u.pontos += 5 * bonus.bonus(u);
	}

	public void darUmLike(Usuario u) {
		u.pontos += 1 * bonus.bonus(u);
	}
}
