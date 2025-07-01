package testproblem;

import java.util.Arrays;
import java.util.List;



public class solution {
	
	public static int findmax(List<Object> list) {
		int max = Integer.MIN_VALUE;
		for(Object item : list) {
			if(item instanceof Integer) {
				max = Math.max(max,(Integer) item );
			}
		}
		return max;
	}
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void sortarr(int[] arr) {
		Arrays.sort(arr);
		
	}
	
	public static int submitionofarr(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<Object> temp = Arrays.asList(1,Arrays.asList(2,3,Arrays.asList(4,5)),6,Arrays.asList(7,8));
//		
//		int max = findmax(temp);
//		System.out.println(max);
		
		int[] arr = {3,1,4,1,5,9,2,6,5};
		sortarr(arr);
		print(arr);
		int ans = submitionofarr(arr);
		System.out.println();
		System.out.println(ans);
		
		
		

	}

}
