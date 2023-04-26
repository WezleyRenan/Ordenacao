package Ordenada;

import java.util.Random;

public class Bubble implements OrdenacaoInterface {

	@Override
	public void ordenar(int[] vetor) throws Exception {
		int auxiliar;
		if(vetor.length == 0) {
			throw new Exception("vetor vazio");
		}
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					auxiliar = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = auxiliar;
				}
			}
		}
	}
}
