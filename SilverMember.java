package org.membership;
public class SilverMember extends ClubMember{
    int enroll,member,noofMonth;
    
    public SilverMember(int enrollmentFees, int memberFees,int noofmonths) {
        super(enrollmentFees, memberFees, noofmonths);
        this.enroll=enrollmentFees;
        this.member=memberFees;
        this.noofMonth=noofmonths;
        calculateBill(noofMonth);
        
        // TODO Auto-generated constructor stub
    }



double calculateBill(int noofMonths)
{
    if(noofMonths<=6)
    {
        System.out.println("Free Golf Service for six months");
        System.out.println("the bill is "+(enroll+member));
        return 0;
    }else {
        double sum=enroll+member+(noofMonths*20000);
        System.out.println("enroll fees = "+enroll);
        System.out.println("member fees = "+member);
        super.display(noofMonths,2,enroll,member);
        return sum;
    }
}





}