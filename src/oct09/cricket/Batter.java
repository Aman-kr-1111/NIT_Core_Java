//Design a Cricket Score Board by using following requirements
//
//Take a Class Batter(Business Logic Class)
//
//Instance variables:
//
//Names Return Type--------- ----------------name:String runs:int matches:int batting_avg:float.
//
//Access Modifier:public(for all varriables)
//
//Create a no argument constructor that assigns default values to instance variables.Create parameterized constructor that accepts name,runs,matches.
//
//Methods:
//
//Method name:computeBattingAverage Access Modifier:public Return type:void
//
//This method should print the batting average of the batter by dividing run with matches.
//
//Input:"Sachin",18000,463
//
//Output:Name:Sachin Batting_Avg:38.87689
//
//Note:
//
//a.If runs or matches values are negative print'Error'.b.If runs are greater than 0 when matches are 0 print'Error'.
//
//Method name:getStatistics Return type:void This method should print the details of the batter.
//
//Input:"Sachin",18000,463
//
//Output:Name:Sachin Runs:18000 Matches:463 Note:a.If runs or matches values are negative print'Error'.b.If runs are greater than 0 when matches are 0 print'Error'.
//
//Given a
//class Testing(ELC Class)
//that contains
//main method.Use this
//
//class to
//test your
//code.
//
//Test Case-1:-----------------
//
//Invalid Case:
//Empty name
//
//Sample Input:"",5000,100`
//
//Expected Output:
//
//Error:
//Name cannot
//be empty.Error:
//Name cannot
//be empty.
//
//Test Case-2:----------------
//
//Invalid Case:
//Negative runs
//
//Sample Input:"Rahul",-15000,300
//
//Expected Output:
//
//Error:
//Runs and
//matches must
//be non-negative.Error:
//Runs and
//matches must
//be non-negative.

package oct09.cricket;

import java.text.DecimalFormat;

public class Batter {
	public String name;
	public int runs;
	public int matches;
	public float batting_avg;

	public Batter() {
	}

	public Batter(String name, int runs, int matches) {
		this.name = name;
		this.runs = runs;
		this.matches = matches;
	}

	public void computeBattingAverage() {
		if (checkData()) {
			return;
		}

		DecimalFormat df = new DecimalFormat("00.0000");
		batting_avg = (float) runs / matches;

		System.out.println("Name : " + name);
		System.out.println("Batting_Avg : " + df.format(batting_avg));
	}

	public void getStatistics() {
		if (checkData()) {
			return;
		}

		System.out.println("Name : " + name);
		System.out.println("Runs : " + runs);
		System.out.println("Matches : " + matches);
	}

	public boolean checkData() {
		boolean flag = false;
		if (name.equals("")) {
			System.out.println("Name cannot be empty");
			flag = true;
		}

		if ((runs <= 0 && matches <= 0) || (runs > 0 && matches <= 0) || (runs <= 0 && matches > 0)) {
			System.out.println("Runs and matches must be non-negative");
			flag = true;
		}
		return flag;
	}
}
