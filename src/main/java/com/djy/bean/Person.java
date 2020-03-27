package com.djy.bean;

public class Person {
	private String name;//姓名
	private Integer age;//年龄
	private String abuot;//介绍
	private String created;//注册日期
	public Person() {
		super();
	}
	public Person(String name, Integer age, String abuot, String created) {
		super();
		this.name = name;
		this.age = age;
		this.abuot = abuot;
		this.created = created;
	}
	@Override
	public String toString() {
		return "姓名:" + name + " 年龄:" + age + " 介绍:" + abuot + " 注册日期:" + created + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAbuot() {
		return abuot;
	}
	public void setAbuot(String abuot) {
		this.abuot = abuot;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
}
