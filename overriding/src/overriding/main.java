package overriding;

public class main {
public static void main(String[] args) {
	// overriding dùng để thay đổi giá trị của phương thức class cha , để phù hơp cho class con
	System.out.println("dog:");
	dog d = new dog();
	d.eat();
	d.makeSound();
	d.sleep();
	System.out.println("--------\nanimal:");
	animal a = new animal();
	a.eat();
	a.makeSound();
	a.sleep();
	System.out.println("-----\nbird");
	bird b = new bird();
	b.eat();
	b.makeSound();
	b.sleep();
}
}
