

public class Main {

	public static void main(String[] args) {
		Math calculation = new Math();
		
		calculation.doMath(100.00,"/",100.00);

		
		System.out.println(calculation.doMath(100000.00,"*",3.1));
		
	}

}
