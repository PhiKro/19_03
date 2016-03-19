package Exceptions;

public class Transporter
	{
		public void beam(String person, String from, String to, boolean urgent) throws TransporterMalfunctionException
			{
				if (urgent == true && Math.random() < 0.70) // zu 70% bist du
															// tot...
					{
						throw new TransporterMalfunctionException("\n" + "Well Shit! \n" + "Get the cleanup crew");
					}

				System.out.println("Beamed " + person + " Successfull from " + from + " to " + to);
			}

		public void shutdown()
			{
				System.out.println("Transporter shutdown! \n" + "Your crew might be dead! \n" + "Have a nice Day! ");
			}
	}
