package dsaproblems;

import java.util.HashMap;

public class TwoSumUniquePairs {
	public static void main(String[] args) {
		int arr[] = {5,7,7,79,6,13,10,2,6,6,33,6};
		int target=12;

		HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
		}

		for(int n:arr) {
			int needed = target-n;
			if(hm.containsKey(needed)) {
				System.out.println("Pairs is/are "+"("+n +" "+needed+")");
				hm.remove(needed);
				hm.remove(n);
			}
		}
	}
}
