package com.coding.ShoppingCart;

public class Product {
	private int productID;
	private String productName;
	private float price;
	private float discount;
	private String description;
	private int productLimitQuantity;

	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getProductLimitQuantity() {
		return productLimitQuantity;
	}
	public void setProductLimitQuantity(int productLimitQuantity) {
		this.productLimitQuantity = productLimitQuantity;
	}
	
	public Product(int productID, String productName, float price, float discount, String description, int productLimitQuantity) {
		this.productID = productID;
		this.productName = productName;
		this.price = price;
		this.discount = discount;
		this.description = description;
		this.productLimitQuantity = productLimitQuantity;
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", price=" + price + ", discount="
				+ discount + ", description=" + description + ", productLimitQuantity=" + productLimitQuantity + "]";
	}
}
