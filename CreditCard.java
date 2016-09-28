//San Jose State University Intro to Java Assignment: Credit Card

// Create a class CreditCard that represents a credit card account.
// You need to construct a new credit card with a 0.0 balance. 

// The constructor will have this header:
// public CreditCard()
//
// CreditCard will have these methods:
// public void purchase(double amount)
// public void payment(double amount)
// public double getBalance()

/**
   A credit card has a balance that can be changed by
   purchases and payments.
*/
public class CreditCard
{

    /**
      Constructs a credit card with a zero balance.
    */
    private double balance = 0;
    
    public CreditCard()
    {
        balance = 0.0;
    }
    
    /**
      Makes a payment to  credit card.
      @param amount the amount to pay
    */
    public void payment(double amount)
    {
        balance = balance - amount;
    }

    /**
      Makes a purchase with the credit card
      @param amount the amount of the purchase
    */
    public void purchase(double amount)
    {
        balance = balance + amount;
    }

    /**
      Gets the current balance of the credit card.
      @return the current balance
    */
    public double getBalance()
    {
        return balance;
    }
}
