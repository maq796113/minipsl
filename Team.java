import java.util.ArrayList;

public class Team {
	private String team_name;
	private String team_owner;
	private String team_city;
	private ArrayList<Player> player_list = new ArrayList<Player>();//Player
	private ArrayList<Coach> coach_list = new ArrayList<Coach>();
	
	//Coaches
	
	
	public Team(String team_name, String team_owner, String team_city) {
		super();
		this.team_name = team_name;
		this.team_owner = team_owner;
		this.team_city = team_city;
	}
	
	//add player
	public void addPlayer(Player p) {
		
		this.player_list.add(p);
		
	}
	//add coach
	public void addCoach(String name,int age,String designation, int exp) {
       
		Coach  coach = new Coach(name,age,designation,exp);
		
		this.coach_list.add(coach);
		
		
	}
	
	public void displayTeamProperties() {
		
		System.out.println(this.team_name+ " "+ this.team_city + " "+ this.team_owner);
		
		//display player
		for (int i= 0 ; i< this.player_list.size();i++) {
			
			this.player_list.get(i).displayPlayerProperties();
		}
		//display coaches
		for (int i= 0 ; i< this.coach_list.size();i++) {
			
			this.coach_list.get(i).displayCoachProperties();
		}


		
	}
	
	
	
	
	

}
