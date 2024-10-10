//Write a Program on OOPs to define Fan
//class properties
//and behaviour.
//
//properties:
//
//name:
//String coil:
//String wings:
//int
//
//behaviour:
//
//switchOn()  : public void
//switchOff() : public void 

package oct03.fan;

public class Fan {
	String nameString = "USHA";
	String coil = "TurboCoil";
	int wings = 4;

	public void switchOn() {
		System.out.println("Fan is on.");
	}

	public void switchOff() {
		System.out.println("Fan is off.");
	}

	public static void main(String[] args) {
		Fan f1 = new Fan();

		f1.switchOn();
		f1.switchOff();
	}
}
