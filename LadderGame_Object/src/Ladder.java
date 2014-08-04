import java.util.Random;
import java.util.Scanner;

/*
 * TODO
 * 
 * 1.��� �� �Է� OK
 * 2.��� ����ŭ�� Col ���� OK
 * 3.�� Raw�� �������� ���߱� OK
 * (col�� row������ ����-> ���� col�� +1, ������ col�� -1)
 * 
 * 4.�� Raw�� ����� ��߽��Ѽ� ������ ã��
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
		
		for(int i = 0; i < rawCount; i++){
			for(int j = 0; j < personCount; j++){
				if(column[j].getDirection(i) == 1){
					System.out.print("��");
				} else if(column[j].getDirection(i) == -1){
					System.out.print("��");
				} else {
					System.out.print("��");
				}
			}
			System.out.println();
		}
	}
}