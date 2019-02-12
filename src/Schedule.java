
public class Schedule {

	private String name;
	private int id;
	static int numUsers = 0;
	
	Schedule() {
		this.name = "";
		this.id = numUsers;
		numUsers++;
	}
	
	Schedule(String name) {
		this.name = name;
		this.id = numUsers;
		numUsers++;
	}
	
	public void getSchedule() {
		
	}
	
	
}
