package com.djy.utils;

import java.util.Collection;

public class CollectionUtil {
	//�жϼ����Ƿ���ֵ
	public static <T> boolean isEmpty(Collection<?> obj){
		return obj==null||obj.isEmpty();
	}
}
