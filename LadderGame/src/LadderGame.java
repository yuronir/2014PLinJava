
public class LadderGame {

	public static void main(String[] args){
		Ladder ld = new Ladder();

		ld.goLadder(0);
		ld.goLadder(4);
	}

	/*
	 * TODO
	 * ��� �÷��̾ �������� �� ��ġ ����ֱ�(������� 3�� �÷��̾��� 0 + (2 * (3-1)) = 4������ ����)
	 * 
	 */
	
	public static class Ladder{

		private int[][] ladderData =
			{
				{1, 0, 1, 0, 1, 0, 1},
				{1, 0, 1, 0, 1, 1, 1},
				{1, 1, 1, 0, 1, 0, 1},
				{1, 0, 1, 1, 1, 0, 1},
				{1, 0, 1, 0, 1, 1, 1},
				{1, 0, 1, 0, 1, 0, 1}
			};

		private int[][] tempLadder;

		public void printLadder(int x, int y){
			for(int i = 0; i < tempLadder.length; i++){
				for(int j = 0; j < tempLadder[i].length; j++){

					if(x == j && y == i){
						System.out.print("X" + " ");
					}
					else {
						System.out.print(tempLadder[i][j] + " ");
					}
				}
				System.out.println();
			}
			System.out.println();
		}

		public void goLadder(int x){
			
			tempLadder = ladderData.clone();
//			int x = 2 * (startPoint - 1);
//
//			if(x > tempLadder[0].length){
//				System.out.println("�߸��� ������ �����Դϴ�.");
//				return;
//			}
			
			int y = 0;

			while(y < tempLadder.length){

				printLadder(x, y);

				if(hasLeftRoot(x, y)){
//					tempLadder[y][x-1] = 0;
					x = x - 2;
					y++;
					continue;
				}

				if(hasRightRoot(x, y)){
//					tempLadder[y][x+1] = 0;
					x = x + 2;
					y++;
					continue;
				}

				y++;
			}
			System.out.println("������ : " + x);
		}

		public boolean hasLeftRoot(int x, int y){
			return x != 0 && tempLadder[y][x-1] == 1;
		}

		public boolean hasRightRoot(int x, int y){
			return x+1 != tempLadder[y].length && tempLadder[y][x+1] == 1;
		}	
	}
}
