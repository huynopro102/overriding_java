package overriding;

public class animal {
	// 3 thuoc tinh
	private int eat;
	private int makeSound;
	private int sleep;
	// tao constructor rong
	public animal() {	
	}
	// ham set
	public void setEat(int a) {
		this.eat=a;
	}
	public void setMakeSound(int a) {
		this.makeSound=a;
	}
	public void setSleep(int a) {
		this.sleep=a;
	}
	// ham get 
	public int getEat() {
		return this.eat;
	}
	public int getMakeSound() {
		return this.makeSound;
	}
	public int getSleep() {
		return this.sleep;
	}
	// 3 phuong thuc
	public void makeSound() {
		System.out.println("tieng dong ");
	}
	public void eat() {
		System.out.println("mam mam");
	}
	public void sleep() {
		System.out.println("kho kho ");
	}
}
