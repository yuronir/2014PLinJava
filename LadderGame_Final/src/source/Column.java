package source;

public class Column {
	private Direction[] directions;
	public static enum Direction {
		Left(-1), Straight(0), Right(1);
		private int dirNum;
		
		private Direction(int dirNum){
			this.dirNum = dirNum;
		}
		
		public int getDirNum(){
			return dirNum;
		}
	}
	
	public Column(int rowCount) {
		directions = new Direction[rowCount];
	}
	
	public void setDirection(int rowNum, Direction d){
		directions[rowNum] = d;
	}
	
	public Direction getDirection(int rowNum){
		try{
			return directions[rowNum];
		} catch(Exception e) {
			return Direction.Straight;
		}
	}
}
