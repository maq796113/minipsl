
public class Player {
	
	private String name; 
	private int age; 
	private String type;
	private int runs;
	private int wickets; 
	
	public Player(String name, int age, String type, int runs, int wickets) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
		this.runs = runs;
		this.wickets = wickets;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	public void displayPlayerProperties(){
		
		System.out.println(this.name + " "+ this.age + " "+ this.type + 
				           " "+ this.runs+ " " + this.wickets);
	}
	
	
	
	
	

}
