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
		
// 외부 클래스의 객체를 생성 안한 이유는 내부클래스가 static 이기 때문이다.
	}

}
