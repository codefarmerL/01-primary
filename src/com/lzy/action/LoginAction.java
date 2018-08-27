package com.lzy.action;

public class LoginAction {
	
	private String name;
	
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
	
	public String execute(){
		System.out.println("name" + getName());
		System.out.println("age" + getAge());
		return "success";
	}
}
