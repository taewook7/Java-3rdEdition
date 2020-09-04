package ch07;

class Product
{
	int price;
	int bonusPoint;
	Product() {}  // 이게 있어야 하나.,.?
// 프로덕트 클래스에 기본생성자가 없으면 에러가 발생한다.
// 밑에 생성자가 이미 정의되어있기때문에 컴파일러가 자동적으로 추가해주지않는다
// 그래서 직접 정의하지 않으면 에러가 발생한다.
	
	Product (int price) {
		this.price=price;
		bonusPoint=(int)(price/10.0);
	}
}
class Tv extends Product {
//	Tv() {} 
	Tv() {
		super();  // product() 을 호출
	}
	
	public String toString() {
		return "Tv";
	}
}


public class Exercise7_3 {
	public static void main(String[] args) {
		Tv tv = new Tv();
	}

}
