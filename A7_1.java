public class A7_1 {
	public static void main (String[] args) {
		printWeatherInformation (10) ;
		printWeatherInformation (-1) ;
	}
	public static void printWeatherInformation (int temperature) {
		String message = "真冬日ではありません";
		if (temperature < 0) {
			message = "真冬日です(0未満)";
		}
		System.out.println (message);
		
	}
}