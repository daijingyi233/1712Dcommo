package com.djy.utils;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class CollectionUtilTest {

	@Test
	public void testisEmpty() {
		HashSet<Integer> set=new HashSet<>();
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		HashMap<Integer, Integer> map=new HashMap<>();
		boolean b1 = CollectionUtil.isEmpty(list);
		System.out.println(b1);
		boolean b2 = CollectionUtil.isEmpty(set);
		System.out.println(b2);
	}

}
