
public class StringCalculator {

	public int add(String numbers) {
		if(numbers == null || numbers.length() == 0)
			return 0;
		else if(!numbers.contains(","))
			return Integer.parseInt(numbers);
		else {
			int indexOfComma = numbers.indexOf(",");
			return Integer.parseInt(numbers.substring(0, indexOfComma)) + Integer.parseInt(numbers.substring(indexOfComma + 1));
		}
	}
}
