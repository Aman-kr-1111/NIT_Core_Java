//What is the output of the below Java code snippet?
//
//char ch = 'A';//ASCII 65
//int a = ch + 1;
//ch = (char)a;
//System.out.println(ch);
//
//a 66
//b A
//c B    //correct
//d 65

package mcq.day1;

public class Q02 {

	public static void main(String[] args) {
		char ch = 'A';// ASCII 65
		int a = ch + 1;
		ch = (char) a;
		System.out.println(ch);// B
	}

}
