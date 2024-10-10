package mcq.day4;

public class Q07 {

	public static void main(String[] args) {
		int i, j, k, l = 0;
		k = l++;// k=0
		j = ++k;// j=1
		i = j++;// i=1
		System.out.println(i);// 1
	}

}
