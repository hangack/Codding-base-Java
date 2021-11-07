package ch09_5Polymorphism;

public class Buyer2 {
	Product[] cart = new Product[3];
	int money = 10000,bonusPoint = 0;
	int i;

	
	public void buy(Product p) {
		if(money<=p.price) {
			System.out.println("�ܾ׺���");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+" ����");
		add(p);
	}
	
	public void add(Product p) {
		if(i<=cart.length) {
			Product[] temp = new Product[cart.length*2];
			System.arraycopy(cart,0,temp,0,cart.length);
			cart = temp;
		}
		cart[i++] = p;
		return;
	}
	
	void summary() {
		String itemList = "";
		int sum = 0;
		for(int i = 0;i < cart.length;i++) {
			if(cart[i]==null)	break;
			itemList += cart[i]+",";
			sum += cart[i].price;
		}
		System.out.println("������ ����: "+itemList);
		System.out.println("����� �ݾ�: "+sum);
		System.out.println("����Ʈ: "+bonusPoint);
		System.out.println("���� �ݾ�: "+money);
	}
}
