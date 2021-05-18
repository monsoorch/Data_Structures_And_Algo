package dsaproblems;

public class MoveZerosToFirst {
	public static void main(String args[]) {
		int arr[]= {0,1,5,4,0,6,0};
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[j++]=arr[i];
			}
		}
		while(j<arr.length) {
			arr[j++]=0;
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}		
	}
}
