import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Date;
import java.util.Arrays;

public class Schedule {
	
// IMPORTANT NOTE:
//	Monday is day 0 and Sunday is day 6 for week one
//	Monday is day 7 and Sunday is day 13 for week two
//	A format is 0 and H format is 7
//	Type 0 means academic
//	WE ALSO NEED TO CHECK IF YOU TYPE "FREE"
//	
//	

	private String name;
	private int id;
	static int numUsers = 0;
	private ArrayList<Appointment>[] schedule;
	private Scanner scan = new Scanner (System.in);
	private String[] formatHolderName;     /////THIS WILL HOLD A - H FORMATS to be loaded into the schedule.
	private boolean[] formatHolderReserve;         //// This says whether or not they use reserve
	private String email; 
	
	Schedule() {
		this.name = "";
		this.id = numUsers;
		numUsers++;
		schedule = new ArrayList[14];  
		Arrays.setAll(schedule,  ArrayList :: new);
		formatHolderName = new String[8];
		formatHolderReserve = new boolean[8];
	}
	
	Schedule(String name) {
		this.name = name;
		this.id = numUsers;
		numUsers++;
		schedule = new ArrayList[14];     
		Arrays.setAll(schedule,  ArrayList :: new);
		formatHolderName = new String[8];
		formatHolderReserve = new boolean[8];
	}
	
