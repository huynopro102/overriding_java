package overriding;

public class dog extends animal {
	// con structor rong
	public dog() {
		super();
		 
	}
	// overriding  cả thuộc tính lẫn phương thức đều đc
	/*
	 * quy tắc
	 * + lớp con và lớp cha có mối quan hệ kế thừa
	 * + phương thức hoặc thuộc tính trong lớp phải có tên giống lớp cha
	 * + phương thức trong lớp con phải có tham số giống với lớp cha
	 * 
	 */
	@Override
	public void makeSound() {
		System.out.println("gâu gâu");
	}
	@Override
	public void eat() {
		System.out.println("tôi ăn xương");
	}
	
	
	
}
