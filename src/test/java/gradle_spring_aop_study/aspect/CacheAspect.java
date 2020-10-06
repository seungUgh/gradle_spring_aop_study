package gradle_spring_aop_study.aspect;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class CacheAspect {

	private Map<Long, Object> cache= new HashMap<>();

	@Around("execution(public * gradle_spring_aop_study03.aop..*(long))")
	public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
		Long num = (Long) joinPoint.getArgs()[0];
		if (cache.containsKey(num)) {
			System.out.printf("CacheAspect: Cache에서구함[%d]%n", num);
			return cache.get(num);
		}
		Object result = joinPoint.proceed();
		cache.put(num, result);
		System.out.printf("CacheAspect: Cache에추가[%d]%n", num);
		return result;
	}
}