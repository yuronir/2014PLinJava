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

	private Scanner sc = new Scanner(System.in);
	private int rawCount;
	private int personCount;
	private Column[] column;
	private People[] people;
	/**
	 * 특별한 이유가 없으면 객체의 필드는 private 접근 제어자로 구현
	 */

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
		/**
		 * 지금은 Random으로 사다리를 생성할 수 밖에 없다.
		 * Random이 아니라 사용자가 직접 사다리를 그릴 수 있는 기능까지 지원하고 싶다면 클래스 구조를 어떻게 가져가면 좋을까?
		 * 자바의 interface 공부하고 interface 활용해서 구현 시도해 보면 좋겠다.
		 */
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
		for(int i = 0; i < rawCount; i++){
			for(int j = 0; j < personCount; j++){
				if(column[j].getDirection(i) == 1){
					System.out.print("├");
				} else if(column[j].getDirection(i) == -1){
					System.out.print("┤");
				} else {
					System.out.print("│");
				}
				/**
				 * Direction이라는 enum 또는 class를 만들어서 위 if/else 제거해 봐라.
				 * 책의 다형성 공부하고 접근해 보면 좋겠다.
				 * 다형성을 활용해 if/else 제거해 보면 연습이 객체 지향에서 중요하다. javajigi
				 */
			}
			System.out.println();
		}
	}
}
