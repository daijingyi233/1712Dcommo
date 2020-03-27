package com.djy.utils;

import java.util.Collection;

public class CollectionUtil {
	//判断集合是否有值
	public static <T> boolean isEmpty(Collection<?> obj){
		return obj==null||obj.isEmpty();
	}
}
