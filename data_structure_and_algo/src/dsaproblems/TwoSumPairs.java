package dsaproblems;

import java.util.Arrays;

public class TwoSumPairs {

	public static void main(String[] args) {	
		int ar[] = {5,7,7,79,6,13,10,2,6,6,33,6};
		Arrays.sort(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i] + " ");
		}
		int k=12;
		int l=0;
		int r=ar.length-1;
		int count=0;
		while(l<r) {
			if(ar[l]+ar[r]==k && ar[l]==ar[r]) {
				++count;
				if(count>1) 
				System.out.println("\n"+ "Pairs :"+ ar[l]+" : "+ar[r]);
			}
			else if(ar[l]+ar[r]==k) {
				System.out.println("\n"+ "Pairs :"+ ar[l]+" : "+ar[r]);
			}
			if(ar[l]+ar[r]<k) {
				l++;
			}
			else  {
				r--;
			}	
		}
	}
}
