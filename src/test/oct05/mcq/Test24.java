package test.oct05.mcq;

public class Test24 {
	public static void main(String[] argv) {
		while (true) {
			if (false) {
				System.out.println(false);
				break;
			} else {
				System.out.println(true);
			}
			return;
		}
		System.out.println("out of the loop");
	}
}

//a. false
//   true 
//   out of the loop

//b. false
//   out of the loop

//c. true
//d. false
//e. Compile time error

//Ans : c
