package overriding;

public class main {
public static void main(String[] args) {
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
