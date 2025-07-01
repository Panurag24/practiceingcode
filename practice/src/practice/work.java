package practice;

import java.util.*;
import java.util.regex.Pattern;
//import java.awt.geom.AffineTransform;
import java.lang.*;
import java.security.PublicKey;
import java.time.YearMonth;

public class work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		Pattern(n);
//		valueof(n);
//		int n = 1634;
//		Boolean ans = Armsst(n);
		
//		System.out.println(ans);
		
//		int[] arr = {1,4,6,3,9};
//		printal(arr);
//		int n = 5;
//		Boolean ans = primes(n);
//		System.out.println(ans);
		
//		int n1 = 36, n2 = 9;
//		int ans = GCD(n1,n2);
//		System.out.println(ans);
		int n = 5;
//		recprint(n);
		int ans =  sumrec(n);
		System.out.println(ans);
	}
	
	public static int sumrec(int n) {
		if (n == 0) {
			return 0;
		}
		return n + sumrec(n-1);
	}
	
	public static void recprint(int n) {
		if(n == 0) {
			return;
		}
		recprint(n - 1);
		System.out.println(n);
		
	}
	
	public static int GCD(int n1, int n2) {
		while (n2 != 0) {
			int ans = n2;
			n2 = n1 % n2;
			n1 = ans;
		}
		return n1;
	}
	
	public static boolean primes(int n) {
		int cnt = 0;
		for(int i = 1;i <= n;i++) {
			if(n % i == 0) {
				cnt++;
			}
		}
		if(cnt == 2) {
			return true;
		}
		return false;
		
	}
	
	public static void printal(int[] arr) {
		Arrays.sort(arr);
		for(int i = 0 ; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void Pattern(int n) {
		for(int i = 0 ;i < n;i++) {
			for(int j = 1 ; j <= n-i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void valueof(int n) {
		System.out.println(String.valueOf(n).length());
	}
	
	
	
	public static Boolean Armsst(int n) {
		int temp = n;
		int po = String.valueOf(n).length();
		int sum = 0;
		while(n > 0) {
			int rem = n % 10;
			sum += Math.pow(rem, po);
			n = n / 10;
		}

		return sum == temp;
	}
	
	
}
