package InsertionSort;

public class Insert {

	public static void main(String[] args) {
		
		int auxiliar;
		int[] vetor = new int[10];
		
		System.out.println("vetor: ");
		for(int i = 0;i < vetor.length;i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			System.out.print(vetor[i] + " ");
		}
		System.out.println(" ");
		//insertion
		int j;
		System.out.println("vetor ordenado: ");
		for(int i = 1;i < vetor.length;i++) {
			auxiliar = vetor[i];
			j = i - 1;
			while(j >= 0 && vetor[j] > auxiliar) {
				vetor[j + 1] = vetor[j];
				j--;
			}
			vetor[j + 1] = auxiliar;
		}
		for (int i = 0; i < vetor.length;i++) {
			System.out.print(vetor[i] + " ");
		}

	}

}
