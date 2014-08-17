package source;

public class LadderGame {
	public LadderGame(){
		/*
		 * 1.사람 수 지정       (Initialize)
		 * 
		 * 2-1.선 직접 긋기    (Raw, Column Data 추가)
		 * 2-2.선 임의로 긋기 (Raw, Column Data 추가)
		 * 
		 * 3.각 출발선의 이름 지정 (People-Name Data 추가)
		 * 
		 * --->여기까지 Init에서
		 * 
		 * 4.출발시켜서 각 출발선의 도착점 찾기 
		 * (People-Destination Data 추가)
		 * (Run 함수를 통한 출발)
		 * 
		 * 5-1.한꺼번에 결과 보기(한꺼번에 결과 출력 - 사다리도 함께) 						
		 * 5-2.한명씩 결과 보기(EnterKey 한번에 한 명씩 or 입력한 번호의 결과 보기)
		 */
		
		Ladder ladder = initLadder();
		Go.run(ladder);
		
	}
	
	private Ladder initLadder(){
		Init it = new Init();
		it.InitStart();
		
		return it.getLadder();
	}
}
