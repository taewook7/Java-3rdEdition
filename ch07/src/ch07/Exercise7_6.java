package ch07;

class Outer {  // �ܺ� Ŭ���� 
	class Inner {  // ���� Ŭ���� (�ν��Ͻ� Ŭ����)
		int iv=100;
	}
}

public class Exercise7_6 {
	public static void main(String[] args) {
		Outer ok = new Outer();
		Outer.Inner ok2=ok.new Inner();
		System.out.println(ok2.iv);
	}

}
