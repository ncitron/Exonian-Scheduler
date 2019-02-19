import java.util.ArrayList;
import java.util.Scanner;

public class Schedule {
	
// IMPORTANT NOTE:
//	Monday is day 0 and Sunday is day 6
//	A format is 0 and H format is 7
//	
//	
//	
//	
//	

	private String name;
	private int id;
	static int numUsers = 0;
	private ArrayList<Appointment>[] schedule;
	private Scanner scan = new Scanner (System.in);
	private String[] formatHolderName;     /////THIS WILL HOLD A - H FORMATS to be loaded into the schedule.
	private int[] formatHolderNum;         //// This says whether or not they use reserve
	
	Schedule() {
		this.name = "";
		this.id = numUsers;
		numUsers++;
		schedule = (ArrayList<Appointment>[])new ArrayList[14];  
		formatHolderName = new String[8];
		formatHolderNum = new int[8];
	}
	
	Schedule(String name) {
		this.name = name;
		this.id = numUsers;
		numUsers++;
		schedule = (ArrayList<Appointment>[])new ArrayList[14];     
		formatHolderName = new String[8];
		formatHolderNum = new int[8];
	}
	
	public void getSchedule() {
		
		System.out.println("We will now ask you a few questions to set up your schedule");
		System.out.println("What username would you like to use?");
		name = scan.nextLine();
		
		for(int i = 0; i < 8; i++) {
			System.out.println("What is your " + (char)(65 + i) + " format class?");
			formatHolderName[i] = scan.nextLine();
			boolean okayAns = false;
			while(!okayAns) {
				System.out.println("Does this class use reserve? Please type \"yes\" or \"no\".");
				String tempAnswer = scan.nextLine();
				if(tempAnswer.toLowerCase().equals("yes")) {
					formatHolderNum[i] = 1;
					okayAns = true;
				} else if(tempAnswer.toLowerCase().equals("no")) {
					formatHolderNum[i] = 0;
					okayAns = true;
				}
			}
		}	
	}
	
	public void addAppointment(Appointment a) {
		//check that there are not schedule conflicts with other appointments
		//use a search algorithm to place add the appointment into the schedule in the proper order
	}
	
	public void sendReminder(Appointment a) { //Should this return a string or an int or an appointment or just send the email?
		//Also, if classes have THE SAME EXACT NAME, don't send two reminders
		
	}
	
	public String toString() {
		return schedule + "";
	}
	
	
}
