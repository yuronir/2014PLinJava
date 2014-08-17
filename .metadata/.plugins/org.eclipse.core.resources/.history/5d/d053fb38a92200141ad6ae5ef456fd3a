package source;
import java.util.Scanner;

public class Init {

	private final int manual = 1;
	private final int random = 2;
	private int type; 
	
	Scanner sc = new Scanner(System.in);
	Ladder ld;
	
	public Init(){}
	
	public void InitStart(){
		firstStep();
		secondStep();
		thirdStep();
	}
	
	private void thirdStep() {
		ld.drawLine(type);
	}

	private void firstStep() {
		int pCount = getPeopleCount();
		ld = new Ladder(pCount);
	}

	//선긋기 타입 선택
	public void secondStep(){
		
		int choice;
		
		System.out.println("선을 어떻게 그으시겠습니까?\n "
				+ "1.직접 선 긋기\n"
				+ "2.임의로 선 긋기");
		
		choice = Util.getNumber();

		if(choice != manual && choice != random){
			System.out.println("잘못된 선택입니다.");
			secondStep();
		}
		
		type = choice;
	}


	//인원수 입력
	public int getPeopleCount(){
		
		int pCount;
		
		System.out.print("인원수를 입력해주세요 : ");
		pCount = Util.getNumber();

		if(Util.isLessThan(pCount, 2)){
			System.out.println("최소 두 명의 인원이 필요합니다.");
			return getPeopleCount();
		}
		
		return pCount;
	}
}
