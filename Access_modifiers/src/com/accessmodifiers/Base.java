package com.accessmodifiers;

public class Base {
	// declaring default, public , private and protected variables
	
	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;
	
	// declaring default, public , private and protected methods
	void methodDefault()
	{
		System.out.println("Default Variables");
		System.out.println("Default variable:"+varDefault);
	}
	 
	public void methodPublic()
	{
		System.out.println("Public Variables");
		System.out.println("Public variable:"+varPublic);
	}
	protected void methodPrivate()
	{
		System.out.println("Protected Variables");
		System.out.println("Protected variable:"+varProtected);
	}
	protected void methodProtected()
	{
		System.out.println("Protected Access Modifier");
		System.out.println("Protected Variable:"+ getVarProtected());
	}

	public int getVarProtected() {
		return varProtected;
	}

	public void setVarProtected(int varProtected) {
		this.varProtected = varProtected;
	}
}
