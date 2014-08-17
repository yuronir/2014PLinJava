package source;

import java.util.Random;

import source.Column.Direction;


public class Ladder {

	public final static int manual = 1;
	public final static int random = 2;
	
	private Row row;
	private Column[] col;
	private People[] people;
	
	public Ladder(int pCount){
		col = new Column[pCount];
		people = new People[pCount];
	}
	
	public void drawLine(int type){
		System.out.println("몇 줄을 그을까요? 범위 : " + col.length + " ~ " + col.length*2);
		
		int rowCount = Util.getNumber();
		if(Util.isInRange(rowCount, col.length,	col.length*2) == false){
			System.out.println("범위 내의 숫자를 선택해주세요.");
			drawLine(type);
			return;
		}
		
		row = new Row(rowCount);
		
		if(type == manual)
			drawManualLine(rowCount);
		else if(type == random)
			drawRandomLine(rowCount);
	}
	
	private void drawManualLine(int rowCount){
		for(int i = 0; i < rowCount; i++){
			/*
			 * TODO
			 * 직접 선 긋기, 아직 미구현
			 */
		}
	}
	
	private void drawRandomLine(int rowCount){
		
		Random rd = new Random();
		int rdColAt;
		
		for(int i = 0; i < rowCount; i++){
			rdColAt = rd.nextInt(col.length-1);
			row.setRow(i, rdColAt);
			col[rdColAt].setDirection(i, Direction.Right);
			col[rdColAt+1].setDirection(i, Direction.Left);
		}
	}

	public void setLineName() {
		System.out.println("각 라인의 이름을 입력해주세요.");
		
		for(int i = 0; i < people.length; i++){
			String name = Util.getString();
			people[i] = new People(name, i);
		}
	}

	public int getPCount(){
		return people.length;
	}
	
	public void printLadder(){
		
	}

	public void movePerson() {
		// TODO Auto-generated method stub
		
	}
}
