package printPrimes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class test {
		method p;
		String result;
		String triA = "null235";
		String triB = "null235711";
		
		@Before
		public void setUp(){
			p = new method();
		}
		
		@Test
		public void testEquilateral(){
			result = p.printPrimes(3);
			assertEquals(triA, result);
		}
		
		@Test
		public void testIsosceles(){
			result = p.printPrimes(5);
			assertEquals(triB, result);
		}

	 
}
	     

