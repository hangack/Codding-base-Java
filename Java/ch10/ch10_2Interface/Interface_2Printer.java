package ch10_2Interface;

public class Interface_2Printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer sam = new SamsungPrint();
		Printer lg = new LGPrint();
		
		lg.Printer("�ڹ� �̷� ����");
		sam.Printer("�ڹ� �̷� ����");

	}

}
