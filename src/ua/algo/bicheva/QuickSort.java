package ua.algo.bicheva;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
		
		int[] A = {2, 8, 7, 1, 3, 5 , 6, 4};
		int newIndex = partition(0, A);
		
		System.out.println(Arrays.toString(A));
		System.out.println(newIndex);
	}
	
	public static int partition(int startIndex, int[] data) {
		int endIndex = data.length;
		int pivot = data[endIndex-1];
		int newIndex = startIndex - 1;
		for(int j = startIndex; j < endIndex; j++) {
			if(data[j] <= pivot) {
				newIndex++;
				swap(data, newIndex, j);
			}
		}
		return newIndex;
	}
	
	public static void swap(int[] data, int i, int j){
		int tmp = data[j];
		data[j] = data[i];
		data[i] = tmp;
	}
}
