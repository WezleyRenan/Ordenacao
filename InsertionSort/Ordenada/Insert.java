package Ordenada;

public class Insert implements OrdenacaoInterface {

	// insertion
	@Override
	public void ordenar(int[] vetor) throws Exception {
		int j,auxiliar;
		if (vetor.length == 0) {
			throw new Exception("vetor vazio");
		}
		for (int i = 1; i < vetor.length; i++) {
			auxiliar = vetor[i];
			j = i - 1;
			while (j >= 0 && vetor[j] > auxiliar) {
				vetor[j + 1] = vetor[j];
				j--;
			}
			vetor[j + 1] = auxiliar;
		}

	}

}
