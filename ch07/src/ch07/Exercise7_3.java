package ch07;

class Product
{
	int price;
	int bonusPoint;
	Product() {}  // �̰� �־�� �ϳ�.,.?
// ���δ�Ʈ Ŭ������ �⺻�����ڰ� ������ ������ �߻��Ѵ�.
// �ؿ� �����ڰ� �̹� ���ǵǾ��ֱ⶧���� �����Ϸ��� �ڵ������� �߰��������ʴ´�
// �׷��� ���� �������� ������ ������ �߻��Ѵ�.
	
	Product (int price) {
		this.price=price;
		bonusPoint=(int)(price/10.0);
	}
}
class Tv extends Product {
//	Tv() {} 
	Tv() {
		super();  // product() �� ȣ��
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
