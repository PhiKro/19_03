package Bank;

public class BankingDemo
	{

		public static void main(String[] args)
			{
				Bank Raika = new Bank(); 


				
				try
					{
						Raika.addAccount("A1", 1000, 5000);
						Raika.addAccount("A2", 0, 0);
						Raika.addAccount("A3", 100, 1000);
						Raika.addAccount("A4", 200, 0);
						Raika.addAccount("A5", 1000, 5000);
						Raika.addAccount("A6", 1000, 5000);
					}
				catch (BankException e)
					{
						e.printStackTrace();
					}
				
				
				try
					{
						Raika.transfer("A3", "A1", 20);
					}
				catch (AccountNotFoundException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				catch (BankException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		

	}
