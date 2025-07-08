package stackonly;

import java.util.*;
import java.lang.*;

public class stacktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> temp = new Stack<Integer>();
		int[] arr = {1,2,3,4,5};
		for (int i : arr) {
			temp.push(i);
		}
		
		System.out.println(temp);
		
		System.out.println(temp.pop());
		
		Queue<Integer> temp1 = new LinkedList<Integer>();
		
		for(int i : arr) {
			temp1.add(i);
		}
		System.out.println(temp1);
		System.out.println(temp1.contains(5));

	}

}
