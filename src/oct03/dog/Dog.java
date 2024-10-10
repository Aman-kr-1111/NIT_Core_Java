//Write a Program on OOPs to define Dog
//class properties
//and behaviour.
//
//properties:
//
//name:
//String height:
//double age:
//int
//
//behaviour:
//
//getDogInformation() : public void
//             bark() : public void  

package oct03.dog;

public class Dog {
	String name = "Charlie";
	double height = 3.7;
	int age = 8;

	public void getDogInFormation() {
		System.out.println("My Dog's name is " + name + ".It's height " + height + " and age " + age);
	}

	public void bark() {
		System.out.println("My dog is barking.");
	}

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.getDogInFormation();
		d1.bark();
	}
}
