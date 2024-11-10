package test.oct05.mcq;

public class Frodo {// 4
	public static void main(String[] args) {// 5
		short myGold = 7;// 6
		System.out.println(countGold(myGold, 6));// 7
	}// 8
}// 9

class Hobbit {// 10

	static int countGold(int x, int y) {// 11
		return x + y;
	}
}// 12

//What is the result?

//A. 13
//B. Compilation fails due to multiple errors
//C. Compilation fails due to an error on line 6
//D. Compilation fails due to an error on line 7
//E. Compilation fails due to an error on line 11

//Ans : D
