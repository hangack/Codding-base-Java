package ch03_02Operator;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5, b = 3;
		System.out.println("a+b: " + (a + b));
		System.out.println("a-b: " + (a - b));
		System.out.println("a*b: " + (a * b));
		System.out.println("a/b: " + (a / b));
		System.out.println("a%b: " + (a % b));
		

		System.out.println();
		
		int num1=5;
		System.out.println(++num1);
		System.out.println(++num1);
		System.out.println(num1);
		int num2=5;
		System.out.println(num2++);
		System.out.println(num2++);
		System.out.println(num2);
		int num3=5;
		System.out.println(--num3);
		System.out.println(--num3);
		System.out.println(num3);
		int num4=5;
		System.out.println(num4--);
		System.out.println(num4--);
		System.out.println(num4);
		

		System.out.println();
		
		int x=10,y=20, z=x+y;
		System.out.println("10+20 = "+z);
		
		
		System.out.println();
		
		int a1=7;
		a1 = a1+10;
		System.out.println("a: "+a1);
		int b1=7;
		b1+=10;
		System.out.println("b: "+b1);
		a=10;
		System.out.println("a+=5: "+(a+=5));
		System.out.println("a-=7: "+(a-=7));
		System.out.println("a*=5: "+(a*=5));
		System.out.println("a/=4: "+(a/=4));
		System.out.println("a%=5: "+(a%=5));
		

		System.out.println();
		
		a = 3; b = 5;
		System.out.println("a<b:"+(a<b));
		System.out.println("a<=b:"+(a<=b));
		System.out.println("a>b:"+(a>b));
		System.out.println("a>=b:"+(a>=b));
		System.out.println("a==b:"+(a==b));
		System.out.println("a!=b:"+(a!=b));
		
		
		//	���� ������	(��)? ���ϰ�� : �����ϰ��;
		
		int c;
		c = (a>b)?100:5000;
		System.out.printf("c: %d\n",c);
		

		System.out.println();
		
		num1 = 0; num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0)&&((num2 += 10) > 0);	// f&&t=F
		System.out.println("result= "+result);
		System.out.println("num1= "+num1);
		System.out.println("num2= "+num2);		//and(&&)�̱⿡ ù ���� f�� ������ f�� ���� ������ �������� ����
		System.out.println();
		
		num1 = 0; num2 = 0;
		result = ((num1 += 10) < 0)&((num2 += 10) > 0); // ��ȣ�� 1���� ���� ��� ���� ���굵 �����Ѵ�.
		System.out.println("result= "+result);
		System.out.println("num1= "+num1);
		System.out.println("num2= "+num2);
		System.out.println();

		num1 = 0; num2 = 0;
		result = ((num1 += 10) > 0)||((num2 += 10) < 0);	// f||t=F
		System.out.println("result= "+result);
		System.out.println("num1= "+num1);
		System.out.println("num2= "+num2);		//or(||)�̱⿡ ù ���� f�� ������ f�� ���� ������ �������� ����
		System.out.println();

		num1 = 0; num2 = 0;
		result = ((num1 += 10) > 0)|((num2 += 10) < 0);	// ��ȣ�� 1���� ���� ��� ���� ���굵 �����Ѵ�.
		System.out.println("result= "+result);
		System.out.println("num1= "+num1);
		System.out.println("num2= "+num2);
		System.out.println();

		num1 = 0;
		result = !((num1 += 10) > 0);	// !t = f
		System.out.println("result= "+result);
		System.out.println("num1= "+num1);
		System.out.println();
		
		num1 = 0; num2 = 0;
		result = ((num1 += 10) > 0)^((num2 -= 10) < 0);	// t^t = f
		System.out.println("result= "+result);
		System.out.println("num1= "+num1);
		System.out.println("num2= "+num2);
		System.out.println();
		
		
	}

}
