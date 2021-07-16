package com.mastek.hrmgmt;
import com.mastek.hrmgnt.model.*;
public class HrMgmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FTEmployee f = new FTEmployee();
		f.setEname("Rutuja");
		f.setEno(14931);
		f.setDesignation("Trainee Software Engineer");
		f.setSalary(20000);
		System.out.println(f.getEno());
		System.out.println(f.getEname());
		System.out.println(f.getDesignation());
		System.out.println(f.getSalary());
		

	}

}
