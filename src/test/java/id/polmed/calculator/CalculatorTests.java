package id.polmed.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}

	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}


	@Test
	@DisplayName("2 - 1 = 1")
	void substractTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(1, calculator.substract(2, 1), "2 - 1 should equal 1");
	}

	@ParameterizedTest(name = "{0} - {1} = {2}")
	@CsvSource({
			"0,    1,   -1",
			"5,    2,   3",
			"100,  51, 49",
			"101,  100, 1"
	})
	void substract(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.substract(first, second),
				() -> first + " - " + second + " should equal " + expectedResult);
	}


	@Test
	@DisplayName("2 * 1 = 2")
	void multiplyTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.multiply(2, 1), "2 * 1 should equal 2");
	}

	@ParameterizedTest(name = "{0} * {1} = {2}")
	@CsvSource({
			"0,    1,   0",
			"5,    -2,   -10",
			"100,  51, 5100",
			"101,  100, 10100"
	})
	void multiply(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.multiply(first, second),
				() -> first + " * " + second + " should equal " + expectedResult);
	}

	@Test
	@DisplayName("1 / 2 = 0.5")
	void divideTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(0.5, calculator.divide(1, 2), "1 / 2 should equal 0.5");
	}

	@ParameterizedTest(name = "{0} / {1} = {2}")
	@CsvSource({
			"0,    1,   0",
			"5,    -2,  -2.5",
			"100,  20, 5.0",
			"3,  4, 0.75"
	})
	void divide(int first, int second, float expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.divide(first, second),
				() -> first + " / " + second + " should equal " + expectedResult);
	}	
}
