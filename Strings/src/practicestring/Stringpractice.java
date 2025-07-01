package practicestring;

import java.util.*;
import java.lang.*;

public class Stringpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String tempString = "Anurag";
//		String news = tempString.toLowerCase();
//		for(int i = 0 ; i < tempString.length();i++) {
//			news = tempString.charAt(i) + news;
//		}
//		System.out.print(news);
		
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
//		String temp1 = scanner.next();
//		String name1 = "Anurags";
//		String name2 = "Anurag";
//		System.out.println(name1 == name2);
		
		StringBuilder var = new StringBuilder();
		
		for(int i = 0 ; i < temp.length();i++) {
			if(Character.isLowerCase(temp.charAt(i))) {
				var.append(Character.toUpperCase(temp.charAt(i)));
			}else if(Character.isUpperCase(temp.charAt(i))) {
				var.append(Character.toLowerCase(temp.charAt(i)));
			}
			
		}
		System.out.println(var);
		scanner.close();
		
		
		
		
	}

}
