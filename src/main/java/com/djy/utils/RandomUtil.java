package com.djy.utils;

import java.net.StandardSocketOptions;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
	//TODO 实现代码
		Random r=new Random();
		int i=r.nextInt(max-min+1)+min;//大于等于零小于max
		return i;
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs){
	//TODO 实现代码
		HashSet<Integer> set=new HashSet<>();
		while(set.size()!=subs){
			set.add(random(min, max));
		}
		int[] sub = new int[subs];
		int num=0;
		for (Integer i : set) {
			sub[num]=i;
			num++;
		}
		
		return sub;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
	//TODO 实现代码
		char[] chars={'1','2','3','4','5','6','7','8','9','0','q','w','e','r','t','y','u','i','o','p','l','k','j','h','g','f','d','s','a','z','x','c','v','b','n','m','Q','W','E','R','T','Y','U','I','O','P','L','K','J','H','G','F','D','S','A','Z','X','C','V','B','N','M'};
		Random r=new Random();
		return chars[r.nextInt(chars.length)];
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
	//TODO 实现代码
		String str="";
		for (int i=1;i<=length;i++) {
			char c = randomCharacter();
			str+=c;
		}
		return str;
	}

}
