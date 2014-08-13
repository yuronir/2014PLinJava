package source;
import junit.framework.TestCase;


public class InitTest extends TestCase {

	Init it;
	
	@Override
	protected void setUp() throws Exception {
		it = new Init();
		super.setUp();
	}
	
	public void testGetPeopleCount() {
		int result = it.getPeopleCount();
		assertEquals(3, result);
	}

}
