package Practice;

import java.util.Scanner;

public class Grade {
	static Scanner sc = new Scanner(System.in);
	int math,science,english;
	
	Grade(int m, int s, int e){
		math = m;	science = s; english = e;
	}
	
	double average() {
		double avg = (math+science+english)/3.;
		return avg;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
		System.out.print("수학,과학,영어 순으로 3개의 정수 입력 >> ");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grade me = new Grade(math,science,english);
		System.out.println("평균은"+me.average());	// 	average()는 평균 계산 후 return

		sc.close();
	}

}
