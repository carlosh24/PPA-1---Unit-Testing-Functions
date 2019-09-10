import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ppa1FunctionTest {
	
	@Test
	public void itShouldSplitEvenly() {
		ppa1Function test= new ppa1Function();
		double []t1 = {5.75,0.0};	//expected value for test 1
		double []t2 = {4.6,0.0};	//expected value for test 2
		assertArrayEquals(test.splitTheTip(10, 2),t1,"10 + 1.50 tip divided by 2 people should be 5.75 per guest");
		assertArrayEquals(test.splitTheTip(12, 3),t2,"12 + 1.8 tip divided by 3 people should be 4.6 per guest");
		
	}
	@Test
	public void roundTest() {
		ppa1Function test= new ppa1Function();
		double []testResult1 = {6.60,0.0};
		double []testResult2 = {4.62,0.0};
		assertArrayEquals(test.splitTheTip(11.48, 2),testResult1,"11.48 + 1.722 tip divided by 2 people should be 6.6 per guest  when rounded");
		assertArrayEquals(test.splitTheTip(12.05, 3),testResult2, "12.05 + 1.8075  tip divided by 2 people should be 4.62 per guest  when rounded");
	}
}
