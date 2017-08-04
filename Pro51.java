import java.util.*;
public class P 51 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	int row=1;
	int column=5;

	int result=0;
	int r=row-1;

	for(int i=0;i<column;i++) 
{
		result=result+r;
	}
	result=result+(column-1);

	System.out.println("The mimimum number of cutting: "+result);
}

}
