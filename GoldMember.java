package org.membership;
public class GoldMember extends ClubMember {
    int enroll,member,moth;
    
    public GoldMember(int enrollmentFees, int memberFees,int months) {
        super(enrollmentFees, memberFees, memberFees);
        this.enroll=enrollmentFees;
        this.member=memberFees;
        this.moth=months;
        calculateBill(moth);
        // TODO Auto-generated constructor stub
    }




    double calculateBill(int noofMonths)
    {
        if(noofMonths<=6)
        {
            System.out.println("Free Golf Service for six months");
            System.out.println("the bill is "+(enroll+member));
            return (enroll+member);
        }else {
            double sum=enroll+member+(noofMonths*20000);
            System.out.println("enroll fees = "+enroll);
            System.out.println("member fees = "+member);
            super.display(moth,3,enroll,member);
            return sum;
        }
    }
}