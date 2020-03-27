package com.djy.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String src=" ";
		boolean b = StringUtil.hasLength(src);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		String src=" ";
		boolean b = StringUtil.hasText(src);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String r = StringUtil.randomChineseString(4);
		System.out.println(r);
	}

	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}

}
