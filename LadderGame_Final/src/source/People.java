package source;

import source.Column.Direction;

public class People {
	private String name;
	private int nowPoint;
	private int destination; 

	public People(String name, int startPoint){
		this.name = name;
		this.nowPoint = startPoint;
	}
	
	public String getName() {
		return name;
	}
	
	public void movePoint(Direction d){
		nowPoint += d.getDirNum();
	}
	
	public int arrive(){
		destination = nowPoint;
		return destination;
	}
}
