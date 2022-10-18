package javatask;
import java.util.Scanner;
public class vehicle {
	
	public static void main(String[] args) {
  public void set1()
  {
	  System.out.println("Type of vehicle: ");
  }
}
class sportcar extends vehicle
{
	public void set2()
	{
		System.out.println("Sports car: ");
	}
}
class familycar extends vehicle
{
	public void set3() {
		System.out.println("Family car: ");
		
	}
}
class features1 extends sportcar
{
	public void set4() {
		System.out.println("useally a two seater sometime a four-seater");
		System.out.println("High-Speed car");
		System.out.println();
	}
}
class features2 extends familycar
{
	public void set5() {
		System.out.println("A lot of space ");
		System.out.println("storage for everything");
		
	}
}

public class hairarchy {

	public static void main(String[] args) {
		features1 obj1=new features1();
		obj1.set1();
		obj1.set2();
		obj1.set4();
		features2 obj2=new features2();
		obj2.set1();
		obj2.set3();
		obj2.set5();
	}
}
