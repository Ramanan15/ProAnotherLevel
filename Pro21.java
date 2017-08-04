package pro;

import java.util.ArrayList;

public class pro21 {
public static void main(String[]args){
	int a[]={4,1,3,2};
	int len=a.length;
	int count=0;
	ArrayList ls1=new ArrayList();
	ArrayList ls2=new ArrayList();
	for(int i=1;i<len;i++){
		ls1.clear();
		ls2.clear();
		float av1=0;
		float av2=0;
		int h=0;
		int g=0;
		for(int j=0;j<i;j++){
			ls1.add(a[j]);
			av1=(float)av1+a[j];
			h++;
		}
		av1=av1/h;
		for(int k=i;k<len;k++){
			ls2.add(a[k]);
			av2=(float)av2+a[k];
			g++;
		}
		av2=av2/g;
		if(av1==av2){
			count++;
		System.out.println("Posibility"+count);
		System.out.println(ls1);
		System.out.println(ls2);
		
		}
	}
}
}
