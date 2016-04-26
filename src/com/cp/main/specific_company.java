package com.cp.main;
import com.cp.pg.*;

public class specific_company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Financial_Department FD=new Financial_Department("上海总公司的财务部");
		Personal_Department PD=new Personal_Department("上海总公司的人力资源部");
		
		company_son cp_s=new company_son("上海总公司");
		cp_s.add(FD);
		cp_s.add(PD);
		
		Financial_Department FD1=new Financial_Department("郑州分公司的财务部");
		Personal_Department PD1=new Personal_Department("郑州分公司的人力资源部");
		
		company_son cp_s1=new company_son("郑州分公司");
		cp_s1.add(FD1);
		cp_s1.add(PD1);
		
		cp_s.add(cp_s1);
		
		cp_s.display();
	}

}
