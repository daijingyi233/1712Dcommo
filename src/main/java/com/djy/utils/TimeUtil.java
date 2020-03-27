package com.djy.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
	public static String Now(){//获取当前时间
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		return formatter.format(date);
	}
}
