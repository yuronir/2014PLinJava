import java.util.Random;
import java.util.Scanner;

/*
 * TODO
 * 
 * 1.사람 수 입력 OK
 * 2.사람 수만큼의 Col 생성 OK
 * 3.각 Raw에 랜덤으로 선긋기 OK
 * (col의 row지점에 랜덤-> 왼쪽 col은 +1, 오른쪽 col은 -1)
 * 
 * 4.각 Raw의 사람을 출발시켜서 도착점 찾기
 * 
 */


public class Ladder {

	Scanner sc = new Scanner(System.in);
	int rawCount;
	int personCount;
	Column[] column;
	People[] people;

	public Ladder(){
		Initialize it = new Initialize(this);
		it.Init();
		makeLadder();
		printLadder();
	}

	private void makeLadder(){
		setRandomRaw();
	}

	private void setRandomRaw(){
		
		Random rd = new Random();
		int rdRaw;
		
		for(int i = 0; i < rawCount; i++){
			rdRaw = rd.nextInt(personCount-1);
			makeRaw(rdRaw, i);
		}
	}

	private void makeRaw(int i, int j){
		try{
			column[i].setRaw(j, 1);
			column[i+1].setRaw(j, -1);		
		} catch(Exception e) {
			System.out.println("error!");
		}
	}

	public void printLadder(){
		
		for(int rawNum = 0; rawNum < rawCount; rawNum++){
			printLadderCol(rawNum);
		}
	}
	
	private void printLadderCol(int rawNum){
		for(int j = 0; j < personCount; j++){
			definePrint(column[j].getDirection(rawNum));
		}
		System.out.println();		
	}
	
	private void definePrint(int direction){
		if(direction == 1){
			System.out.print("├");
		} else if(direction == -1){
			System.out.print("┤");
		} else {
			System.out.print("│");
		}		
	}
}
