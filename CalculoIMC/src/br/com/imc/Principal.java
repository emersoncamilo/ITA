package br.com.imc;

public class Principal {
	public static void main(String[] args) {

		Paciente paciente1 = new Paciente(64.0, 1.65);
		Paciente paciente2 = new Paciente(110.0, 1.90);
		Paciente paciente3 = new Paciente(80.6, 2.05);

		System.out.println("Resultado do IMC do Paciente 1: " + paciente1.diagnostico());
		System.out.println("Resultado do IMC do Paciente 2: " + paciente2.diagnostico());
		System.out.println("Resultado do IMC do Paciente 3: " + paciente3.diagnostico());

	}
}
