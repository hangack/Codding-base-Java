package ch09_5Polymorphism;

public class Product {
	int price,bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Buyer0{
	int money = 1000;
	int bonusPoint = 0;
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("�ܾ� ����");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.toString()+"��/�� �����ϼ̽��ϴ�.");
	}
}

class Tv extends Product{
	Tv(){
		super(420);		//	Product�� �ڽ� Ŭ������ super(int) -> Product �������� Product("int" price)�� ���󰣴�.
	}
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product{
	Computer(){
		super(300);
	}
	public String toString() {
		return "Computer";
	}
}
class Audio extends Product{
	Audio(){
		super(40);
	}
	public String toString() {
		return "Audio";
	}
}
class PS5 extends Product{
	PS5(){
		super(120);
	}
	public String toString() {
		return "PS5";
	}
}