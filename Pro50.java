import java.util.*;
public class P 50 
{
public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the number of inputs");
	int num=sc.nextInt();

	int ip[]=new int[num];

	System.out.println("Enter the input");

	for(int i=0;i<num;i++)
{
	ip[i]=sc.nextInt();

	
}
	for(int i=0;i<num;i++) 
{
		int len=String.valueOf(ip[i]).length();

		System.out.println(len);
		
	}
}
}
