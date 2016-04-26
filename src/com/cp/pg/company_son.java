package com.cp.pg;

import java.util.ArrayList;
import java.util.List;

public class company_son extends cp_company {

	public company_son(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	List<cp_company> mylist=new ArrayList<cp_company>();
	
	@Override
	public void add(cp_company cp) {
		// TODO Auto-generated method stub
		mylist.add(cp);
	}

	@Override
	public void remove(cp_company cp) {
		// TODO Auto-generated method stub
		mylist.remove(cp);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("*"+name);
		for(int i=0;i<mylist.size();i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			mylist.get(i).display();
		}
	}

	@Override
	public void function() {
		// TODO Auto-generated method stub
		
	}



}
