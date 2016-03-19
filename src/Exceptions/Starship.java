package Exceptions;

public class Starship
	{
		private String Name;
		private Transporter transporter = new Transporter();;

		public Starship(String name)
			{
				Name = name;
			}

		public void beamUp(String person, String from)
			{
				try
					{
						transporter.beam(person, from, Name, true);
					}
				catch (TransporterMalfunctionException e)
					{
						e.printStackTrace();
					}
				finally
					{
						transporter.shutdown();
					}
			}

	}
