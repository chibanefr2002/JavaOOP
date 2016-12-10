package StringExample;

public abstract class Bank
{
private int accountno;
private String name;
private float loan;
private float balance;
void display_to_clerk (){
System.out.println ("Accout number = " + accountno);
System.out.println ("Name = " + name);
}
void display_to_manager (){
System.out.println ("Account number = " + accountno);
System.out.println ("Name = " + name);
System.out.println ("Loan = " + loan);
System.out.println ("Balance = " +balance);
}
}
