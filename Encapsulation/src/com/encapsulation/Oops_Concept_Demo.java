package com.encapsulation;

public class Oops_Concept_Demo {

	private int serialNum; 
	private String name;
	private int Age;
	
	public void setSerialNum(int serialNum)
	{
		this.serialNum= serialNum;
	}
	
	public int getSerialNum()
	{
		return serialNum;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(int Age)
	{
		this.Age=Age;
	}
	
	public int getAge()
	{
		return Age;
	}

	@Override
	public String toString() {
		return "Oops_Concept_Demo [serialNum=" + serialNum + ", name=" + name + ", Age=" + Age + "]";
	}
	
	
	
}


	

