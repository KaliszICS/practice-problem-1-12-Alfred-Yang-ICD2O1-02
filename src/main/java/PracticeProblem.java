import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		String num;
		int chum;

		System.out.print("Input an integer: ");
		num = input.nextLine();
		chum = Integer.parseInt(num);
		System.out.println(chum + 3);

	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		String doub;
		double flub;
		System.out.print("Input a number: ");
		doub = input.nextLine();
		doub = doub + "4";
		flub = Double.parseDouble(doub);
		System.out.println(flub + 2);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		String rad; 
		double rag;
		System.out.print("Input a radius: "); 
		rad = input.nextLine();
		rag = Double.parseDouble(rad);
		rag = 3.14*(rag*rag);
		System.out.println(rag);

	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		String num;
		Double chum;
		System.out.print( "Input a number: ");
		num = input.nextLine();
		chum = Double.parseDouble(num);
		System.out.println(Math.floor(chum*12.0));
	}

}
