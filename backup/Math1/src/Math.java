
public class Math {

	public Double doMath(Double num1, String action, Double num2) {

		if (action.equals("*"))
			return calcMul(num1, num2);

		else if (action.equals("+")) {
			return calcPlus(num1, num2);
		}

		else if (action.equals("-")) {
			return calcMin(num1, num2);
		}

		else if (action.equals("/")) {
			return calcDiv(num1, num2);
		}

		else {
			System.out.println("You Fail, Application Terminated");
			System.exit(0);

		}
		return 377.07;

	}

	public static Double calcPlus(Double int1, Double int2) {
		Double num1 = int1;
		Double num2 = int2;

		return num1 + num2;

	}

	public static Double calcMin(Double a, Double b) {
		Double num1 = a;
		Double num2 = b;

		return num1 - num2;

	}

	public static Double calcDiv(Double a, Double b) {
		Double num1 = a;
		Double num2 = b;

		return num1 / num2;
	}

	public static Double calcMul(Double a, Double b) {
		Double num1 = a;
		Double num2 = b;

		return num1 * num2;

	}

	public static Double calc(Double num1, String action, Double num2) {

		return num1;
	}
}
