package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		int numPosAnterior, num2PosAtras, atual;
		List<Integer> lista = new ArrayList<>();

		lista.add(0);
		lista.add(1);
		numPosAnterior = 1;
		num2PosAtras = 0;

		do{
			atual = numPosAnterior + num2PosAtras;
			lista.add(atual);
			num2PosAtras = numPosAnterior;
			numPosAnterior = atual;
		}while(numPosAnterior <= 350);

		return lista;
	}

	public static Boolean isFibonacci(Integer a) {
		List<Integer> fibon = fibonacci();

		return fibon.contains(a);
	}

}