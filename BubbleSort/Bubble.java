package BubbleSort;

import java.util.Random;

public class Bubble {

	public static void main(String[] args) {
		
		
		int[] vetor = new int[10];
        
		System.out.println("vetor:");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			System.out.print(vetor[i] + " ");
		}
		System.out.println(" ");
		System.out.println("vetor ordenado: ");
		// bubblesort
		int auxiliar; 
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					auxiliar = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = auxiliar;
				}
			}
		}
		for(int i = 0;i < vetor.length;i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}