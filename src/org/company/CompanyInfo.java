package org.company;

public class CompanyInfo {
	public void companyName(String name) {
System.out.println("Company Name:"+name);
	}
	public void companyName(int id,String add) {
		System.out.println("Company Id:"+id);
		System.out.println("Company Address:"+add);
				}
	public void companyName(long phone,String email) {
		System.out.println("Company Phone:"+phone);
		System.out.println("Company Email:"+email);
				}
	public static void main(String[] args) {
		CompanyInfo com=new CompanyInfo();
		com.companyName("IT Company");
		com.companyName(1234," T nagar,chennai");
		com.companyName( 9537746722l, "It97@gmail.com");
		
	}

}
