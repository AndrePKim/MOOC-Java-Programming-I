
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account artos = new Account("Arto's account", 100.00);
        
        System.out.println("Initial state");
        System.out.println(artos);
        
        artos.deposit(20);
        System.out.println("The balance of Arto's account is now: " + artos);
        
        System.out.println("End state");
        System.out.println(artos);
    }
}
