package tg.edu.util;

public class Calc {
	
	public static int sumToInputNum(int num) {
		int resultInt = 0;
		
		for (int i = 1; i <= num; i++) {
			resultInt += i;
		}
		
		return resultInt;
	}

}