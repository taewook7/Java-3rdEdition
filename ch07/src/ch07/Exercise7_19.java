package ch07;

public class Exercise7_19 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.buy(new Computer2());
		b.buy(new Computer2());
		b.buy(new Computer2());
		
		b.summary();
	}

}



class Buyer{
	int money=1000;  // õ���� �������ֳ�
	Product2[] cart = new Product2[3]; 
	int i=0; //product �� ���� �ε���
	
	void buy(Product2 p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����ؼ� "+p+"�� ��� ����");
			return;
		}
		money-=p.price;
		add(p);
	}
	
	void add(Product2 p) {
		if(i>=cart.length) {
			// i �� ���� ��ٱ��� ũ�⺸�� ���ų� ũ�� ������ ��ٱ��Ϻ���
			//2�� ū ���ο� �迭�� �����Ѵ�.
			Product2[] tmp=new Product2[cart.length*2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart=tmp;
		}
		cart[i++]=p;
	}
	
	void summary() {
		String itemList="";
		int sum=0;
		
		for (int i = 0; i < cart.length; i++) {
			if(cart[i]==null)
				break;
			itemList+=cart[i]+", ";
			sum+=cart[i].price;
		}
		System.out.println("�����ѹ���:"+itemList);
		System.out.println("����� �ݾ�"+sum);
		System.out.println("���� �ݾ�"+money);
	}
	
}


class Product2 {
	int price;
	Product2(int price) {
		this.price=price;
	}
}

class Tv2 extends Product2 {
	

	Tv2() {
		super(300);
	}
	public String toString() { return "Tv2";
}
}

class Computer2 extends Product2 {

	Computer2() {
		super(100);
	}
	public String toString() { return "Computer2";
	
}
}

class Audio2 extends Product2 {

	Audio2() {
		super(100); }
		public String toString() 
		{ return "Audio2"; }
}
