package ch10_2Interface;

public interface Printer {
	void Printer(String print);
}

class SamsungPrint implements Printer{
	@Override
	public void Printer(String print){
		System.out.println("3�� ������");
		System.out.printf("%s �μ�\n",print);
	}
}

class LGPrint implements Printer{
	@Override
	public void Printer(String print){
		System.out.println("ŷ�� ������");
		System.out.printf("%s �μ�\n",print);
	}
}
