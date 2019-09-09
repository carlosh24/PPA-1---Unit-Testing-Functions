import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ppa1FunctionTest {

	@Test
	public void itShouldSplitEvenly() {
		pipa1Function test= new ppa1Function();
		double []t= {5.75,0};
		assertEquals(test.splitTheTip(10, 2),t,"10 + 1.50 tip divided by 2 people should be 5.75 per guest");
		assertEquals(test.splitTheTip(12, 3),t,"12 + 1.8 tip divided by 3 people should be 4.6 per guest");
		
	}
}
