package Practice;

import java.util.Scanner;

public class MonthSchedule {
	Scanner scan = new Scanner(System.in);
	String schedule=null;
	int menu=0,day;
	Day D[] = new Day[30];

	
	void input(){
		System.out.print("����(��ĭ ���� �Է�): ");
		schedule = scan.next();
		D[day-1].set(schedule);
	}
	void view(){
		System.out.printf("%d���� �� ���� ",day);
		D[day-1].show();
	}
	void finish(){
		System.out.println("���α׷��� �����մϴ�.");
	}
	void run(){
		for(int i =0;i<30;i++) {
			D[i] = new Day();
		}while(menu!=3){
			System.out.println("����) 1.�Է�  2.����  3.����");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				System.out.print("��¥(1~30): ");
				this.day = scan.nextInt();
				input();
				break;
			case 2:
				System.out.print("��¥(1~30): ");
				day = scan.nextInt();
				view();
				break;
			case 3:
				finish();
				break;
			default:System.out.println("error");
				break;
			}
		}
	}

}
