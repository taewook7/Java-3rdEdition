package ch05;

import java.util.Arrays;

public class Ex5_1_tmp {

	public static void main(String[] args) {
		String[] strArr= {"����","����","��"};
		System.out.println(Arrays.toString(strArr));
		for(int i=0; i<10;i++) {
			int tmp=(int)(Math.random()*3);
			System.out.println(strArr[tmp]);
		}
	}

}
