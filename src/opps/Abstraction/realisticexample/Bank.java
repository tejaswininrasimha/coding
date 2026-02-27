package opps.Abstraction.realisticexample;

abstract class Bank {
    String branch;
    Bank(String branch){
        this.branch=branch;
        System.out.println("Branch is :"+branch);
    }
    abstract void calculateInterest();
}
class HDFC extends Bank{
    HDFC(String branch){
        super(branch);

    }
    void calculateInterest(){
        System.out.println("Intrest is 10%");
    }
}
class Driver{
    public static void main(String[] rags){
        HDFC obj = new HDFC("rr nagar");
        obj.calculateInterest();
    }
}