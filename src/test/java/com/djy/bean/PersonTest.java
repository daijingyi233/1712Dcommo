package com.djy.bean;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Calendar;

import org.junit.Test;

import com.djy.utils.DateUtil;
import com.djy.utils.RandomUtil;
import com.djy.utils.StringUtil;
import com.djy.utils.TimeUtil;

public class PersonTest {

	@Test
	public void test() {
		Calendar c=Calendar.getInstance();
		c.set(2010, 0,1);
		String now = TimeUtil.Now();
		System.out.println("现在时间:"+now);
		for (int i=1;i<=1000;i++) {
			Person p=new Person(StringUtil.generateChineseName(),
					RandomUtil.random(1,120),
					StringUtil.randomChineseString(140),
					DateUtil.randomDate(c.getTime(),new Date()));
			System.out.println(p);
		}
		
	}

}
