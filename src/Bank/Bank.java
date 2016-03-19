package Bank;

import java.util.HashMap;

public class Bank
	{
		private HashMap<String, Account> accounts = new HashMap<>();

		public void addAccount(String owner, double balance, double overdraftFrame) throws BankException
		{
			if (accounts.containsKey(owner))
				{
					throw new BankException("Konto existiert bereits");
				}
			else 
				{
					Account Konto = new Account(owner, balance, overdraftFrame);
 					accounts.put(owner, Konto);
				}
		}
		
		public void transfer(String fromOwner, String toOwner, double amount) throws AccountNotFoundException, BankException 
		{
			if (accounts.containsKey(toOwner) && accounts.containsKey(fromOwner))
			{
			 Account deb = accounts.get(fromOwner);
			 Account cre = accounts.get(toOwner);
			 
			 try
				{
					deb.debit(amount);
					cre.credit(amount);
				}
			catch (NotEnoughMoneyException e)
				{
					throw new BankException("Zu Wenig Geld");
				}
			 
			 System.out.println(amount + " € von "+ fromOwner +  " an "+ toOwner + " Überwiesen");
			}
			else 
				throw new AccountNotFoundException("Überweisung nicht durchgeführt." +"\n" + "Ein Konto wurde nicht gefunden. ");
		}

		@Override
		public String toString()
			{
				return "Bank [accounts=" + accounts + "]";
			}
		
	}
