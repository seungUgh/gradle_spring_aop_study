package gradle_spring_aop_study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import gradle_spring_aop_study.aop01.RecCalculator;
import gradle_spring_aop_study.config.AppCtx;

public class MainAspect {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);) {
			RecCalculator cal = ctx.getBean("calculator", RecCalculator.class);
			long fiveFact = cal.factorial(5);
			System.out.printf("cal.factorial(5) = %d%n", fiveFact);
			System.out.println(cal.getClass().getName());
		}
	}
}