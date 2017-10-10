package list;

import java.util.*;
public class ProPro25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int pow = ((int)Math.pow(2,n)) - 1;
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i <= pow; i++) {
			String temp = "";
			String str = Integer.toBinaryString(i);
			if(str.length() < n) {
				int zeros = Math.abs(n - str.length());
				for(int j = 0; j < zeros; j++) {
					temp += "0";
				}
			}
			temp += str;
			list.add(temp);
		}
		for(int i = 0; i <= n; i++) {
			ArrayList<String> list1 = new ArrayList<String>();
			for(int j = 0; j < list.size(); j++) {
				int count = 0;
				for(int k = 0; k < list.get(j).length(); k++) {
					if(String.valueOf(list.get(j).charAt(k)).equals("1")) {
						count++;
					}
				}
				if(count == i) {
					list1.add(list.get(j));
				}
			}
			Collections.sort(list1);
			for(int l = 0; l < list1.size(); l++) {
				if(i == n) {
					System.out.print(list1.get(l));
				}
				else {
					System.out.print(list1.get(l)+",");
				}
			}	
		}
	}
}
