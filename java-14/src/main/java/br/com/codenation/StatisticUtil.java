package br.com.codenation;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class StatisticUtil {

	public static int average(int[] elements) {
		int soma = 0;

		for(int n: elements){
			soma += n;
		}

		return soma / elements.length;
	}

	public static int mode(int[] elements) {
		int total = 0;
		int total_atual = 0;
		int numero = elements[0];

		for(int n: elements){
			total_atual = 0;
			for(int n2: elements){
				if(n == n2){
					total_atual ++;
				}
			}
			if(total_atual > total){
				total = total_atual;
				numero = n;
			}
		}

		return numero;
	}

	public static int median(int[] elements) {
		int mediana;
		boolean par = true;

		if(elements.length % 2 != 0){
			par = false;
		}

		Arrays.sort(elements);

		if(!par){
			return elements[elements.length/2];
		}

		else if(par){
			return ((elements[elements.length/2]) + (elements[(elements.length/2) - 1])) / 2;
		}

		return 0;
	}
}