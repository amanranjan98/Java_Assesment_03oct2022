package HashMap;

import java.util.*;
public class MemberType {
    
    int age;
    String name;
    int memberType;
    String memberTypes;
    static int countCrew,countAdult,countChild;
    int fee;
    
    Scanner scan = new Scanner(System.in);
    
    public MemberType() 
    {
        System.out.println("Enter Your Age");
        this.age=scan.nextInt();
        System.out.println("Enter Your Name");
        this.name=scan.next();
        
        if(age>20) {
        
            System.out.println("Type 1 for Crew Member or 2 for Adults");
        
            this.memberType=scan.nextInt();
        
    if(memberType==1) 
        {
            this.memberTypes="Crew";
            countCrew++;
            fee=0;
        }
        else if(memberType==2) 
        {
            this.memberTypes="Adult";
            countAdult++;
            fee=500;
        }
        }
        else 
        {
            this.memberTypes="Children";
            countChild++;
            fee=250;
        }
        }
     public static String countMembers() {
        
        return "Number of Crew Members: "+countCrew+"\nNumber of Adults: "+countAdult+"\nNumber of Children: "+countChild;
    }   
}