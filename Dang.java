public class Dang extends Critter
{
	public static String critters[20];
	public static int indices[20];	
	
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
	 		case 1: return Attack.ROAR;
	 		case 2: return Attack.POUNCE;
	 		default: return Attack.SCRATCH;
	 	}
	 	
	 	
	 	//}
	 
	 	
	 
	
	
	}





}
