package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashToothPaste {
	
    public static void main(String[] args) 
    {
    ToothPasteType ob;    	
    	Scanner sc = new Scanner(System.in);
        
        Map<Integer,ToothPasteType> mapValue = new HashMap<Integer,ToothPasteType>();
        
        System.out.println("Enter the Number of Customer");
        
        
        int num = sc.nextInt();
        
        for(int i=1; i<=num; i++) 
        {
            mapValue.put(i, new ToothPasteType());
        }
        
        //System.out.println("The Values are: "+mapValue.toString());
        
        for(Map.Entry<Integer, ToothPasteType> entry:mapValue.entrySet()){    
            int key=entry.getKey();  
            ToothPasteType b=entry.getValue();  
            System.out.println(key+" Data:");  
            System.out.println("ToothPaste: " + b.toothPasteTypes + "\nMember Type: " + b.memberTypes);    
            } 
        
       System.out.println(ToothPasteType.countToothPaste());
       System.out.println("The Maximum use of Brand is : "+ToothPasteType.maxCount());
        
    }
}