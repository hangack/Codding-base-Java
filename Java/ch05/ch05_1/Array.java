package ch05_1;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	�迭 ����
//		int IntArray[];	 // a[1,2,3,4]�� ��, a(0) = 1
//		int[] IntArray
		int IntArray[] = new int[]{3,2,4};	
//		int[] IntArray = new int[]{3,2,4};	// ����&����&�ʱ�ȭ
		//	�迭 ����
//		IntArray = new int[4];
		//	�迭 �ʱ�ȭ
		IntArray = new int[]{1,2,3,4};
		System.out.println(IntArray.length);
		int n = 2;
		IntArray[n] = 75;
		System.out.printf("%d %d\n",IntArray[n],IntArray[n+1]);
		
		
		int score[] = {80,90,87};
		int sum=0,count=0,i;
		for(i=0;i<3;i++) {
			System.out.printf("score%d: %d\n",i+1,score[i]);
			sum += score[i];	count++;
		}
//		double avg = (double)sum/count;
		System.out.printf("sum: %d\n",sum);
		System.out.printf("avg: %f",(double)sum/count);
		
		
		Scanner scan = new Scanner(System.in);
		int max=0;
		IntArray = new int[5];
		System.out.println("��� 5���� �Է��ϼ���.");
		for(i=0;i<5;i++) {
			IntArray[i] = scan.nextInt();
			if(max<IntArray[i]) {
				max = IntArray[i];
			}
		}System.out.printf("���� ū ��: %d",max,"\n");

		
		
		
		scan.close();
	}

}
