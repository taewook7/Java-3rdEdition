package ch04;

import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		int input=0;
		int answer=0;
		Scanner sc = new Scanner(System.in);
		
		answer= (int) (Math.random() * 100) +1;
		System.out.println("answer="+answer);
		
		do {
			System.out.println("1과 100 사이의 정수를 입력하라");
			input=sc.nextInt();
			
			if (input > answer) {
				System.out.println("더 작은수로 입력하라");
			} else if (input <answer) {
				System.out.println("더 큰수로 입력하라 ");
			}
		} while (input != answer);
		System.out.println("정답입니당 ");
	}

}
