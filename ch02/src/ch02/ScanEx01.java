package ch02;

import java.util.Scanner;

public class ScanEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int num=sc.nextInt();
//		System.out.println(num);
		
		String input=sc.nextLine();
		int num2=Integer.parseInt(input);
		System.out.println(num2);
	}

}
