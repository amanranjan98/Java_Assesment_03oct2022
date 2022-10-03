package ProductTable;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class TestProduct {
    private static Scanner scan;



   public static void main(String[] args) throws IOException {
        scan = new Scanner(System.in);
        ArrayList<Product> prod;
        try {
			ProductLoader.loadProduct();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String newtemp = "\n";
        prod = (ArrayList<Product>)ProductLoader.getProductList();
        System.out.print("Enter the product ID : ");
        String prodID = scan.next();
        Product checkProduct = ProductLoader.searchProduct(prodID);
        if (checkProduct == null) {
            System.out.print("Enter Product Name : ");
            String pnm = scan.next();
            System.out.print("Enter Price : ");
            String pr = scan.next();
            System.out.print("Enter Quantity : ");
            String qt = scan.next();
            newtemp += prodID+","+pnm+","+pr+","+qt;
            TestProduct.addProductData(newtemp);
            try {
				ProductLoader.loadProduct();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("\nProduct Added : ");
            checkProduct = ProductLoader.searchProduct(prodID);
            TestProduct.getOutput(checkProduct);
        } else {
            TestProduct.getOutput(checkProduct);
        }
    }



   public static void addProductData(String inputData) throws IOException {
        FileWriter fw = new FileWriter("C:\\work\\Class Practice\\ExceptionDemo\\src\\ProductTable\\product.txt", true);
        fw.write(inputData);
        fw.close();
    }
    
    public static void getOutput(Product checkProduct) throws IOException {
        System.out.println("\nProduct ID : " + checkProduct.getProductID());
        System.out.println("Product Name : " + checkProduct.getProductName());
        System.out.println("Price : " + checkProduct.getPrice());
        System.out.println("Quantity : " + checkProduct.getQuantity());
        
BufferedReader bf = new BufferedReader(new FileReader(new File("C:\\work\\Class Practice\\ExceptionDemo\\src\\ProductTable\\product.txt")));
        
        String line;
        int i=0;
        while((line=bf.readLine())!=null)
        {
          i=i+1;
        }
        
        System.out.println("Size of Array List : " + i);
    }



}