package Ordenada;

public class Selection implements OrdenacaoInterface {

	// selection
	@Override
	public void ordenar(int[] vetor) throws Exception {
		int menor, auxiliar;
		if (vetor.length == 0) {
			throw new Exception("vetor vazio");
		}
		for (int i = 0; i < vetor.length; i++) {
			menor = i;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[menor]) {
					menor = j;
				}
			}
			auxiliar = vetor[menor];
			vetor[menor] = vetor[i];
			vetor[i] = auxiliar;
		}

	}

}
