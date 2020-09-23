package br.com.ita.modelo.Testes;

import br.com.ita.modelo.Carro;

public class Principal {
	
	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.setPotencia(10);
		c1.setNome("Monza");
		
		System.out.println(c1);
		
	}

}
