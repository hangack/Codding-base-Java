package ch09_4OverRIde;

public class Child02 extends Parent02 {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ ������");
		}else {
			super.fly();
		}
	}

}
