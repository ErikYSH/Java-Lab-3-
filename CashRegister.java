  /** 
    A cash register totals up sales and computers change due
  */
public class CashRegister 
{
  private double purchase; 
  private double payment;
  
  /**
Constructs a cash register with no money in it
*/
  public CashRegister ()
  {  }

/**
Records the sales of an item 
@param amount the price of the item
*/
  public void recordPurcahse(double amount)
  {
    purchase = purchase + amount;
  }

  /**
Processes a payment received from the customer 
@params amount the amount of the payment 
*/
  public void receivePayment(double amount) 
  {
    payment = payment + amount;
  }

  /**
Computes the change due and resets the machine for the next customer 
@return the change due to customer
*/
  public double giveChange() 
  {
    double change = payment - purchase; 
    purchase = 0;
    payment = 0;
    return change;
  }

  
}