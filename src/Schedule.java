import java.util.ArrayList;
import java.util.List;
public class Schedule {

	private String name;
	private int id;
	static int numUsers = 0;
	private List<List<Appointment>> schedule;  
	
	Schedule() {
		this.name = "";
		this.id = numUsers;
		numUsers++;
		schedule = new ArrayList<List<Appointment>>();  
	}
	
	Schedule(String name) {
		this.name = name;
		this.id = numUsers;
		numUsers++;
		schedule = new ArrayList<List<Appointment>>();  
	}
	
	public void getSchedule() {
		//run through the conversation to get a users class schedule
		//need to remember to ask if the class uses reserves
	}
	
	public void addAppointment(Appointment a) {
		//check that there are not schedule conflicts with other appointments
		//use a search algorithm to place add the appointment into the schedule in the proper order
	}
	
	public String toString() {
		return schedule + "";
	}
	
	
}
