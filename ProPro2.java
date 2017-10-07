package GuviProSet1;

import java.util.Arrays;
import java.util.Scanner;

public class ProPro2 {
	public static int fintMin(int val, int k1) {
		int[] arr = new int[(int)Math.log10(val) + 1];
		int count = 0;
		while(val != 0) {
			arr[count] = val % 10;
			val /= 10;
			count++;
		}
		Arrays.sort(arr);
		String str = "";
		for(int i = 0; i < arr.length - k1; i++) {
			str += String.valueOf(arr[i]);
		}
		return Integer.parseInt(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int value = in.nextInt();
		int k = in.nextInt();
		int num = fintMin(value, k);
		System.out.println(num);
	}
}
