package source;

public class Go {

	public static void run(Ladder ladder){
		
		for(int i = 0; i < ladder.getPCount(); i++){
			ladder.movePerson();
		}
	}
}
