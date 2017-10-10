package guvii;

import java.util.Scanner;

public class ProPro53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str = str.toLowerCase();
		int count = 0;
		for(int  i = 97; i <= 122; i++) {
			if(str.contains(String.valueOf((char)i))) {
				count++;
			}
		}
		if(count == 26) {
			System.out.println("The entered string is pangram");
		}
		else {
			System.out.println("The entered string isn't pangram");
		}
	}

}
