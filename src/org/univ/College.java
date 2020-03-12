package org.univ;

public class College extends University {
	@Override
	public void ug() {
		System.out.println("Ug Course fees:65000");
	}
	@Override
	public void pg() {
		System.out.println("Pg Course Fees: 95000");
	}
	public static void main(String[] args) {
		College col=new College();
		col.ug();
		col.pg();
		}
}
