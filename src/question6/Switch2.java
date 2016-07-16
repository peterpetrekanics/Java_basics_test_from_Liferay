package question6;

public class Switch2 {
	final static short x = 2;
	// Original code:
//	public static int y = 0;
	// Working version:
	public final static int y = 0;
	
	public static void main(String[] args) {
		for (int z = 0; z < 3; z++) {
			switch (z) {
			case y:
				System.out.print("0 "); /* Line 9 */
			case x - 1:
				System.out.print("1 "); /* Line 10 */
			case x:
				System.out.print("2 ");
			}
		}
	}
}