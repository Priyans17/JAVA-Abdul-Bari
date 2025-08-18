package MultipleClasses;

class Account {
    private String accNo;
    private String name;
    private String address;
    private String phnNo;
    private String dob;
    protected long balance;

    public Account(String acc, String n, String add, String phnNo, String dob) {
        accNo = acc;
        name = n;
        address = add;
        this.phnNo = phnNo;
        this.dob = dob;
        balance = 0;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhnNo() {
        return phnNo;
    }

    public String getDob() {
        return dob;
    }

    public long getBalance() {
        return balance;
    }

    public void setAddress(String add) {
        address = add;
    }

    public void setPhnNo(String phnNo) {
        this.phnNo = phnNo;
    }
}

// Savings Account
class SavingsAccount extends Account {
    public SavingsAccount(String acc, String n, String add, String phnNo, String dob) {
        super(acc, n, add, phnNo, dob);
    }

    public void deposit(long amt) {
        balance += amt; // add to balance
    }

    public void withdraw(long amt) {
        if (amt <= balance) {
            balance -= amt; // deduct from balance
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

// Loan Account
class LoanAccount extends Account {
    public LoanAccount(String acc, String n, String add, String phnNo, String dob, long loanAmount) {
        super(acc, n, add, phnNo, dob);
        balance = loanAmount; // loan balance = amount to be repaid
    }

    public void payEMI(long amt) {
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Extra amount! Loan is already cleared.");
        }
    }

    public void repay(long amt) {
        if (amt == balance) {
            balance = 0;
            System.out.println("Loan fully repaid!");
        } else {
            System.out.println("Repay amount must be equal to remaining loan balance!");
        }
    }
}

// Main Class
public class Banking {
    public static void main(String[] args) {
        // Savings Account demo
        SavingsAccount sa = new SavingsAccount("A101", "Priyansh", "Mumbai", "9876543210", "01-01-2000");
        sa.deposit(5000);
        sa.withdraw(2000);
        System.out.println("Savings Account Balance: " + sa.getBalance());

        // Loan Account demo
        LoanAccount la = new LoanAccount("L202", "Mehta", "Delhi", "9123456780", "05-05-1999", 10000);
        la.payEMI(3000);
        System.out.println("Loan Balance after EMI: " + la.getBalance());
        la.repay(7000);
        System.out.println("Final Loan Balance: " + la.getBalance());
    }
}
