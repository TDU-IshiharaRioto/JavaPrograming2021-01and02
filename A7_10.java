public class A7_10 {
	public static void main (String[] args) {
		boolean ice = false;
		printState (ice);
		ice = true;
		printState (ice);
	}
	public static void printState (boolean ice) {
		if (ice) {
			System.out.println ("氷です");
		} else {
			System.out.println ("水です");
		}
	}
}