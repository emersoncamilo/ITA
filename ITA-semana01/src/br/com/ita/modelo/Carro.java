package br.com.ita.modelo;

public class Carro {
	private int potencia;
	private int velocidade;
	private String nome;
	
	public void acelerar() {
	}
	public void frear() {
		
	}

	int getVelocidade() {
		return velocidade;
	}
	
	void imprimir() {
		
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Carro [potencia=" + potencia + ", velocidade=" + velocidade + ", nome=" + nome + "]";
	}
	
	
	
}
