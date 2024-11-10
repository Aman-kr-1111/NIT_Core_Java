package test.oct05.mcq;

public class Test12 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		boolean t = true;
		boolean r;
		r = (t & 0 < (i += 1));
		r = (t && 0 < (i += 2));
		r = (t | 0 < (j += 1));
		r = (t || 0 < (j += 2));
		System.out.println(i + " " + j);
	}
}

//	(a) The first digit printed is 1.
//	(b) The first digit printed is 2.
//	(c) The first digit printed is 3.
//	(d) The second digit printed is 1.
//	(e) The second digit printed is 2.
//	(f) The second digit printed is 3.

//	1)a, d
//	2)b, c
//	3)c, d
//	4)c, f

//	Ans : 3