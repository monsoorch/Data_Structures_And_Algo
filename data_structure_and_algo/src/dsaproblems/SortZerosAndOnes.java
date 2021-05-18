package dsaproblems;

import java.util.Arrays;

public class SortZerosAndOnes {

	public static void main(String[] args) {
		int arr[]= {1,0,0,1,1,0,1,1,1};
		int l=0;
		int r=arr.length-1;
		while(l<r) {
			if(arr[l]==1) {
				int t=arr[l];
				arr[l]=arr[r];
				arr[r]=t;
				r--;
			}
			else
				l++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
