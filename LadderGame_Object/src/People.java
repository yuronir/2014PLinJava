
public class People {
	private String name;
	private int nowLocation;
	private int destination;
	
	public People(String name, int colNum){
		this.name = name;
		nowLocation = colNum;
	}
	
	public void move(int direction){
		nowLocation += direction;
	}
	
	public int arrive(){
		destination = nowLocation;
		return destination;
	}
	
	public String getName(){
		return name;
	}
}
