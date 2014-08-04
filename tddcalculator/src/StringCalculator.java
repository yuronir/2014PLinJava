
public class StringCalculator {

	public String[] split(String text){
		
		if(text == null){
			return new String[]{};
		}
		
		return text.split(",|\n");
	}

	public int[] toint(String[] values) {
		
		if(values == null){
			return new int[]{};
		}
		
		int[] numbers = new int[values.length];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(values[i]);
		}
		
		return numbers;
	}

}
