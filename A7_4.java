public class A7_4 {
	public static void main (String[] args) {
		String s1 = getSummerInformation (15);
		System.out.println (s1);
		String s2 = getSummerInformation (30);
		System.out.println (s2);
	}
	public static String getSummerInformation (int temperature) {
		String message = "";
		if (temperature >= 30) {
			message = "真夏日です(30度以上)";
		} else {
			message = "真夏日ではありません";
		}
		return message;
	}
}