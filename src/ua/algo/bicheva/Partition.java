package ua.algo.bicheva;

import java.util.Arrays;

public class Partition {
	
	private static int count = 0;
	
	public static void main(String[] args) {
		int[] A = {8, 7, 6, 5, 4, 3, 2, 1};
		int[] sorted = quickSort(A, 0, A.length-1);
		System.out.println(Arrays.toString(sorted));
		System.out.println(count);
	}
	
	public static int[] quickSort(int[] A, int p, int r) {
		if(p < r) {
			int q = partition(A, p, r);
			int[] res = quickSort(A, p, q-1);
			int[] res2 = quickSort(res, q+1, r);
			return res2;
		} else {
			return A;
		}
	}
	
	public static int partition(int[] A, int p, int r) {
		int x = A[r];
		int i = p - 1;
		for(int j = p; j <= r-1; j++) {
			count++;
			if(A[j] <= x) {
				i++;
				int tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
			}
			
		}
		int tmp = A[i+1];
		A[i+1] = A[r];
		A[r] = tmp;
		return i+1;
	}

}
