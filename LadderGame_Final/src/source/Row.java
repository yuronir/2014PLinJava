package source;


public class Row {
	private int[] row;
	
	public Row(int rowCount){
		row = new int[rowCount];
	}
	
	public void setRow(int rowNum, int colAt){
		row[rowNum] = colAt;
	}
}
