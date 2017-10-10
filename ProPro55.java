package guvii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProPro55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] output = new int[t];
		for(int i = 0; i < t ; i++) {
			int noOfElaphants = in.nextInt();
			int weightOfSpider = in.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			int[] arr = new int[noOfElaphants];
			for(int j = 0; j < noOfElaphants; j++) {
				arr[j] = in.nextInt();
				if(arr[j] <= weightOfSpider) {
					list.add(arr[j]);
				}
			}
			Collections.sort(list);
			int sum = 0;
			int count = 0;
			for(int k = 0; k < list.size(); k++) {
				if(sum < weightOfSpider) {
					sum += list.get(k);
					if(sum <= weightOfSpider) {
						count++;
						if(sum == weightOfSpider) {
							break;
						}
					}
				}
			}
			output[i] = count;
		}
		for(int i =0; i < t; i++) {
			System.out.println(output[i]);
		}
	}
}
