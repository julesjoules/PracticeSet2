package Test;

import static org.junit.Assert.*;

import pkgEmpty.MyInteger;

import org.junit.Test;


public class TestMyInteger {
	
		MyInteger i;
		MyInteger iValue;
		
		
		@Test
		public void testisEvenp() {
			i = new MyInteger(2);
			assertTrue(i.isEven());
		}
		
		@Test
		public void testisEvenf() {
			i = new MyInteger(3);
			assertFalse(i.isEven());
		}
		
		@Test
		public void testisOddp() {
			i = new MyInteger(7);
			assertTrue(i.isOdd());
		}
		
		@Test
		public void testisOddf() {
			i = new MyInteger(2);
			assertFalse(i.isOdd());
		}
		
		@Test
		public void testsisPrimeP() {
			i = new MyInteger(13);
			assertTrue(i.isPrime());
		}
		
		@Test
		public void testisPrimef() {
			i = new MyInteger(12);
			assertFalse(i.isPrime());
		}
		
		@Test
		public void testiValue() {
			i = new MyInteger(3);
			assertEquals(3,i.getiValue());
		}
		
		@ Test
		public void testisEven1() {
			i = new MyInteger(4);
			assertTrue(MyInteger.isEven(i));
			
		}
		
		@ Test
		public void testisOdd1() {
			i = new MyInteger(5);
			assertTrue(MyInteger.isOdd(i));
			
		}
		
		@ Test
		public void testisPrime1() {
			i = new MyInteger(5);
			assertTrue(MyInteger.isPrime(i));
		
		}
		
		@ Test
		public void testEqualst() {
			i = new MyInteger(8);
			assertTrue(i.Equals(8));
			
		}
		
		@ Test
		public void testEqualsf() {
			i = new MyInteger(5);
			assertFalse(i.Equals(25));
		}
		
		@ Test
		public void testEquals2() {
			i = new MyInteger(46);
			iValue = new MyInteger(46);
			assertTrue(i.Equals(iValue));
		}
		

}
