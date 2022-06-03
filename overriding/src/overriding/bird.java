package overriding;

public class bird extends animal{
	// khong can thuoc tinh
	// constructor rong
	public bird () {
	}
	// phuong thuc dc inheritance to animal
	// overriding
	@Override
	public void eat() {
		System.out.println("toi an sau bo");
	}
	@Override
	public void makeSound() {
		System.out.println("hot hot ");
	}
}
