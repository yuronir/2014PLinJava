import java.util.Scanner;


public class Initialize {

	Scanner sc = new Scanner(System.in);
	Ladder ld;
	
	public Initialize(Ladder ld){
		this.ld = ld;
	}
	
	private int getPersonCount() {
		
		int pCount;
		
		System.out.println("��ٸ�Ÿ�⸦ �����մϴ�.\n"
				+ "���ϴ� �ο����� �Է����ּ��� : ");
		
		try {
			pCount = Integer.parseInt(sc.nextLine());
		} catch(Exception e) {
			System.out.println("�߸��� �Է��Դϴ�.");
			pCount = getPersonCount();
		}
		
		if(pCount < 2){
			System.out.println("�߸��� �Է��Դϴ�.");
			pCount = getPersonCount();				
		}

		return pCount;
	}

	private void getPersonName(int startEmptyNum) {

		String[] nameList;
		int gapCount;
		int afterEmptyNum;

		System.out.println("�Է��� �ʿ��� �ο��� : " + (ld.personCount - startEmptyNum) + "���Դϴ�.\n"
				+ "�� �̸��� ����� ������ �Է����ּ���.\n"
				+ "Ex) �̿��� �ֽ��� �����");

		nameList = sc.nextLine().split(" ");
		gapCount = ld.personCount - startEmptyNum - nameList.length; //�Է¹��� ��� ���� �Է¹޾ƾ� �ϴ� ��� ���� ��.

		if(gapCount < 0){ //�ʰ��Է�
			System.out.println("�Է��� ��� �̸��� �ο����� �ʰ��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
			getPersonName(startEmptyNum);
			return;
		} 

		afterEmptyNum = setPersonData(nameList, startEmptyNum);

		if(gapCount > 0){
			System.out.println(gapCount + "���� �� �Է��ؾ� �մϴ�.");
			getPersonName(afterEmptyNum);
		} else {
			System.out.print("�Է¿Ϸ�! ����Ʈ : ");
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

	//Column, People��ü�� �ʱ�ȭ���ְ�, Raw �ټ��� �����Ѵ�..
	public void Init(){

		System.out.println("�ʱ�ȭ�մϴ�...");
		ld.personCount = getPersonCount();
		ld.people = new People[ld.personCount];
		ld.column = new Column[ld.personCount];
		setRawNum();
		for(int i = 0; i < ld.personCount; i++){
			ld.column[i] = new Column(ld.rawCount);
		}

		System.out.println("�ʱ�ȭ �Ϸ�!");
		
		getPersonName(0);
	}
	
	private void setRawNum(){
		ld.rawCount = ld.personCount*2;
	}
}