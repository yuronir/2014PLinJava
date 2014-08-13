package source;

import java.util.Random;


public class Ladder {
	private Row row;
	private Column[] col;
	private People people;
	
	public Ladder(int pCount){
		col = new Column[pCount];
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
		
		if(type == 1)
			drawManualLine(rowCount);
		else
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
		}
	}
}
