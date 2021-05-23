package core_java;

public class IfElse {

	public static void main(String[] args) {
		int marks = 35;
		if(marks>=90)
			System.out.println("A grade");
		else if(marks<90 && marks>=70)
			System.out.println("B grade");
		else if(marks<70 && marks>=65)
			System.out.println("B grade");
		else if(marks<65 && marks>=40)
			System.out.println("B grade");
		else
			System.out.println("Fail");

	}

}
