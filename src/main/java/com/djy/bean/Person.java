package com.djy.bean;

public class Person {
	private String name;//����
	private Integer age;//����
	private String abuot;//����
	private String created;//ע������
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
		return "����:" + name + " ����:" + age + " ����:" + abuot + " ע������:" + created + "]";
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
