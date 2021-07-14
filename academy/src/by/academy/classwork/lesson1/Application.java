package by.academy.classwork.lesson1;

public class Application {
	public static void main (String[] args) {
		Cat metchik = new Cat();
		metchik.age = 2;
		metchik.nickname = "Метчик";
		
		Cat n = new Cat();
		n.age = 5;
		
		metchik.eat();
		metchik.sleep();
		metchik.walk();
		
		n.grow();
		n.grow();
		n.grow();
		System.out.println(n.age);
	}

}
