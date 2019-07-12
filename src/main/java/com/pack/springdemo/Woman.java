package com.pack.springdemo;

public class Woman implements Human{
	private String name;
	@Override
	public String toString() {
		return "Woman [name=" + name + ", age=" + age + "]";
	}
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
