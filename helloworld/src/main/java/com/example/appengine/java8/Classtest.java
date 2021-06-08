import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Classtest {

	@Test
	void test() {
		PrintTicket1 CC = new PrintTicket1(null, null, null, null, null, null, null, null, null);
		String result = CC.Ccheck("Economic");
		String Expected = "Economic";
		assertEquals(Expected,result);
		
	}

}
