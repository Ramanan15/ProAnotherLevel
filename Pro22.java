public class Pro22 {
	public static void main(String[]args) {
		int x1=10;
		int x2=15;
		int x3=10;
		int x4=15;
		int y1=5;
		int y2=10;
		int y3=5;
		int y4=10;
		int leftX = Math.max(x1, x3);   
		int rightX = Math.min(x2, x4);
		int botY = Math.max(y1, y3);
		int topY = Math.min(y2, y4);
		    if (rightX >= leftX && topY >= botY) {
		       System.out.println("The triangle are overlaping");
		     }
		    else {
			 System.out.println("The triangle not overlaping");
		    }
	}
}
