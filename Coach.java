
public class Coach {
	
	private String coach_name;
	private int coach_age;
	CoachDesignation designation;
	private int exp;
	public Coach(String coach_name, int coach_age, String designation, int exp) {
		super();
		this.coach_name = coach_name;
		this.coach_age = coach_age;
		
		CoachDesignationFactory cd = new CoachDesignationFactory();
	  
		this.designation = cd.getInstance(designation);
		this.exp = exp;
	}
	
public void displayCoachProperties(){
		
		System.out.println(this.coach_name + " "+ this.coach_age + " "+ this.designation + 
				           " "+ this.exp);
	}
	
	
	
	

}

/*
Design Patterns 

1 Creational
   Factory Pattern

2  Structural
   Adapter Pattern
   
3 Behavioural



*/













