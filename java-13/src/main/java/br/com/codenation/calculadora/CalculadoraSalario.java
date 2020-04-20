package br.com.codenation.calculadora;


public class CalculadoraSalario {

	public long calcularSalarioLiquido(double salarioBase) {
		if(salarioBase >= (double) 1039) {
			double menosInss = calcularInss(salarioBase);
			double menosIrrf = calcularIrrf(menosInss);

			return Math.round(menosIrrf);
		}
		else return Math.round(0.0);

	}

	private double calcularInss(double salarioBase) {
		double umCento = salarioBase / (double) 100;
		double restoSalario = 0;

		if (salarioBase <= (double) 1500){
			restoSalario = salarioBase - umCento * 8;
		}
		else if(salarioBase <= (double) 4000){
			restoSalario = salarioBase - umCento * 9;
		}
		else restoSalario = salarioBase - umCento * 11;

		return restoSalario;
	}

	private double calcularIrrf(double salarioBase) {
		double umCento = salarioBase / (double) 100;
		double restoSalario = 0;

		if (salarioBase <= (double) 3000){
			restoSalario = salarioBase;
		}
		else if(salarioBase <= (double) 6000){
			restoSalario = salarioBase - umCento * 7.5;
		}
		else restoSalario = salarioBase - umCento * 15;

		return restoSalario;
	}

}
