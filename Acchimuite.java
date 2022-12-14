//21AJ013 石原遼大

import jp.tdu.util.KeyboardReader;
import jp.tdu.util.RandomNumber;

public class Acchimuite {
	public static String getArrow (int number) {
		String[] yaji = {"↑", "→", "↓", "←"};
		return yaji[number];
	}
	public static void printIntroduction () {
		for (int i = 0; i< 4; i++) {
			System.out.println (i + "：" + Acchimuite.getArrow(i));
		}
		System.out.print ("番号を入力してください：");
	}
	public static int getPlayerNumber () {
		int number = KeyboardReader.readInt ();
		return number;
	}
	public static int getComputerNumber () {
		int number = RandomNumber.nextInt (4);
		return number;
	}
	public static String getMessage (int player, int computer) {
		String message = "You:" + Acchimuite.getArrow (player) + "vs" + Acchimuite.getArrow (computer) + ":Com";
		return message;
	}
	public static String getResult (int player, int computer) {
		String result = "";
		if (player == computer) {
			result = "You Win!!";
		} else {
			result = "You Lose!!";
		}
		return result;
	}
	public static void hoi () {
		Acchimuite.printIntroduction ();
		int player = Acchimuite.getPlayerNumber ();
		int computer = Acchimuite.getComputerNumber ();
		System.out.println (Acchimuite.getMessage (player, computer));
		System.out.println (Acchimuite.getResult (player, computer));
	}
}