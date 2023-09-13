package studio2;

public class Ruin {

	public static void main(String[] args) {
		int startAmount = 10;
		double winChance = 0.51;
		int winLimit = 20;
		int totalSimulations = 1000;
		int tries =1;
		int plays=0;
		String stat="0";
		int Lose = 0;
		while (tries<=totalSimulations)
		{
			int money=startAmount;
			plays=0;
			while (money<=winLimit && money>0)
			{
				double roll=Math.random();
				if (roll>=winChance)
				{
					money++;	
				}
				else
				{
					money=money-1;
				}
				plays++;
			}
			if (money>=20)
			{
				stat = "WIN";
			}
			else
			{
				stat = "LOSE";
				Lose++;
			}
			System.out.println("Simulation "+tries+": "+plays+" "+stat);
			tries++;
		}
		System.out.println("Losses: "+Lose+" Simulations: "+totalSimulations);
		System.out.println("Ruin Rate from Simulation: "+(Math.round((double)Lose/totalSimulations*100)/100.00)+" Expected Ruin Rate: " +(double)Lose/totalSimulations);
	}
}
