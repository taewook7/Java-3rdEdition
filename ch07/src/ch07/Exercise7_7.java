package ch07;
class Outer2 {
	static class Inner {
		int iv=200;
	}
}

public class Exercise7_7 {
	public static void main(String[] args) {
		Outer2.Inner li=new Outer2.Inner();
		System.out.println(li.iv);
		
// �ܺ� Ŭ������ ��ü�� ���� ���� ������ ����Ŭ������ static �̱� �����̴�.
	}

}
