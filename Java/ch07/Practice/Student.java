package Practice;

public class Student {
	String name;
	int ban, no, kor, eng, math, sum;
	float avg;

	int getTotal() {
		int sum = kor+eng+math;
		this.sum = sum;
		return sum;
	}
	
	float getAverage() {
		float avg = Math.round(sum/3.f*10)/10.f;
		this.avg = avg;
		return avg;
	}
	//	2-3
	Student (String name,int ban,int no,
			int kor,int eng,int math){
		this.name = name;	this.ban = ban;	this.no = no;
		this.kor = kor;	this.eng = eng;	this.math = math;
	}
	void info(){
		int sum = kor+eng+math;
		this.sum = sum;
		float avg = Math.round(sum/3.f*10)/10.f;
		this.avg = avg;
		
		System.out.printf("�̸�: %s\n��: %d\n��ȣ: "
				+ "%d\n����: %d\n����: %d\n����: %d\n����: %d\n���: %f\n"
				,name,ban,no,kor,eng,math,this.sum,this.avg);
	}

}
