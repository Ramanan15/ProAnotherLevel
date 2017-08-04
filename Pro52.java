import java.util.*;
public class P 52 
{
public static void main(String[] args) 
{
	int x1=10;
	int y1=10;
	int x2=20;

	int y2=10;
	int x4=20;
	int y4=20;

	int x3=10;
	int y3=20;
	int l1=x2-x1;

	int l2=x4-x3;
	int l3=y4-y1;
	int l4=y3-y2;

	if(l1==l2&&l2==l3&&l3==l4&&l4==l1){

		System.out.println("Square");
	
}

	else 
{
		System.out.println("Not Square");
	}
}
}
