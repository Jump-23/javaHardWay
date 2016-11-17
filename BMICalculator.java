import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double ft, in, lbs, bmi;
		
		System.out.print( "Your height (ft): " );
		ft = keyboard.nextDouble();
		
		System.out.print( "Your height (in): " );
		in = keyboard.nextDouble();
		
		System.out.print( "Your weight in lbs: " );
		lbs = keyboard.nextDouble();
		
		bmi = lbs / ((ft * 12 + in) * (ft * 12 + in ));
		
		System.out.println( "Your BMI is " + bmi );
	}
}