package gradle_spring_aop_study.aop01;

public class ImpeCalculator implements Calculator {

	@Override
	public long factorial(long num) {
		long result = 1;
		for(long i=1; i<=num; i++) {
			result *= i;
		}
		return result;
	}

}