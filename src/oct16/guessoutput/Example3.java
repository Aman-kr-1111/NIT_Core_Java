package oct16.guessoutput;

public class Example3 {
	int eid;
	String ename;
	String company;

	@Override
	public String toString() {
		return "eid:" + eid + "\n" + "ename:" + ename + "\n" + "company:" + company + "\n";
	}

	public static void main(String[] args) {
		Example3 e1 = new Example3();
		e1.eid = 7279;
		e1.ename = "Ganesh";
		e1.company = "Naresh IT";
		System.out.println(e1);
		e1 = new Example3();
		System.out.println(e1);
	}

}
