package com.djy.utils;

import java.net.StandardSocketOptions;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {
	//����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	public static int random(int min, int max){
	//TODO ʵ�ִ���
		Random r=new Random();
		int i=r.nextInt(max-min+1)+min;//���ڵ�����С��max
		return i;
	}
	//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ��� (8��)
	public static int[] subRandom (int min, int max, int subs){
	//TODO ʵ�ִ���
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
	//����3������1��1-9,a-Z֮�������ַ��� (8��)
	public static char randomCharacter (){
	//TODO ʵ�ִ���
		char[] chars={'1','2','3','4','5','6','7','8','9','0','q','w','e','r','t','y','u','i','o','p','l','k','j','h','g','f','d','s','a','z','x','c','v','b','n','m','Q','W','E','R','T','Y','U','I','O','P','L','K','J','H','G','F','D','S','A','Z','X','C','V','B','N','M'};
		Random r=new Random();
		return chars[r.nextInt(chars.length)];
	}
	//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length){
	//TODO ʵ�ִ���
		String str="";
		for (int i=1;i<=length;i++) {
			char c = randomCharacter();
			str+=c;
		}
		return str;
	}

}
