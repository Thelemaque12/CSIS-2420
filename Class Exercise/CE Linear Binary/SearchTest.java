package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ceLinearBinary.Search;

class SearchTest {
	
	private int numbersForLinear[] = {10,20,80,30,60,50,110,100,130,170};
	
	private int numbersForBinary[] = { 2, 3, 4, 10, 40 };

	@Test
	void linear_firstElement_returnIndex0() {
		int res = Search.linear(numbersForLinear, 10);
		assertEquals(res,0);
	}
	
	@Test
	void linear_middleElement_returnIndexOfElement() {
		int res = Search.linear(numbersForLinear, 50);
        assertEquals(res, 5);
	}
	
	@Test
	void linear_lastElement_returnLastIndex() {
		int res = Search.linear(numbersForLinear, 170);
        assertEquals(res, 9);
	}
	
	@Test
	void linear_elementNotInArray_returnMinusOne() {
		 int res = Search.linear(numbersForLinear, 200);
         assertEquals(res, -1);
	}
	
	@Test
	void linear_emptyArray_returnMinusOne() {
		  int res = Search.linear(new int[]{}, 10);
          assertEquals(res, -1);
	}
	
	 @Test
     void binary_firstElement_returnIndex0() {
             int res = Search.linear(numbersForBinary, 2);
             assertEquals(res, 0);
     }

     @Test
     void binary_middleElement_returnIndexOfElement() {
             int res = Search.linear(numbersForBinary, 4);
             assertEquals(res, 2);
     }
     @Test
     void binary_lastElement_returnLastIndex() {
             int res = Search.linear(numbersForBinary, 40);
             assertEquals(res, 4);
     }
     
     @Test
     void binary_elementNotInArray_returnMinusOne() {
             int res = Search.linear(numbersForBinary, 79);
             assertEquals(res, -1);
     }

     @Test
     void binary_emptyArray_returnMinusOne() {
             int res = Search.linear(new int[]{}, 10);
             assertEquals(res, -1);
     }
}
