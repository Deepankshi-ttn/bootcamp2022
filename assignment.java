class Bank {
    String city;
    Float roi;
    Bank(String city, float roi) {
        this.city = city;
        this.roi = roi;
    }
    public void getDetails() {
        System.out.println("City " + city);
        System.out.println("Rate of interest " + roi);
    }
}
class SBI extends Bank {
    String branchId;
    public SBI(String city, float roi, String branchId) {
        super(city, roi);
        this.branchId = branchId;
    }
    public void getDetails() {
        super.getDetails();
        System.out.println("BranchId " + branchId);
    }
}

class BOI extends Bank {
    String branchId;
    public BOI(String city, float roi, String branchId) {
        super(city, roi);
        this.branchId = branchId;
    }
    public void getDetails() {
        super.getDetails();
        System.out.println("BranchId " + branchId);
    }
}
class ICICI extends Bank {
    String branchId;
    public ICICI(String city, float roi, String branchId) {
        super(city, roi);
        this.branchId = branchId;
    }
    public void getDetails() {
        super.getDetails();
        System.out.println("BranchId " + branchId);
    }
}
public class assignment {
    public static void main(String[] args) {
        Bank bank = new Bank("Delhi", 2.1f);
        SBI sbiBranch = new SBI("Noida",2.2f,"342");
        BOI boiBranch = new BOI("Delhi",1.5f,"142");
        ICICI iciciBranch = new ICICI("G",1.6f,"543");
        bank.getDetails();
        sbiBranch.getDetails();
        boiBranch.getDetails();
        iciciBranch.getDetails();
    }
}