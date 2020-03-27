package com.djy.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		int r = RandomUtil.random(1,3);
		System.out.println(r);
	}

	@Test
	public void testSubRandom() {
		int[] sub= RandomUtil.subRandom(1,10,5);
		for (int i = 0; i < sub.length; i++) {
			System.out.println(sub[i]);
		}
	}

	@Test
	public void testRandomCharacter() {
		char s = RandomUtil.randomCharacter();
		System.out.println(s);
	}

	@Test
	public void testRandomString() {
		String str = RandomUtil.randomString(6);
		System.out.println(str);
	}

}
