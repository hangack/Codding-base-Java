package Practice;

public class TV {
	String company;
	int y, inch;
	TV(String company, int y, int inch){
		this.company = company; this.y = y; this.inch = inch;
	}
	void show() {
	System.out.printf("%s���� ���� %d���� %d��ġ TV",company,y,inch);
	}
}
