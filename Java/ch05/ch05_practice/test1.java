package ch05_practice;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1��9������ ���ڷ� �̷���� 3�ڸ� ���ڸ� ������ ���α׷��� �ϼ��ϼ���. 
        //��, ������ �ߺ��� �־�� �ȵ˴ϴ�.
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] number = new int[3];
		for(int i=0;i<ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j]=tmp;
		}
		System.arraycopy(ballArr,0, number,0,3);
		for(int i=0; i<3;i++) {
			System.out.print(number[i]);
		}


	}

}
