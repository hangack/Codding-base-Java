package ch04_2Loop;

import java.util.Scanner;

public class While_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		while(i<5) {
			i++;
			System.out.print(i+" ");
		} System.out.println();
		
		int i_sum=0;
		i=0;
		while(i<10) {
			i++;	i_sum+=i;
		//	System.out.print("i: "+i+" ");
		//	System.out.println("Sum: "+i_sum);
			System.out.printf("i: %2d Sum: %2d\n",i,i_sum);
		}
		
		Scanner scan = new Scanner(System.in);
		int a,a_num=0,a_sum=0;
		System.out.print("0 �Է� �� loop out ");
		while((a=scan.nextInt())!=0) {
			a_num++;	a_sum+=a;
		} System.out.printf("�Է� ����: %2d\n�Է� ���: %2d",a_num,a_sum/a_num);
		System.out.println();

		
	//	int b=1,b_num=0,b_sum=0;
		int b,b_num=0,b_sum=0;
		System.out.print("0 �Է� �� loop out ");
	//	while(b!=0) {
		while(true) {
			b=scan.nextInt();
			if (b==0) break;
			b_num++;	b_sum+=b;
		} System.out.printf("�Է� ����: %2d\n�Է� ���: %2d",b_num,b_sum/b_num);
		System.out.println();
		
		
		
		
		
		scan.close();
	}

}
