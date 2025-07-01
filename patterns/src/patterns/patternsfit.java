package patterns;

import java.util.*;
import java.lang.*;

public class patternsfit {
	
	public static void pattern6(int n) {
		for(int i = 1;i <= n;i++) {
			for(int j = 1;j <= n-i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void pattern7(int n) {
		for(int i = 0; i < n;i++) {
			for(int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2*i+1;k++) {
				System.out.print("*");
			}
			for(int k = 0 ;k<n-i-1;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
//		pattern6(n);
		pattern7(5);

	}

}
