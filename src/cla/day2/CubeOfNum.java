//Write a program to find out the cube of a number where number must be    taken from command line argument.

package cla.day2;

public class CubeOfNum {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int cube = num * num * num;
		System.out.println("Cube of " + num + " is : " + cube);
	}

}
