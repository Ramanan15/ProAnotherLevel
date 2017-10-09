package GuviProSet1;

import java.util.*;

public class PrpPro15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//System.out.println(Integer.toBinaryString(31));
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ;i < n; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		int[] arr1 = new int[n];
		int co = 0;
		for(int i = n- 1; i >= 0; i--) {
			arr1[co++] = arr[i];
		}
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = Integer.toBinaryString(arr1[i]);
		}
		int[] countArr = new int[n];
		int[] countArr1 = new int[n];
		TreeSet<Integer> set = new TreeSet<Integer>();  
		for(int i = 0; i < n; i++) {
			countArr[i] = 0;
			for(int j = 0; j < str[i].length(); j++) {
				if(String.valueOf(str[i].charAt(j)).equals("1")) {
					countArr[i]++;
				}
			}
			set.add(countArr[i]);
		}
		int[] arrCpy = new int[set.size()];
		int ct = set.size() - 1;
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			arrCpy[ct--] = it.next();
		}
		for(int i = 0; i < arrCpy.length; i++) {
			for(int j = 0; j < n; j++) {
				if(arrCpy[i] == countArr[j]) {
					System.out.println(arr1[j]);
				}
			}
		}
	}

}
