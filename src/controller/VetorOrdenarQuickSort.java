package controller;

import br.ed.fatec.quicksort.OrdenarQuickSort;

public class VetorOrdenarQuickSort {
	
	public VetorOrdenarQuickSort() {
		super();
	}
	
	
	public int[] operacao(int []vetor, int inicio, int fim) {
	OrdenarQuickSort ordenar = new OrdenarQuickSort();
	int[] v = ordenar.quickSort(vetor, inicio, fim);
	System.out.println(v);
	return v;
	
	
	}
	
	
}
