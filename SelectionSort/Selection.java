package SelectionSort;

public class Selection {

	public static void main(String[] args) {

		int[] vetor = new int[10];

		System.out.println("vetor :");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			System.out.print(vetor[i] + " ");
		}
		// selection
		System.out.println(" ");
		int menor, auxiliar;
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
		System.out.println("vetor ordenado: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

	}

}
