import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ppa1FunctionTest {
	
	ppa1Function test = new ppa1Function();
	
	@Test
	public void evenTest() {
		double []testResult1 = {5.75,0.0};	//expected value for test 1
		double []testResult2 = {4.6,0.0};	//expected value for test 2
		assertArrayEquals(test.splitTheTip(10, 2),testResult1,"10 + 1.50 tip divided by 2 people should be 5.75 per guest");
		assertArrayEquals(test.splitTheTip(12, 3),testResult2,"12 + 1.8 tip divided by 3 people should be 4.6 per guest");
		
	}
	@Test
	public void roundTest() {
		double []testResult1 = {6.60,0.0};
		double []testResult2 = {4.62,0.0};
		assertArrayEquals(test.splitTheTip(11.48, 2),testResult1,"11.48 + 1.722 tip divided by 2 people should be 6.6 per guest when rounded");
		assertArrayEquals(test.splitTheTip(12.05, 3),testResult2, "12.05 + 1.8075  tip divided by 3 people should be 4.62 per guest when rounded");
	}
	
	@Test
	public void unevenTest() {
		double []testResult1 = {3.73, 0.03};
		double []testResult2 = {12.77, 0.07};
		assertArrayEquals(test.splitTheTip(13.00, 4),testResult1,"13.00 + 1.95 tip divided by 4 people should be 3.73 per guest with 0.03 remainder");
		assertArrayEquals(test.splitTheTip(100, 9),testResult2, "100.00 + 15.00  tip divided by 9 people should be 12.77 per guest with 0.07 remainder");
	}
}
