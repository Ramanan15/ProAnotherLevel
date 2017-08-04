import java.util.*;
public class Pro59 {
	public static void main(String[] args) {
		int NumOfCoin=101;
		int MyCount=0;
		int FriendCount=0;
		System.out.println("Input: No of coin="+NumOfCoin);
		System.out.println();
			for(int i=1;i<=NumOfCoin;i++) {
				if(i%2==1) {
					MyCount++;
				}
				else {
					FriendCount++;
				}
			}
			if(MyCount>FriendCount) {
				System.out.println("Result : I Win");
			}
			else  {
				System.out.println("Result : Bouth having same number of coin");
			}
	}
}
