package ch03_02Operator;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. ����3 ����6 ������� ����
		int l = 6, w = 3, area_squ;
		System.out.println(area_squ = w*l);
		System.out.println();
		
		//2. �� ������ �ﰢ���� ����
		double area_tri;
		System.out.println(area_tri = area_squ/2.);
		System.out.println();
		
		//3. 40,30,10�� ���
		int a=40,b=30,c=10,sum;
		double aver;
		sum =a+b+c;
		System.out.printf("%5.2f\n",aver=sum/3.);
		System.out.println();
		
		//4. ���� 100���� �� ����
		int pay_M = 100,pay_Y;
		System.out.println(pay_Y=pay_M*12);
		System.out.println();
		
		//5. 286�� ��� ���� �������� ���
		int time=286,min,sec;
		min=286/60; sec=286%60;
		System.out.printf("%2dm%2ds\n",min,sec);
		System.out.println();
		
		/*6. x=10,y=5 �� �� ���� ����� ���
		 * 			(x>7)&&(y<=5)
		 * 		(x%3==0)||(y%2!=1)		*/
		int x=10,y=5;
		System.out.println((x>7)&&(y<=5));
		System.out.println((x%3==0)||(y%2!=1));
		System.out.println();
		
		//7. 534�ڷ縦 30���� ���� ������ ���� �� �л��� �� ���� ���� �� �ְ� ��� ������ ���Ͻÿ�.
		int pen=534, stu=30, ind_pen, remain;
		ind_pen = pen/stu;
		remain = pen%stu;
		System.out.printf("�δ� %d��, ������ %d��\n",ind_pen,remain);
		System.out.println();
		
		//8. value ���� 356�� ��, 300�� ���� �� �ֵ��� �ڵ带 �ۼ��Ͻÿ�. (��� �����ڸ� ����Ѵ�.)
		int value = 356;
		System.out.println(value/100*100);
		System.out.println();
		

	}

}
