import java.util.Scanner;


public class Initialize {

	Scanner sc = new Scanner(System.in);
	Ladder ld;
	
	public Initialize(Ladder ld){
		this.ld = ld;
	}

	//Column, People객체를 초기화해주고, Raw 줄수를 지정한다..
	public void Init()

		System.out.println("초기화합니다...");
		ld.personCount = getPersonCount();
		ld.people = new People[ld.personCount];
		ld.column = new Column[ld.personCount];
		setRawNum();
		for(int i = 0; i < ld.personCount; i++){
			ld.column[i] = new Column(ld.rawCount);
		}

		System.out.println("초기화 완료!");
		
		getPersonName(0);
	}
	
	private int getPersonCount() {
		
		int pCount;
		
		System.out.println("사다리타기를 시작합니다.\n"
				+ "원하는 인원수를 입력해주세요 : ");
		
		try {
			pCount = Integer.parseInt(sc.nextLine());
		} catch(Exception e) {
			System.out.println("잘못된 입력입니다.");
			pCount = getPersonCount();
		}
		
		if(pCount < 2){
			System.out.println("잘못된 입력입니다.");
			pCount = getPersonCount();				
		}

		return pCount;
	}

	private void getPersonName(int startEmptyNum) {

		String[] nameList;
		int gapCount;
		int afterEmptyNum;

		System.out.println("입력이 필요한 인원수 : " + (ld.personCount - startEmptyNum) + "명입니다.\n"
				+ "각 이름을 띄어쓰기로 나누어 입력해주세요.\n"
				+ "Ex) 이용은 최승희 서재원");

		nameList = sc.nextLine().split(" ");
		gapCount = ld.personCount - startEmptyNum - nameList.length; //입력받은 사람 수와 입력받아야 하는 사람 수의 차.

		if(gapCount < 0){ //초과입력
			System.out.println("입력한 사람 이름이 인원수를 초과하였습니다. 다시 입력해주세요.");
			getPersonName(startEmptyNum);
			return;
		} 

		afterEmptyNum = setPersonData(nameList, startEmptyNum);

		if(gapCount > 0){
			System.out.println(gapCount + "명을 더 입력해야 합니다.");
			getPersonName(afterEmptyNum);
		} else {
			System.out.print("입력완료! 리스트 : ");
			for(int i = 0; i < ld.personCount; i++){
				System.out.print(ld.people[i].getName() + " ");
			}
			System.out.println();
		}
	}

	private int setPersonData(String[] nameList, int startEmptyNum){

		for(int i = 0; i < nameList.length; i++, startEmptyNum++){
			ld.people[startEmptyNum] = new People(nameList[i], i);
		}

		return startEmptyNum;
	}

	private void setRawNum(){
		ld.rawCount = ld.personCount*2;
	}
}
