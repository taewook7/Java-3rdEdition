package ch5;

public class Ex5_1_tmp {

	public static void main(String[] args) {
		int[] score; // �迭 score�� ���� (��������)
		score =new int[5];  //�迭 ����( int ������� x5)
		//���� �������ϰ� �״��� ������ �ϴ°��̴�.
		
		// �ι����� �ϳ��� ��ġ��
		int[] score2 =new int[5]; //�迭�� ����� ������ ���ÿ�
		score[3]=100;
		
		// ���ھ� �迭 �ε���3 �ڸ��� 100�� �ߵ��Դ��� üũ
		System.out.println("score[0]="+score[0]);
		System.out.println("score[1]="+score[1]);
		System.out.println("score[2]="+score[2]);
		System.out.println("score[3]="+score[3]);
		System.out.println("score[4]="+score[4]);
		
		//�迭 ���� int Ÿ�� ����value �� �����Ҽ����ִ�.
		int value= score[3];
		System.out.println("value �ǰ��� : "+value);
	}

}
