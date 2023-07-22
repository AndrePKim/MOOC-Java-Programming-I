
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matt = new Account("Matthews account", 1000.00);
        Account noth = new Account("My account", 0.00);
        
        matt.withdrawal(100);
        noth.deposit(100);
        
        System.out.println(matt);
        System.out.println(noth);
    }
}
