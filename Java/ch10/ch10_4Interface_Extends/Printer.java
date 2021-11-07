package ch10_4Interface_Extends;

public interface Printer {
	void print(String doc);
}

interface ColorPrintable extends Printer {
	void printCMYK(String doc);
}

class SamgungPrint extends Samsung implements ColorPrintable {
	@Override
	public void printCMYK(String doc) {
		System.out.printf("%s",Samsung());
		System.out.printf("�÷� %s �μ�\n",doc);
	}
	@Override
	public void print(String doc) {
		System.out.printf("%s",Samsung());
		System.out.printf("��� %s �μ�\n",doc);
	}
}
class LGPrint extends LG implements Printer {
	@Override
	public void print(String doc) {
		System.out.printf("%s",LG());
		System.out.printf("��� %s �μ�\n",doc);
	}
}

class Samsung {
	String Samsung(){
		return "3��";
	}
}
class LG {
	String LG(){
		return "LG";
	}
}
//class Print extends Samsung,LG {	//	Ŭ������ ���� ����� �Ұ����ϴ�.
//	
//}