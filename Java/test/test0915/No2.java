package test0915;

import java.util.Scanner;

public class No2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		times();
		
		System.out.println("����ϰ��� �ϴ� ���� �Է��ϼ���");
		int n = scan.nextInt();
		times(n);
		

		System.out.println("����ϰ��� �ϴ� ���� �Է��ϼ���");
		n = scan.nextInt();

		System.out.println("����ϰ��� �ϴ� �����͸� �Է��ϼ���");
		int data = scan.nextInt();
		times(n,data);

		
		
	}
	
	
	
	private static void times() {
		int n=1;
		while(n<9) {
			n++;
			System.out.printf(" %d��\n",n);
			for(int times=1;times<=9;times++) {
				System.out.printf("%dX%d=%2d\n",n,times,n*times);
			}
		}
		System.out.println("===================");
	}
	private static void times(int n) {
		System.out.printf(" %d��\n",n);
		int times = 1;
		do {
			System.out.printf("%dX%d=%2d\n",n,times,n*times);
			times++;
		} while (times<=9);
		System.out.println("===================");
		
	}
	private static void times(int n, int times) {
		System.out.printf(" %d��\t%d�� ���\n",n,times);
		for(int i=1;i<=9;i++) {
			switch (i%times) {
			case 0:
				System.out.printf("%dX%d=%2d\n",n,i,n*i);
				continue;

			default:
				continue;
			}
		}

		System.out.println("===================");
	}

}
