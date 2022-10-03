package ProductTable;
import java.io.*;
import java.util.*;

class ProductLoader{
    private static List<Product> lt = new ArrayList<>();
    
    public static void loadProduct() throws Exception {
        
        BufferedReader bf = new BufferedReader(new FileReader(new File("C:\\work\\Class Practice\\ExceptionDemo\\src\\ProductTable\\product.txt")));
        
        String line;
        while((line=bf.readLine())!=null)
        {
            String arr[] = line.split(",");
            Product pp = new Product(arr[0],arr[1],Double.parseDouble(arr[2]),Integer.parseInt(arr[3]));
           lt.add(pp);
        }
    }
    public static List<Product> getProductList(){
        return lt;
    }
    
    public static Product searchProduct(String productID)
    {
        List <Product> temp_lt = getProductList();
        for(Product p : temp_lt)
        {
            if(p.productID.equals(productID) )
            {
                return p;
            }
        }
        return null; 
    }
}