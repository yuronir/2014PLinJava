import static org.junit.Assert.assertArrayEquals;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	
	Calculator cal;

	@Override
	protected void setUp() throws Exception {
		cal = new Calculator();
		System.out.println("Set up!");
	}
		
	public void testToInt() throws Exception {
		Integer[] res = cal.toInt(new String[]{"3","4","5"});
		assertArrayEquals(new Integer[]{3, 4,5}, res);
		System.out.println("toInt!");
	}
	
	public void testAddNum() throws Exception {
		int res = cal.addNum(new Integer[]{1,2,3});
		assertEquals(6, res);
		
		System.out.println("addNum!");
	}
	
	@Override
	protected void tearDown() throws Exception {
		System.out.println("tearDown!");
	}
}
