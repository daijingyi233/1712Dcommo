package com.djy.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
	public static String Now(){//��ȡ��ǰʱ��
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		return formatter.format(date);
	}
}
