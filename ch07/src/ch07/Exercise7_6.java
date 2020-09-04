package ch07;

class Outer {  // 외부 클래스 
	class Inner {  // 내부 클래스 (인스턴스 클래스)
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
