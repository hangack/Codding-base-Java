package Practice;

import java.util.Scanner;

public class Controller {
	void init(){
		Scanner sc = new Scanner(System.in);
		boolean loop=true;
		int menu;
		
		while(loop) {

			System.out.println("1. ȸ������  2. �α���  3.����\n:");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				
				break;

			case 2:
				
				break;

			case 0:
				loop = false;
				System.out.println("exit");
				break;

			default:
				System.out.println("error");
				break;
			}
		}
		
		
		sc.close();
	}

}
