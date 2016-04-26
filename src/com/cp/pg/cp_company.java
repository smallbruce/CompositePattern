package com.cp.pg;

public abstract class cp_company {
	protected String name;
	public cp_company(String name){
		this.name=name;
	}
	
	public abstract void add(cp_company cp);
	public abstract void remove(cp_company cp);
	public abstract void display();
	public abstract void function();
}
