package br.com.escopo;

public class Somador {
	
	String nome;
	int valorInstancia = 0;
	static int valorEstatica = 0;
	
	void somar() {
		valorEstatica++;
		valorInstancia++;
		
	}
	
	
	
	void imprimir() {
		System.out.println("O Somador "+nome+
				": instancia= "+valorInstancia+
				" e estatica= " +valorEstatica);
		
	}
	

}
