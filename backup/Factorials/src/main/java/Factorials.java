public class Factorials {
	public String factorOf(int factorial) {
		double factorial2 = factorial;
		int num = 2;
		for (num = 2; factorial2 > 1; num++) {
			factorial2 = factorial2 / num;
		}
		if (factorial2 == 1.0) {
			return factorial + " = " + (num - 1) + "!";
		} else {
			return factorial + " NONE";
		}
	}
}