package ch08_4Singleton;

public class Calc1 {
	private Calc1() {}
	private static Calc1 s = new Calc1();
	public static Calc1 getInstance() {		//	static���� ����Ʊ� ������ Singleton Ŭ������ �̿��� �� �ִ�.
		if (s==null) {			//	if�� ��� ��� ����
			s = new Calc1();
		}
		return s;
	}
	
	
	private String field;
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}

}
