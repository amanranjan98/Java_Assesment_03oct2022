package org.membership;
import java.util.*;
public class ClubMember {
int enrollmentFees;
int memberFees;
int noofmonths;
public ClubMember(int enrollmentFees, int memberFees, int noofmonths) {
    super();
    this.enrollmentFees = enrollmentFees;
    this.memberFees = memberFees;
    this.noofmonths = noofmonths;
}
void display(int noofMonths,int ch,int enroll,int member) {
    
    if(ch==1)
    {
        double sum=enroll+member+((noofMonths)*20000);
        System.out.println("Golf Service per month is : "+20000);
        System.out.println("The Total fees is "+sum);
    }else if(ch==2)
    {
        double sum=enroll+member+((noofMonths-6)*20000);
        System.out.println("Golf Service per month after six months is : "+20000);
        System.out.println("The Total fees is "+sum);
    }else {
        double sum=enroll+member+((noofMonths-6)*10000);
        System.out.println("Golf Service per month after six months is : "+20000);
        System.out.println("The Total fees is "+sum);
    }
}



public static void main(String[] args) {
    Scanner ob=new Scanner(System.in);
    System.out.println("Enter the membership type: \n 1.Regular \n 2.Gold \n 3.Silver");
    int choice=ob.nextInt();
    System.out.println("Enter how many months you want to enroll?");
    int month=ob.nextInt();
    switch(choice)
    {
    case 1:
    {

        RegularMember sc=new RegularMember(0,0,month);
        
//        sc.display(sc.calculateBill(month));
        break;
        
    }
    case 2:
    {

        GoldMember sc=new GoldMember(10000,90000,month);
//        
//        sc.display(sc.calculateBill(month));
        break;
    }
    case 3:
    {

        SilverMember sc=new SilverMember(5000,15000,month);
        
//        sc.display(sc.calculateBill(month));
        break;
    }
    default:
        System.out.println("Entered wrong choice");
    }
}




}