
public class Driver {

	public static void main(String[] args) {
        
		Player zaman = new Player("Zaman Khan", 28, "Batsman",0,0);
		
		Player haris = new Player("Harris Rauf", 32, "Batsman",0,0);
		
		Player shaheena = new Player("Shaheen Shah", 24, "Batsman",0,0);
		
		
		Team qalanders = new Team("Lahore Qalanders", "Rana Sahib", "Lahore");
		
		qalanders.addPlayer(zaman);
		qalanders.addPlayer(haris);
		qalanders.addPlayer(shaheena);
	
		
		qalanders.addCoach("Aqib", 50, "head", 20);
		
		qalanders.displayTeamProperties();
		
		
 
	}

}

/*  Teams {name,own,city, player[], coachs[], support staff}
 * Player{name,age,type,runs,wickets}
 *
 * Coach{name, age, designation, exp}
 * 
 * 
 *
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
