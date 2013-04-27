public class Dang extends Critter
{
	public static String critters = new String[25];
	public static int indices = new int[25];
	public char lastAttack;
	
	public Attack fight(String opponent)
	{
		boolean firstEncounter = true;
		int idx = 0;
	 	for(String s : critters)
	 	{
	 		
	 		//first encounter
	 		if(s.equals(opponent))
	 		{
	 		  firstEncounter = false;
	 		  break;
	 		}
	 		idx++;
	 		
	 	}
	 	
	 	//add to list if first encounter.
	 	if(firstEncounter)
	 	{
	 		for(String s: critters)
	 		{
	 			if (s == null)
	 			{
	 				s = opponent;
	 				break;
	 			}
	 		
	 		}
	 
	 	}
	 	/*
	 	I don't see a way of getting the necessary attack information.
	 	
	 	Random r = new Random();
	 	if(indices[idx] == 5)
	 	{
	 	
	 	
	 	
	 	}
	 	
	 	else
	 	{
	 	*/ 
	 	int randomDecision = r.nexInt(3);
	 	switch(randomDecision) 
	 	{
	 		case 1: lastAttack = 'r';
	 			return Attack.ROAR;
	 		case 2: lastAttack = 'p';
	 			return Attack.POUNCE;
	 		default:lastAttack = 's'; 
	 			return Attack.SCRATCH;
	 	}
	 	
	 	
	 	//}
	 
	 	
	 
	
	
	}
	
	private int hungry = 0;
	public boolean eat() 
	{
		//eeeeeeeeeeeeeeeet eet eet
		if (hungry <= 4)
		{
			hungry++;
			return false;
			
		}
		else
		{
			hungry = 0;
			return true;
			
		}
		
	}
	public Color getColor() 
	{
		return Color.BLUE;
	}
	public String toString() 
	{
		return "DY";
	}
	
	public static char attack = new char[25];
	public void lose() {
		/*
		idx = 0;
		
		String n = this.getNeighbor(NORTH);
		String s = this.getNeighbor(SOUTH);
		String e = this.getNeighbor(EAST);
		String w = this.getNeighbor(WEST);
		
		if ((n != null) || (s != null) || (e != null) || (w != null))
		{
			for(String i : critters)
			{
				
				if (i.equals(n))
				{
				    attack[idx] =	
					
				}
					
				idx++;	
				
			}
			
		}
		
		*/
	}

}
