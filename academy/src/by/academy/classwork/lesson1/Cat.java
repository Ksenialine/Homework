package by.academy.classwork.lesson1;

public class Cat {
	
	int age;
	String nickname;
	int money;
	String initials;
	boolean isHomeAnimal;
	
	public void grow () {
		age++;	
		}
	
	public void sleep () {
		System.out.println("Кот спит");
		}
	
	public void eat () {
		System.out.println("Кот ест");
	}
	
	public void walk () {
		System.out.println("Кот гуляет");
	}
	
	public Cat () {
		
	}
	
	public Cat (String nickname) {
		
	}
	
	public int getMoney () {
		return money;
	}
	
	public void setMoney (int money) {
		this.money = money;
	}
	
	public String getInitials () {
		return initials;
	}
	
	public void setInitials (String initials) {
		this.initials = initials;
	}
	
	public boolean getIsHomeAnimal () {
		return isHomeAnimal;
	}
	
	public void setIsHomeAnimal (boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}
}
