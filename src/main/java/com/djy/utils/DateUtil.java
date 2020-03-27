package com.djy.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static String randomDate(Date startDate,Date endDate){
		SimpleDateFormat f=new SimpleDateFormat("yyy-MM-dd");
		long t1=startDate.getTime();
		long t2=endDate.getTime();
		if(t1>t2){
			return "错误:开始时间比结束时间大";
		}
		long t=(long) (Math.random()*(t2-t1+1)+t1);
		return f.format(new Date(t));
	}
}
