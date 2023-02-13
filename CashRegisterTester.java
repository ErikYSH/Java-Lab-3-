public class CashRegisterTester 
{
  public static void main(String[] args)
  {
    CashRegister checkout = new CashRegister();

    checkout.recordPurcahse(29.50);
    checkout.recordPurcahse(9.25);
    checkout.receivePayment(50);

    double change = checkout.giveChange();

    System.out.println(change);
    System.out.println("Exptect: 11.25");
  }
}