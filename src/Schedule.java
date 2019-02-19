import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Date;

public class Schedule {
	
// IMPORTANT NOTE:
//	Monday is day 0 and Sunday is day 6 for week one
//	Monday is day 7 and Sunday is day 13 for week two
//	A format is 0 and H format is 7
//	Type 0 means academic
//	
//	
//	

	private String name;
	private int id;
	static int numUsers = 0;
	private ArrayList<Appointment>[] schedule;
	private Scanner scan = new Scanner (System.in);
	private String[] formatHolderName;     /////THIS WILL HOLD A - H FORMATS to be loaded into the schedule.
	private boolean[] formatHolderReserve;         //// This says whether or not they use reserve
	
	Schedule() {
		this.name = "";
		this.id = numUsers;
		numUsers++;
		schedule = (ArrayList<Appointment>[])new ArrayList[14];  
		formatHolderName = new String[8];
		formatHolderReserve = new boolean[8];
	}
	
	Schedule(String name) {
		this.name = name;
		this.id = numUsers;
		numUsers++;
		schedule = (ArrayList<Appointment>[])new ArrayList[14];     
		formatHolderName = new String[8];
		formatHolderReserve = new boolean[8];
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
					formatHolderReserve[i] = true;
					okayAns = true;
				} else if(tempAnswer.toLowerCase().equals("no")) {
					formatHolderReserve[i] = false;
					okayAns = true;
				}
			}
		}
		
		//MONDAY week one:
		schedule[0].set(0,Appointment(Date theStart, Date theEnd, formatHolderName[0], 0, formatHolderReserve[0])); //8 am class
		schedule[1].set(0,Appointment(Date theStart, Date theEnd, formatHolderName[1], 0, formatHolderReserve[1]));
		schedule[2].set(0,Appointment(Date theStart, Date theEnd, formatHolderName[2], 0, formatHolderReserve[2]));
		schedule[3].set(0,Appointment(Date theStart, Date theEnd, formatHolderName[3], 0, formatHolderReserve[3]));
		schedule[4].set(0,Appointment(Date theStart, Date theEnd, formatHolderName[4], 0, formatHolderReserve[4]));
		schedule[5].set(0,Appointment(Date theStart, Date theEnd, formatHolderName[5], 0, formatHolderReserve[5]));
		schedule[6].set(0,Appointment(Date theStart, Date theEnd, formatHolderName[6], 0, formatHolderReserve[6]));
		schedule[7].set(0,Appointment(Date theStart, Date theEnd, formatHolderName[7], 0, formatHolderReserve[7]));
	}
	
	public void addAppointment(Appointment a) {
		//check that there are not schedule conflicts with other appointments
		//use a search algorithm to place add the appointment into the schedule in the proper order
	}
	
	public boolean checkAppointments() {
		Date now = new Date();
		int 
		for(int i = 0; i < schedule[now.getDay()-1].size(); i++) {
			schedule[now.getDay()-1].get(i).getStartTime();
		}
	}
	
	public void sendReminder(Appointment a) { //Should this return a string or an int or an appointment or just send the email?
		//Also, if classes have THE SAME EXACT NAME, don't send two reminders
		
	}
	
	public String toString() {
		return schedule + "";
	}
	
	
}
