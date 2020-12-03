package ch5;

public class Ex5_1_tmp {

	public static void main(String[] args) {
		int[] score; // 배열 score를 선언 (참조변수)
		score =new int[5];  //배열 생성( int 저장공간 x5)
		//먼저 선언을하고 그다음 생성을 하는것이다.
		
		// 두문장을 하나로 합치면
		int[] score2 =new int[5]; //배열의 선언과 생성을 동시에
		score[3]=100;
		
		// 스코어 배열 인덱스3 자리에 100이 잘들어왔는지 체크
		System.out.println("score[0]="+score[0]);
		System.out.println("score[1]="+score[1]);
		System.out.println("score[2]="+score[2]);
		System.out.println("score[3]="+score[3]);
		System.out.println("score[4]="+score[4]);
		
		//배열 값을 int 타입 변수value 에 대입할수도있다.
		int value= score[3];
		System.out.println("value 의값은 : "+value);
	}

}
