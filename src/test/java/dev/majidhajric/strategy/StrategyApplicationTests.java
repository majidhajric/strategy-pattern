package dev.majidhajric.strategy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
class StrategyApplicationTests {

	@Autowired
	private TransportCalculator calculator;

	@SpyBean WalkStrategy walkStrategy;

	@SpyBean DriveStrategy driveStrategy;

	@SpyBean FlyStrategy flyStrategy;

	@Test
	public void strategyTest() {
		int calculated = calculator.calculate(TransportCategory.WALK, 10);

		verify(walkStrategy, times(1)).calculateSomething(anyInt());
		verify(driveStrategy,never()).calculateSomething(anyInt());
		verify(flyStrategy,never()).calculateSomething(anyInt());

		assertEquals(calculated, walkStrategy.calculateSomething(10));
	}
}
