package ch04;

class ParentA {
	int num;
	static int a;
	ParentA(int num) {
		this.num=num;
	}
}

class ChildA extends ParentA {
//	static int a;

	ChildA() {
		super(a);
	}
}
