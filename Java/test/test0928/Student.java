package test0928;


public class Student {

	public static void main(String[] args) {
		
		Student stu;
		stu = new Student(null, 0, 0, 1, 2, 5);
		
		stu.info();
	}
	
	
	
	String name;
	int ban,no,kor,eng,math,sum;
	double avg;
	
	
	Student(String name, int ban, int no,
			int kor, int eng, int math){
		this.name = name;	this.ban = ban;		this.no = no;
		this.kor = kor;		this.eng = eng;		this.math = math;
	}
	
	int getTotal(){
		sum = this.kor+this.eng+this.math;
		return sum;
	}
	
	double gatAverage() {
		avg = sum/3.;
		return avg;
	}
	
	public void info() {
		System.out.println("�̸�: "+name);
		System.out.println("��: "+ban);
		System.out.println("��ȣ: "+no);
		System.out.println("��������: "+kor);
		System.out.println("��������: "+eng);
		System.out.println("��������: "+math);
		System.out.println("����: "+getTotal());
		System.out.println("���: "+gatAverage());
	}
}
