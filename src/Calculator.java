import java.util.Scanner;


public class Calculator {

	/*
	 * TODO
	 * 1. �ֿܼ��� �Է°� �ޱ�
	 * 2. String -> String[]
	 * 3. String[] -> Integer[]
	 * 3. ���ڸ���Ʈ�� �о ����
	 */
	
	public int calculate(){
		
		
		return addNum(toInt(split(getInput())));
	}
	
	public String getInput(){
		Scanner sc = new Scanner(System.in);
		String result = sc.next();
		sc.close();
		
		return result;
	}
	
	public String[] split(String input){
		return input.split(",;");
	}
	
	public Integer[] toInt(String[] input){
		Integer[] result = new Integer[input.length];
		
		for(int i = 0; i < input.length; i++){
			result[i] = Integer.parseInt(input[i]);
		}
		
		return result;
	}
	
	public int addNum(Integer[] nums){
		int result = 0;
		
		for(int num : nums){
			result += num;
		}
		
		return result;
	}
}
