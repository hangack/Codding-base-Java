package Practice;

public class Circle {
	final double pi = 3.141592;
	int r;
	double area;
	
	void Cira() {
		area = (Math.pow(r, 2)*pi);
		System.out.printf("������: %d\t����: %2d\n",r,(int)area);
	}

}
