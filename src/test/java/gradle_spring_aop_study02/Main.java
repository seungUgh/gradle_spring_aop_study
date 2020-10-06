package gradle_spring_aop_study02;

public class Main {
	public static void main(String[] args) {
		int num =5;
		long res = -1;

		Calculator impeCal = new ImpeCalculator();
		res = impeCal.factorial(num);
		System.out.printf("%d! = %d%n", num, res);

		Calculator recCal = new RecCalculator();
		res = recCal.factorial(num);
		System.out.printf("%d! = %d%n", num, res);
	}
}
