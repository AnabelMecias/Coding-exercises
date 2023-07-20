package com.coding.ShoppingCart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ShoppingCart {
    private String shoppingCartName;
    private ArrayList<Product> products;
    private double subTotal;
    private int productsQuantity;
    private double salesTax;

    public ShoppingCart(String shoppingCartName) {
        this.shoppingCartName = shoppingCartName;
        products = new ArrayList<>();
        this.subTotal = 0;
        this.salesTax = 0;
        this.productsQuantity = 0;
    }

    public String getShoppingCartName() {
        return shoppingCartName;
    }

    public void setShoppingCartName(String shoppingCartName) {
        this.shoppingCartName = shoppingCartName;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public int getProductsQuantity() {
        return productsQuantity;
    }


    public double getSalesTax() {
        return subTotal * 0.1;
    }

    public void addProduct(Product prd) {
            products.add(prd);
            productsQuantity ++;
            subTotal = subTotal + prd.getPrice();
            salesTax = subTotal*0.1;
            System.out.println("Product added: " + prd);
    }

    public void deleteProduct(Product prd) {
        if (productsQuantity == 0) {
            System.out.println("The shopping cart is empty");
            System.out.println("Shopping cart: "+shoppingCartName+" - Products quantity: "+productsQuantity);
        }else{
            if (products.contains(prd)) {
                products.remove(prd);
                productsQuantity --;
                subTotal = subTotal - prd.getPrice();
                salesTax = subTotal*0.1;
                System.out.println("Delete product: "+prd);
                System.out.println("Shopping cart: "+shoppingCartName+" - Products quantity: "+productsQuantity);
            }else{
                System.out.println("The product is not in the shopping cart");
                System.out.println("Shopping cart: "+shoppingCartName+" - Products quantity: "+productsQuantity);
            }            
        }
    }

    public void editProductQuantity(Product product, int quantity){
        if(products.contains(product)){
            product.setProductLimitQuantity(quantity);
            System.out.println("Product "+product.getProductName()+" product quantity updated to "+product.getProductLimitQuantity());
        }else{
            System.out.println("The product is not in the shopping cart");
        }
    }

    public void showProductsAlphabetical(){
        System.out.println("Products in Shopping Cart alphabetical:");
        ArrayList<Product> productsList = new ArrayList<>(products);
        Collections.sort(productsList, Comparator.comparing(Product::getProductName));
        for (int i = 0; i < productsList.size(); i++) {
            System.out.println(productsList.get(i));
        }
    }
    public void showProducts() {
        System.out.println("Products in Shopping Cart:");

        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    public void showShoppingCartDetails(){
        System.out.println("Shopping Cart \""+shoppingCartName+ "\" details: Subtotal= "+subTotal+" Products Quentity= "+productsQuantity+" Sales Tax= "+salesTax);
    }

    // Attributes or Variables
    // Total of Cart
    // List of all items in the cart -- Data Structure (Array, ArrayList..)
    // Name of Cart
    // Order ID
    // Sales Tax

    // ---- Methods
    // Add a product to shopping cart -- Create --> complete
    // Show all products in shopping cart -- Read
    // Show total of shopping cart -- Read
    // Update quantity of products -- Update
    // Delete product from shopping cart -- Delete a product
    // Empty cart -- Delete
}
