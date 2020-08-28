package ch06;

public class CardTest {

	public static void main(String[] args) {
		System.out.println("Card.width= " + Card.width);
		System.out.println("Card.height = " + Card.height);
		// 클래스 변수 (static변수) 는 객체 생성 없이 '클래스이름.클래스변수' 로 직접 사용 가능하다.
		
		Card c1 = new Card();
		c1.kind="Spade";
		c1.number=7;
		
		Card c2 = new Card();
		c2.kind="Heart";
		c2.number=4;
		
		System.out.println("c1은 " +c1.kind + ", " +c1.number+ "이며, 크기는 ( " +c1.width + ", "+c1.height+")");
		System.out.println("c2는 " +c2.kind + ", " +c2.number+ "이며, 크기는 ( " +c2.width + ", "+c2.height+")");
		
		c1.width=50;
		c1.height=80;
		
		System.out.println("c1은 " +c1.kind + ", " +c1.number+ "이며, 크기는 ( " +c1.width + ", "+c1.height+")");
		System.out.println("c2는 " +c2.kind + ", " +c2.number+ "이며, 크기는 ( " +c2.width + ", "+c2.height+")");
		
	}

}

class Card {
	String kind; // 카드의 무늬-인스턴스 변수 
	int number;// 카드의 번호- 인스턴스 변수 
	static int width= 100;  // 카드의 폭- 클래스 변수 
	static int height= 250; // 카드의 높이 - 클래스 변수
}