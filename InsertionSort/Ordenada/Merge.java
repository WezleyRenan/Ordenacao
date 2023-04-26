package Ordenada;

import java.util.Arrays;

public class Merge implements OrdenacaoInterface {

	@Override
	public void ordenar(int[] vetor) throws Exception {
		int[] w = new int[vetor.length];
		if (vetor.length == 0) {
			throw new Exception("vetor vazio");
		}
		mergeSort(vetor, w, 0, vetor.length - 1);

	}

	public void mergeSort(int[] v, int[] w, int ini, int fim) {
		if (ini < fim) {
			int meio = (ini + fim) / 2;
			mergeSort(v, w, ini, meio);
			mergeSort(v, w, meio + 1, fim);
			intercalar(v, w, ini, meio, fim);

		}
	}

	public void intercalar(int[] v, int[] w, int ini, int meio, int fim) {
		for (int k = ini; k <= fim; k++)
			w[k] = v[k];

		int i = ini;
		int j = meio + 1;

		for (int k = ini; k <= fim; k++) {
			if (i > meio)
				v[k] = w[j++];
			else if (j > fim)
				v[k] = w[i++];
			else if (w[i] < w[j])
				v[k] = w[i++];
			else
				v[k] = w[j++];
		}
	}

}
