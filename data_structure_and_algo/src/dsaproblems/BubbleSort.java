package dsaproblems;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]= {1,2,4,6,7,3,4,2,1,5};
		int n = arr.length; 
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i-1; j++) 
				if (arr[j] > arr[j+1]) 
				{ 
				// swap arr[j+1] and arr[j] 
					int temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = temp; 
				} 
		}
		System.out.println(Arrays.toString(arr));
	} 
}
