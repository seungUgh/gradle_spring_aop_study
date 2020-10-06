package gradle_spring_aop_study02;

public class RecCalculator implements Calculator {

	@Override
	public long factorial(long num) {
		long start = System.currentTimeMillis();
		try {
			if (num == 1)
				return 1;
			else
				return num * factorial(num-1);
		}finally {
			long end = System.currentTimeMillis();
			System.out.printf("RecCalculator.factorial(%d) 실행시간 =%d%n", num, (end-start));
		}
	}

}
