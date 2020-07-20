package tg.edu;

import java.util.Scanner;

import tg.edu.util.Calc;

public class CalcMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[2];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		for (int i : num) {
			System.out.println(Calc.sumToInputNum(i));
		}
	}
}
