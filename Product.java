package ProductTable;
import java.util.*;
import java.io.*;
public class Product {

	    String productID ;
	    String productName;
	    double price;
	    int quantity;
	    
	   public Product(String productID, String productName, double price, int quantity) {
	        super();
	        this.productID = productID;
	        this.productName = productName;
	        this.price = price;
	        this.quantity = quantity;
	    }

	   public String getProductID() {
	        return productID;
	    }

	   public String getProductName() {
	        return productName;
	    }

	    public double getPrice() {
	        return price;
	    }

	   public int getQuantity() {
	        return quantity;
	    }

	   @Override
	    public String toString() {
	        return "Product \nproductID : " + productID + ",\nproductName : " + productName + ",\nprice : " + price + ", \nquantity : "
	                + quantity;
	    }
	   public static void main(String[] args) throws Exception{
	        
	        ProductLoader pp = new ProductLoader();
	        
	        pp.loadProduct();
	        System.out.println(pp.searchProduct("P101"));
	   }
	    
	}