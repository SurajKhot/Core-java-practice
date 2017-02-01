// save outside both the package
import Acc.account;
import Trans.transaction;
class Savings extends account implements transaction
{
	int amt;
	account a1=new account();
	public void Deposit(int m)
	{
		a1.disp(); 
		amt=m;
	}
	void display()
	{
		bal=bal+amt;
		System.out.println("account no:"+Acc_no);
		System.out.println("Balance:"+bal);
	}
}
class sack
{
	public static void main(String args[])throws Exception
	{
		Savings s1=new Savings(); 
		s1.Deposit(3000);
		s1.display();
	}
}
