
public class CoachDesignationFactory {
	
	public CoachDesignation getInstance(String s) {
		
		if(s.equals("head")){
			return new HeadCoachDesignation();
		}
		else if(s.equals("bat")){
			return new BattingCoachDesignation();
		}
		else if(s.equals("bowl")){
			return new BowlingCoachDesignation();
		}
		else{
			return new StaffCoachDesignation();
		}
		
	}

}
