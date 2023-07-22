
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        int totaleuros = this.euros + addition.euros;
        int totalcents = this.cents + addition.cents;
        
        Money newMoney = new Money(totaleuros, totalcents);
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros>compared.euros) {
            return false;
        } else if (this.euros==compared.euros) {
            if (this.cents>=compared.cents) {
                return false;
            }
        }
        return true;
    }
    
    public Money minus(Money decreaser) {
        int totaleuros = this.euros - decreaser.euros;
        if (totaleuros<0) {
            Money newMoney = new Money(0, 0);
            return newMoney;
        }
        int totalcents = this.cents - decreaser.cents;
        if (totalcents<0) {
            totaleuros -= 1;
            totalcents = 100 - decreaser.cents;
            if (totaleuros<0) {
                Money newMoney = new Money(0, 0);
                return newMoney;
            }
        }
        Money newMoney = new Money(totaleuros, totalcents);
        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
