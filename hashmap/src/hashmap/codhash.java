package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class codhash {
	
	private static int findMostFrequentUsingMap(int[] arr) {
		int maxCount = 0;
	    int mostFrequent = arr[0];
		Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
		for(int aa : arr) {
			temp.put(aa, temp.getOrDefault(aa, 0) + 1);
			if(temp.get(aa) > maxCount) {
				maxCount = temp.get(aa);
				mostFrequent = aa;
			}
		}
		
		return mostFrequent;
		
		
	}
	
	private static int findMostquentUsingMap(int[] arr) {
		int maxcnt = 0;
		int mostfreq = 0;
		
		Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
		for(int i = 0 ; i < arr.length;i++) {
			if(temp.containsKey(arr[i])) {
				temp.put(arr[i], temp.get(arr[i]) + 1);
			}else {
				temp.put(arr[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : temp.entrySet()) {
	        if (entry.getValue() > maxcnt) {
	            maxcnt = entry.getValue();
	            mostfreq = entry.getKey();
	        }
	    }

	    return mostfreq;
	}
	
	private static int[] reversearr(int[] arr) {
		int l = 0;
		int r = arr.length - 1;
		int temp = 0;
		while (l <= r) {
			temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
		return arr;
	}
	
	private static boolean isanagram(String ana1, String ana2) {
		if(ana1.length() != ana2.length()) return false;
		char[] aa1 = ana1.toCharArray();
		char[] aa2 = ana2.toCharArray();
		
		Arrays.sort(aa1);
		Arrays.sort(aa2);
		return Arrays.equals(aa1, aa2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = {1,2,3,4,5,5,5,4,5,6};
//		 System.out.println("Brute Force Result: " + findMostFrequentBruteForce(arr));
//		    System.out.println("HashMap Result: " + findMostquentUsingMap(arr));
		
//		int[] ans = reversearr(arr);
//		for(int i = 0 ; i < arr.length;i++) {
//			System.err.print(ans[i] + " ");
//		}
		
		Scanner sc = new Scanner(System.in);
		String ana1 = sc.nextLine();
		String ana2 = sc.nextLine();
		
		if(isanagram(ana1, ana2)) {
			System.out.println("It is an anagram");
		}else {
			System.out.println("it is not an anagram");
		}

	}

}
