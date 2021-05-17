package dsaproblems;

public class RotateArrayByK {

	public static void main(String[] args) {
		int k=2;
		int arr[] = {1,2,3,4,5};
		//54321
		//34512
		reverse(arr, 0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+ " ");
		System.out.print("\n");

		reverse(arr, k+1,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+ " ");
		System.out.print("\n");


		reverse(arr, 0,k);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+ " ");

	}
	
	//reverse the array
	
	public static void reverse(int num[],int s,int e) {
		while(s<e) {
			int temp=num[s];
			num[s]=num[e];
			num[e]=temp;
			s++;
			e--;
		}

	}

}
