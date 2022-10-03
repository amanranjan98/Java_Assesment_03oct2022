package HashMap;

import java.util.Scanner;

public class ToothPasteType {
    int age;
    String name;
    int toothPasteType;
    int memberType;  
    String memberTypes; 
    String toothPasteTypes;
    static int countMen,countWomen,countChild;
    static int countColgate,countPepsodent,countPatanjali,countDabar;

    
    Scanner scan = new Scanner(System.in);
    
    public ToothPasteType() 
    {
    	System.out.println("Type 1 for Children or 2 for Women or 3 for Men");
    	this.memberType = scan.nextInt();
    	if(memberType==1) 
        {
            this.memberTypes="Children";
            countChild++;
        }
    	
    	else if(memberType==2) 
        {
            this.memberTypes="Women";
            countWomen++;
        }
    	
    	else if(memberType==3) 
        {
            this.memberTypes="Men";
            countMen++;
        }
        
            System.out.println("Type 1 for colgate or 2 for Pepsodent or 3 for patanjali or 4 for dabar");
        
            this.toothPasteType=scan.nextInt();
        
    if(toothPasteType==1) 
        {
            this.toothPasteTypes="Colgate";
            countColgate++;
            
        }
    else if(toothPasteType==2) 
    {
        this.toothPasteTypes="Pepsodent";
        countPepsodent++;
    }
    
    else if(toothPasteType==3) 
    {
        this.toothPasteTypes="Patanjali";
        countPatanjali++;
    }
    
    else if(toothPasteType==4) 
    {
        this.toothPasteTypes="Dabar";
        countDabar++;
    }
        }
     public static String countToothPaste() {
        
        return "Number of dabar: "+countDabar+"\nNumber of Patanjali: "+countPatanjali+"\nNumber of Pepsodent: "+countPepsodent+"\nNumber of Colgate: "+countColgate;
    }   
     public static String maxCount()
     {
    	 if(countDabar != countPatanjali || countDabar != countPepsodent || countDabar != countColgate)
    	 {
    	 
    	 if(countDabar>countPatanjali && countDabar>countPepsodent && countDabar>countColgate)
     	{
     		return "Dabar";
     	}
     	else if(countPatanjali>countPepsodent && countPatanjali>countColgate)
     	{
     		return "Patanjali";
     	}
     	else if(countPepsodent>countColgate)
     	{
     		return "Pepsodent";
     	}
     	else
     	{
     		return "Colgate";
     	}
  
    	 }
		return "Maximum uses are equal";
     }
}