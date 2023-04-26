package Ordenada;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws Exception {

		int[] v = { 4, 6, 7, 3, 5, 1, 2, 8, 10, 15 };
		Scanner input = new Scanner(System.in);
		
        System.out.println("deseja criar um vetor ou usar o existente Y/N");
        char sobrescrever = input.next().charAt(0);
        sobrescrever = Character.toUpperCase(sobrescrever);
        
        if(sobrescrever == 'Y') {
        	int [] n = new int[10];
        	for (int i = 0; i < v.length; i++) {
        		System.out.print("indice numero: " + (i+1) + " | ");
				n[i] = input.nextInt();
				v[i] = n[i];
			}
        }
		System.out.println("escolha uma das opçoes de sort:\nBubble = 1\nSelection = 2\nInsertion = 3\nMerge = 4\nQuick = 5");
		int escolha = input.nextInt();
		try{ 
			while (escolha != 0) {
			switch (escolha) {
			case 1:
				Bubble bubblesort = new Bubble();
				bubblesort.ordenar(v);
				System.out.println("vetor ordenado em bubblesort");
				for (int i = 0; i < v.length; i++) {
					System.out.print(v[i] + " ");
				}
				break;

			case 2:
				Selection selectionsort = new Selection();
				selectionsort.ordenar(v);
				System.out.println("vetor ordenado em selectionsort");
				for (int i = 0; i < v.length; i++) {
					System.out.print(v[i] + " ");
				}
				break;
			case 3:
				Insert insertionsort = new Insert();
				insertionsort.ordenar(v);
				System.out.println("vetor ordenado em insertionsort");
				for (int i = 0; i < v.length; i++) {
					System.out.print(v[i] + " ");
				}
				break;
			case 4:
				Merge mergesort = new Merge();
				mergesort.ordenar(v);
				System.out.println("vetor ordenado em mergesort");
				for (int i = 0; i < v.length; i++) {
					System.out.print(v[i] + " ");
				}
				break;
			case 5:
				Quick quicksort = new Quick();
				quicksort.ordenar(v);
				for (int i = 0; i < v.length; i++) {
					System.out.print(v[i] + " ");
				}
				break;
			}
			System.out.println(" ");
			System.out.println("escolha uma das opçoes de sort:\nBubble = 1\nSelection = 2\nInsertion = 3\nMerge = 4\nQuick = 5");
			escolha = input.nextInt();

		}
		} catch (Exception error) {
			System.out.println(error.getMessage());
		}
	}
}
