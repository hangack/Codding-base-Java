package ch10_1Abstract;

abstract class Animal {
	String kind;
	
	Animal(String kind){
		this.kind = kind;
	}
	void breathe() {
		System.out.println("������");
	}
	
	abstract void sound();

}
