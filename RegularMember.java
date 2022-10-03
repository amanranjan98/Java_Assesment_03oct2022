package org.membership;
public class RegularMember extends ClubMember{
    int enroll,member,moth;
    public RegularMember(int enrollmentFees, int memberFees, int month) {
        super(enrollmentFees, memberFees,memberFees);
        this.enroll=enrollmentFees;
        this.member=memberFees;
        this.moth=month;
        calculateBill(moth);
        // TODO Auto-generated constructor stub
    }
    double calculateBill(int noofMonths)
    {
       
            double sum=enroll+member+(noofMonths*10000);
            System.out.println("enroll fees = "+enroll);
            System.out.println("member fees = "+member);
            super.display(moth,1,enroll,member);
            return sum;
        
    }
    void display(double fees) {
        System.out.println("the total fees is "+fees);
        
    }
}

