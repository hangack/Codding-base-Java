package ch10_1Abstract;

public class Abstract_1GoogleCalc extends Calculator {	//	���� Ŭ������ abstract�� �� ��� �޼ҵ带 �����ؾ��Ѵ�.
	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a,int b){
		return a-b;
	}
	{
//	int subtract(int a,int b){		//	���� Ŭ���� ���� ������ public���� ���� Ŭ���� ���������� default�� ���� ������ �Ұ����ϴ�.
//		return a-b;
//	}
	}
	double avg(int[] a) {
		double sum =0;
		for(int i=0;i<a.length;i++) {
			sum +=a[i];
		}
		return sum/a.length;
	}
	
	public static void main(String[] args) {
		Calculator c = new Abstract_1GoogleCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.avg(new int[] {1,2,3,4,5}));
	}


}
