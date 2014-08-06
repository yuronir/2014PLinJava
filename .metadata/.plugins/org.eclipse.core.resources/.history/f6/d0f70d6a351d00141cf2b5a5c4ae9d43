

public class Column {
	private int[] rawData;
	
	public Column(int rawCount) {
		rawData = new int[rawCount];
	}
	
	public void setRaw(int rawNum, int direction){
		rawData[rawNum] = direction;
	}
	
	public int getDirection(int rawNum){
		try{
		return rawData[rawNum];
		} catch(Exception e) {
			return 0;
		}
	}
}
