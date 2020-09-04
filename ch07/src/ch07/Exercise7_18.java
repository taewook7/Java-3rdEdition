package ch07;

public class Exercise7_18 {
	static void action(Robot r) {
		if( r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot) r;
			dr.dance();
		} else if (r instanceof SingRobot) {
			SingRobot sr = (SingRobot) r;
		} else if (r instanceof DrawRobot) {
			DrawRobot dr2 = (DrawRobot) r;
		}
	}
	
	
	
	public static void main(String[] args) {
		Robot r[] = {new DanceRobot(), new SingRobot(),new DrawRobot()};
		for (int i = 0; i < r.length; i++) {
			Robot robot = r[i];
			action(r[i]);
		}
		
		}

}


class Robot{
	
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("�������.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("�뷤�θ���");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸��� �׸���.");
	}
}