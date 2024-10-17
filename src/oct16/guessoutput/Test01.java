package oct16.guessoutput;

public class Test01 {

	public static void main(String[] args) {
		int number = 1;
		String letters = "abc";
		number = number(number);
		letters(letters);
		System.out.println(number + letters);// 2 + abc = 2abc
	}

	public static int number(int number) {// 1
		number++;
		return number;// 2
	}

	public static String letters(String letters)// abc
	{
		letters += "d";
		return letters;// abcd
	}

}
