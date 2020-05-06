package com.example.parkingslot.model;

public class EmployeeDTO {
	  private int empid;
	    private String empname;
	    private String designation ;
	    private int noofexp;
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public int getNoofexp() {
			return noofexp;
		}
		public void setNoofexp(int noofexp) {
			this.noofexp = noofexp;
		}
		public EmployeeDTO(int empid, String empname, String designation, int noofexp) {
			super();
			this.empid = empid;
			this.empname = empname;
			this.designation = designation;
			this.noofexp = noofexp;
		}
			    
	    
		
}
