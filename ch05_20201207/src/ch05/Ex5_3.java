package ch05;

public class Ex5_3 {

	public static void main(String[] args) {
		int[] score= {79,80,91,100,55,95};
		int max=score[0];
		int min=score[0];
		
		for (int i = 0; i < score.length; i++) {
			if (score[i]>max ) {
				max = score[i];
			} else if(score[i] <min) {
				min=score[i];
			}
		}
		System.out.println("�ִ밪: "+max);
		System.out.println("�ּҰ�: "+min);
	}

}
