package source;
import java.util.Scanner;

public class Util {
	
	public static boolean isInRange(int input, int min, int max){
		
		boolean result = false;
		
		if(input >= min && input <= max)
			result = true;
		
		return result;
	}
	
	public static boolean isLessThan(int input, int compareInt){
		
		boolean result = false;
		
		if(input < compareInt){
			result = true;
		}
		return result;
	}
	
	public static String getString(){
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		sc.close();

		return name;
	}
	
	public static int getNumber(){
		
		Scanner sc = new Scanner(System.in);
		
		String temp = sc.nextLine();
		int number;
		
		sc.close();
		
		try{
			number = Integer.parseInt(temp);
		} catch(Exception e){
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			return getNumber();
		}
		
		return number;
	}
}
