package test.oct05.mcq;

public class KeepOnSwitching {
	public static void main(String[] args) {
		final int iLoc = 3;
		final int iFour = 4;
		int iRef = 4;
		switch (iRef) {
		case 1:
		case iLoc:
		case 2 * iLoc:
			System.out.println("I am not OK.");
		default:
			System.out.println("You are OK.");
		case iFour:
			System.out.println("It’s OK.");
		}
	}
}

//	(a) The code will fail to compile because of the value of one of the case labels.
//	(b) The code will fail to compile because of the type of the switch expression.
//	(c) The code will compile correctly and will only print the following, when run:
//	You are OK.
//	It's OK.
//	(d) The code will compile correctly and will only print the following, when run:
//	It's OK.
//
//	Ans : d
