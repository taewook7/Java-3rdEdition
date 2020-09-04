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
	int money=1000;  // 천만원 가지고있네
	Product2[] cart = new Product2[3]; 
	int i=0; //product 에 사용될 인덱스
	
	void buy(Product2 p) {
		if(money<p.price) {
			System.out.println("잔액이 부족해서 "+p+"을 살수 없네");
			return;
		}
		money-=p.price;
		add(p);
	}
	
	void add(Product2 p) {
		if(i>=cart.length) {
			// i 의 값이 장바구의 크기보다 같거나 크면 기존의 장바구니보다
			//2배 큰 새로운 배열을 생성한다.
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
		System.out.println("구입한물건:"+itemList);
		System.out.println("사용한 금액"+sum);
		System.out.println("남은 금액"+money);
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
