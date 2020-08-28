package ch06;

public class CardTest {

	public static void main(String[] args) {
		System.out.println("Card.width= " + Card.width);
		System.out.println("Card.height = " + Card.height);
		// Ŭ���� ���� (static����) �� ��ü ���� ���� 'Ŭ�����̸�.Ŭ��������' �� ���� ��� �����ϴ�.
		
		Card c1 = new Card();
		c1.kind="Spade";
		c1.number=7;
		
		Card c2 = new Card();
		c2.kind="Heart";
		c2.number=4;
		
		System.out.println("c1�� " +c1.kind + ", " +c1.number+ "�̸�, ũ��� ( " +c1.width + ", "+c1.height+")");
		System.out.println("c2�� " +c2.kind + ", " +c2.number+ "�̸�, ũ��� ( " +c2.width + ", "+c2.height+")");
		
		c1.width=50;
		c1.height=80;
		
		System.out.println("c1�� " +c1.kind + ", " +c1.number+ "�̸�, ũ��� ( " +c1.width + ", "+c1.height+")");
		System.out.println("c2�� " +c2.kind + ", " +c2.number+ "�̸�, ũ��� ( " +c2.width + ", "+c2.height+")");
		
	}

}

class Card {
	String kind; // ī���� ����-�ν��Ͻ� ���� 
	int number;// ī���� ��ȣ- �ν��Ͻ� ���� 
	static int width= 100;  // ī���� ��- Ŭ���� ���� 
	static int height= 250; // ī���� ���� - Ŭ���� ����
}