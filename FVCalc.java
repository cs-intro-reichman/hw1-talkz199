// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]) / 100;
		int yearNum = Integer.parseInt(args[2]);
		double futureValue = currentValue * Math.pow((1 + rate),yearNum);
	
		System.out.println( "After " + yearNum +" years, $" + currentValue +" saved at "+ rate * 100 +"% will yield $"+(int)futureValue);
	}
}