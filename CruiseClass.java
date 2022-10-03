package HashMap;

import java.util.*;
public class CruiseClass  {
	
    public static void main(String[] args) 
    {
    MemberType ob;    	
    	Scanner sc = new Scanner(System.in);
        
        Map<Integer,MemberType> mapValue = new HashMap<Integer,MemberType>();
        
        System.out.println("Enter the Number of Travelers You want On the Cruise");
        
        
        int num = sc.nextInt();
        
        for(int i=1; i<=num; i++) 
        {
            mapValue.put(i, new MemberType());
        }
        
        //System.out.println("The Values are: "+mapValue.toString());
        
        for(Map.Entry<Integer, MemberType> entry:mapValue.entrySet()){    
            int key=entry.getKey();  
            MemberType b=entry.getValue();  
            System.out.println(key+" Data:");  
            System.out.println("Name: " + b.name + "\nAge: " + b.age + "\nMember Type: " + b.memberTypes+"\nFees: "+b.fee);    
            } 
        
       System.out.println(MemberType.countMembers());
        
    }
}