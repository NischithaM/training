package com.cruds.collections;

public class Product 
{
	private int productid;
	private String productname;
	private double productrice;
	
	public Product(int productid, String productname, double productrice) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productrice = productrice;
	}
	public int getProductid()
	{
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getProductrice() {
		return productrice;
	}
	public void setProductrice(double productrice) {
		this.productrice = productrice;
	}
	@Override
	public int hashCode() {
		System.out.println("hashcode :" +this.productid);
		return this.productid;
	}
	
	@Override
	public boolean equals(Object obj) {
		Product other=(Product)obj;
		System.out.println("equals--->" + this.productid +"::::" +other.getProductid());
		return this.productid==other.productid;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productrice=" + productrice
				+ "]";
	}
	
	
	
	
}