	public void getSchedule() {
		
		System.out.println("We will now ask you a few questions to set up your schedule");
		System.out.println("What is your email?");
		email = scan.nextLine();
																//Also ask what week (one or two) it currently is
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
//WEEK ONE:
		//MONDAY week one:
		
		schedule[0].add(new Appointment(new simpleDate(0, 8, 0), new simpleDate(0, 8, 50), formatHolderName[0], 0, formatHolderReserve[0])); //A format 8 am class
		schedule[0].add(new Appointment(new simpleDate(0, 8, 55), new simpleDate(0, 9, 45), formatHolderName[1], 0, formatHolderReserve[1]));
		schedule[0].add(new Appointment(new simpleDate(0, 10, 45), new simpleDate(0, 11, 35), formatHolderName[2], 0, formatHolderReserve[2]));
		schedule[0].add(new Appointment(new simpleDate(0, 11, 40), new simpleDate(0, 12, 50), formatHolderName[3], 0, formatHolderReserve[3])); // D Long
		schedule[0].add(new Appointment(new simpleDate(0, 13, 40), new simpleDate(0, 14, 50), formatHolderName[4], 0, formatHolderReserve[4])); // E Long
	    schedule[0].add(new Appointment(new simpleDate(0, 4, 55), new simpleDate(0, 15, 45), formatHolderName[5], 0, formatHolderReserve[5]));
		schedule[0].add(new Appointment(new simpleDate(0, 16, 15), new simpleDate(0, 17, 5), formatHolderName[6], 0, formatHolderReserve[6]));
		schedule[0].add(new Appointment(new simpleDate(0, 17, 10), new simpleDate(0, 18, 0), formatHolderName[7], 0, formatHolderReserve[7])); 
		
		//Tuesday week one:
		schedule[1].add(new Appointment(new simpleDate(1, 8, 0), new simpleDate(1, 8, 50), formatHolderName[1], 0, formatHolderReserve[1])); //B format 8 am class
		schedule[1].add(new Appointment(new simpleDate(1, 8, 55), new simpleDate(1, 9, 45), formatHolderName[0], 0, formatHolderReserve[0]));
		schedule[1].add(new Appointment(new simpleDate(1, 10, 45), new simpleDate(1, 11, 35), formatHolderName[3], 0, formatHolderReserve[3]));
		schedule[1].add(new Appointment(new simpleDate(1, 11, 40), new simpleDate(1, 12, 50), formatHolderName[2], 0, formatHolderReserve[2])); // C Long
		schedule[1].add(new Appointment(new simpleDate(1, 13, 40), new simpleDate(1, 14, 30), formatHolderName[4], 0, formatHolderReserve[4]));
		/*I edited this one for testing */	schedule[1].add(new Appointment(new simpleDate(1, 15, 41), new simpleDate(1, 15, 45), formatHolderName[5], 0, formatHolderReserve[5])); // F Long
		schedule[1].add(new Appointment(new simpleDate(1, 16, 15), new simpleDate(1, 17, 5), formatHolderName[6], 0, formatHolderReserve[6]));
		schedule[1].add(new Appointment(new simpleDate(1, 17, 10), new simpleDate(1, 18, 0), formatHolderName[7], 0, formatHolderReserve[7]));
		
		//Wednesday week one:
		schedule[2].add(new Appointment(new simpleDate(2, 8, 0), new simpleDate(2, 8, 50), formatHolderName[2], 0, formatHolderReserve[2]));//C format 8 am class
		schedule[2].add(new Appointment(new simpleDate(2, 8, 55), new simpleDate(2, 9, 45), formatHolderName[1], 0, formatHolderReserve[1]));//B
		schedule[2].add(new Appointment(new simpleDate(2, 11, 05), new simpleDate(2, 11, 55), formatHolderName[4], 0, formatHolderReserve[4]));//E
		schedule[2].add(new Appointment(new simpleDate(2, 12, 0), new simpleDate(2, 12, 50), formatHolderName[6], 0, formatHolderReserve[6]));//G
		
		//Thursday week one:
		schedule[3].add(new Appointment(new simpleDate(3, 8, 0), new simpleDate(3, 8, 50), formatHolderName[2], 0, formatHolderReserve[2])); //C format 8 am class
		schedule[3].add(new Appointment(new simpleDate(3, 8, 55), new simpleDate(3, 9, 45), formatHolderName[3], 0, formatHolderReserve[3]));
		schedule[3].add(new Appointment(new simpleDate(3, 10, 45), new simpleDate(3, 11, 35), formatHolderName[0], 0, formatHolderReserve[0])); 
		schedule[3].add(new Appointment(new simpleDate(3, 11, 40), new simpleDate(3, 12, 50), formatHolderName[1], 0, formatHolderReserve[1])); // B Long
		schedule[3].add(new Appointment(new simpleDate(3, 13, 40), new simpleDate(3, 14, 30), formatHolderName[4], 0, formatHolderReserve[4]));
		schedule[3].add(new Appointment(new simpleDate(3, 14, 35), new simpleDate(3, 15, 25), formatHolderName[5], 0, formatHolderReserve[5]));
		schedule[3].add(new Appointment(new simpleDate(3, 15, 55), new simpleDate(3, 16, 45), formatHolderName[6], 0, formatHolderReserve[6])); 
		schedule[3].add(new Appointment(new simpleDate(3, 16, 50), new simpleDate(3, 18, 0), formatHolderName[7], 0, formatHolderReserve[7])); // H Long
		
		//Friday week one:
		schedule[4].add(new Appointment(new simpleDate(4, 8, 0), new simpleDate(4, 8, 50), formatHolderName[3], 0, formatHolderReserve[3]));//D format 8 am class
		schedule[4].add(new Appointment(new simpleDate(4, 8, 55), new simpleDate(4, 9, 45), formatHolderName[2], 0, formatHolderReserve[2])); 
		schedule[4].add(new Appointment(new simpleDate(4, 10, 45), new simpleDate(4, 11, 35), formatHolderName[1], 0, formatHolderReserve[1])); 
		schedule[4].add(new Appointment(new simpleDate(4, 11, 40), new simpleDate(4, 12, 50), formatHolderName[0], 0, formatHolderReserve[0])); // A Long
		schedule[4].add(new Appointment(new simpleDate(4, 13, 40), new simpleDate(4, 14, 30), formatHolderName[4], 0, formatHolderReserve[4]));
		schedule[4].add(new Appointment(new simpleDate(4, 14, 35), new simpleDate(4, 15, 25), formatHolderName[5], 0, formatHolderReserve[5]));
		schedule[4].add(new Appointment(new simpleDate(4, 15, 55), new simpleDate(4, 17, 5), formatHolderName[6], 0, formatHolderReserve[6])); // G Long
		schedule[4].add(new Appointment(new simpleDate(4, 17, 10), new simpleDate(4, 18, 0), formatHolderName[7], 0, formatHolderReserve[7])); 
		
//WEEK TWO:	
		//Monday week two:
		schedule[7].add(new Appointment(new simpleDate(0, 8, 0), new simpleDate(0, 8, 50), formatHolderName[1], 0, formatHolderReserve[1])); //B format 8 am class
		schedule[7].add(new Appointment(new simpleDate(0, 8, 55), new simpleDate(0, 9, 45), formatHolderName[0], 0, formatHolderReserve[0]));
		schedule[7].add(new Appointment(new simpleDate(0, 10, 45), new simpleDate(0, 11, 35), formatHolderName[3], 0, formatHolderReserve[3]));
		schedule[7].add(new Appointment(new simpleDate(0, 11, 40), new simpleDate(0, 12, 50), formatHolderName[2], 0, formatHolderReserve[2])); // C Long
		schedule[7].add(new Appointment(new simpleDate(0, 13, 40), new simpleDate(0, 14, 30), formatHolderName[4], 0, formatHolderReserve[4]));
		schedule[7].add(new Appointment(new simpleDate(0, 14, 35), new simpleDate(0, 15, 45), formatHolderName[5], 0, formatHolderReserve[5])); // F Long
		schedule[7].add(new Appointment(new simpleDate(0, 16, 15), new simpleDate(0, 17, 5), formatHolderName[6], 0, formatHolderReserve[6]));
		schedule[7].add(new Appointment(new simpleDate(0, 17, 10), new simpleDate(0, 18, 0), formatHolderName[7], 0, formatHolderReserve[7]));
		
		//Tuesday week two:
		schedule[8].add(new Appointment(new simpleDate(1, 8, 0), new simpleDate(1, 8, 50), formatHolderName[0], 0, formatHolderReserve[0])); //A format 8 am class
		schedule[8].add(new Appointment(new simpleDate(1, 8, 55), new simpleDate(1, 9, 45), formatHolderName[1], 0, formatHolderReserve[1]));
		schedule[8].add(new Appointment(new simpleDate(1, 10, 45), new simpleDate(1, 11, 35), formatHolderName[2], 0, formatHolderReserve[2]));
		schedule[8].add(new Appointment(new simpleDate(1, 11, 40), new simpleDate(1, 12, 50), formatHolderName[3], 0, formatHolderReserve[3])); // D Long
		schedule[8].add(new Appointment(new simpleDate(1, 13, 40), new simpleDate(1, 14, 50), formatHolderName[4], 0, formatHolderReserve[4])); // E Long
		schedule[8].add(new Appointment(new simpleDate(1, 14, 55), new simpleDate(1, 15, 45), formatHolderName[5], 0, formatHolderReserve[5]));
		schedule[8].add(new Appointment(new simpleDate(1, 16, 15), new simpleDate(1, 17, 5), formatHolderName[6], 0, formatHolderReserve[6]));
		schedule[8].add(new Appointment(new simpleDate(1, 17, 10), new simpleDate(1, 18, 0), formatHolderName[7], 0, formatHolderReserve[7])); 
		
		//Wednesday week two:
		schedule[9].add(new Appointment(new simpleDate(2, 8, 0), new simpleDate(2, 8, 50), formatHolderName[3], 0, formatHolderReserve[3]));//D format 8 am class
		schedule[9].add(new Appointment(new simpleDate(2, 8, 55), new simpleDate(2, 9, 45), formatHolderName[0], 0, formatHolderReserve[0]));//A
		schedule[9].add(new Appointment(new simpleDate(2, 11, 05), new simpleDate(2, 11, 55), formatHolderName[5], 0, formatHolderReserve[5]));//F
		schedule[9].add(new Appointment(new simpleDate(2, 12, 0), new simpleDate(2, 12, 50), formatHolderName[7], 0, formatHolderReserve[7]));//H
		
		//Thursday week two:
		schedule[10].add(new Appointment(new simpleDate(3, 8, 0), new simpleDate(3, 8, 50), formatHolderName[3], 0, formatHolderReserve[3]));//D format 8 am class
		schedule[10].add(new Appointment(new simpleDate(3, 8, 55), new simpleDate(3, 9, 45), formatHolderName[2], 0, formatHolderReserve[2])); 
		schedule[10].add(new Appointment(new simpleDate(3, 10, 45), new simpleDate(3, 11, 35), formatHolderName[1], 0, formatHolderReserve[1])); 
		schedule[10].add(new Appointment(new simpleDate(3, 11, 40), new simpleDate(3, 12, 50), formatHolderName[0], 0, formatHolderReserve[0])); // A Long
		schedule[10].add(new Appointment(new simpleDate(3, 13, 40), new simpleDate(3, 14, 30), formatHolderName[4], 0, formatHolderReserve[4]));
		schedule[10].add(new Appointment(new simpleDate(3, 14, 35), new simpleDate(3, 15, 25), formatHolderName[5], 0, formatHolderReserve[5]));
		schedule[10].add(new Appointment(new simpleDate(3, 15, 55), new simpleDate(3, 17, 5), formatHolderName[6], 0, formatHolderReserve[6])); // G Long
		schedule[10].add(new Appointment(new simpleDate(3, 17, 10), new simpleDate(3, 18, 0), formatHolderName[7], 0, formatHolderReserve[7])); 
		
		//Friday week two;
		schedule[11].add(new Appointment(new simpleDate(4, 8, 0), new simpleDate(4, 8, 50), formatHolderName[2], 0, formatHolderReserve[2])); //C format 8 am class
		schedule[11].add(new Appointment(new simpleDate(4, 8, 55), new simpleDate(4, 9, 45), formatHolderName[3], 0, formatHolderReserve[3]));
		schedule[11].add(new Appointment(new simpleDate(4, 10, 45), new simpleDate(4, 11, 35), formatHolderName[0], 0, formatHolderReserve[0])); 
		schedule[11].add(new Appointment(new simpleDate(4, 11, 40), new simpleDate(4, 12, 50), formatHolderName[1], 0, formatHolderReserve[1])); // B Long
		schedule[11].add(new Appointment(new simpleDate(4, 13, 40), new simpleDate(4, 14, 30), formatHolderName[4], 0, formatHolderReserve[4]));
		schedule[11].add(new Appointment(new simpleDate(4, 14, 35), new simpleDate(4, 15, 25), formatHolderName[5], 0, formatHolderReserve[5]));
		schedule[11].add(new Appointment(new simpleDate(4, 15, 55), new simpleDate(4, 16, 45), formatHolderName[6], 0, formatHolderReserve[6])); 
		schedule[11].add(new Appointment(new simpleDate(4, 16, 50), new simpleDate(4, 18, 0), formatHolderName[7], 0, formatHolderReserve[7])); // H Long
		
		System.out.println("Thank you. Your class information has been entered into the schedule");
		
		
	}
	
	public void addAppointment(Appointment a) {
		//check that there are not schedule conflicts with other appointments
		//use a search algorithm to place add the appointment into the schedule in the proper order
	}
	
	public void checkAppointments() {
		Date now = new Date();
		simpleDate tmp;
		Emailer mailer = new Emailer();
		for(int i = 0; i < schedule[now.getDay()-1].size(); i++) {
			tmp = schedule[now.getDay()-1].get(i).getStartTime();
			now = new Date();
			if(now.getHours() == tmp.getHour() && now.getMinutes() == tmp.getMinute() && schedule[now.getDay()-1].get(i).getReminded() == false) {
				mailer.sendEmail(email, schedule[now.getDay()-1].get(i).getName() + " starts now!", "");
				schedule[now.getDay()-1].get(i).setReminded(true);
			}
		}	
	}
	
	public void checkResetReminded() {
		//if(now.)
	}
	
	public String toString() {
		return schedule + "";
	}
	
	
}
