import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Dtest {

	@Test
	void test() {
		DomesticFlight df = new DomesticFlight(null);
		String result = df.dtest("Economic");
		assertEquals("Economic",result);
	}
	@Test
	void test2() {
		DomesticFlight df = new DomesticFlight(null);
		String result = df.dtest("Economic");
		assertEquals("Buisness",result);
	}
	}


