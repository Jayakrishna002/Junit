package org.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Running {

	public class Sample1 {
		
		@Test
		public void tC1() {
			Assert.assertTrue(false);
		}
		@Ignore
		@Test
		public void tC2() {
			System.out.println("1");

		}
		@Test
		public void tC3() {
			System.out.println("2");

		}

	}
}
