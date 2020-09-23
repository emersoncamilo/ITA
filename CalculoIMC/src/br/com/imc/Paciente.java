package br.com.imc;

public class Paciente {

	private Double peso;

	private Double altura;

	public Paciente(Double peso, Double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double calcularIMC() {
		Double imc = getPeso() / (getAltura() * getAltura());
		System.out.println("IMC do Paciente: "+ String.format("%.2f", imc));
		return imc;
	}

	public String diagnostico() {
		Double imc = calcularIMC();
		String result = ""; 
		
		if(imc<16) {
			result = "Baixo peso muito grave = IMC abaixo de 16 kg/m²";
		}else if(imc>=16 && imc<16.99) {
			result = "Baixo peso grave = IMC entre 16 e 16,99 kg/m²";
		}else if(imc >= 17 && imc<18.49) {
			result = "Baixo peso = IMC entre 17 e 18,49 kg/m²";
		}else if(imc>=18.50 && imc<24.99) {
			result = "Peso normal = IMC entre 18,50 e 24,99 kg/m²";
		}else if(imc>=25 && imc<29.99) {
			result = "Sobrepeso = IMC entre 25 e 29,99 kg/m²";
		}else if(imc>=30 && imc<34.99) {
			result = "Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
		}
		else if(imc>=35 && imc<39.99) {
			result = "Obesidade grau II = IMC entre 35 e 39,99 kg/m²";
		}else if(imc > 40) {
			result = "Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²";
		}
		return result;
	}

}
