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
//	WE ALSO NEED TO CHECK IF YOU TYPE "free"
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
	private int week;
	private int[] formatHolderType;
	
	Schedule() {
		this.name = "";
		this.id = numUsers;
		numUsers++;
		schedule = new ArrayList[14];  
		Arrays.setAll(schedule,  ArrayList :: new);
		formatHolderName = new String[8];
		formatHolderReserve = new boolean[8];
		formatHolderType = new int[8];
	}
	
	Schedule(String name) {
		this.name = name;
		this.id = numUsers;
		numUsers++;
		schedule = new ArrayList[14];     
		Arrays.setAll(schedule,  ArrayList :: new);
		formatHolderName = new String[8];
		formatHolderReserve = new boolean[8];
		formatHolderType = new int[8];
	}
	
	public void getSchedule() {
		
		System.out.println("We will now ask you a few questions to set up your schedule");
		System.out.println("What is your email?");
		email = scan.nextLine();
		System.out.println("Is it week 1 or week 2?");
		week = scan.nextInt();
		scan.nextLine();
		
		for(int i = 0; i < 8; i++) {
			System.out.println("What is your " + (char)(65 + i) + " format class? Type \"free\" if this is your free format.");
			formatHolderName[i] = scan.nextLine();
			if(formatHolderName[i].equals("free")) {
				formatHolderType[i] = 2;
			} else {
				formatHolderType[i] = 0;
			}
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
		

//WEEK TWO:	
		//Monday week two:

		schedule[0].add(new Appointment(new simpleDate(0, 8, 0), new simpleDate(0, 8, 50), formatHolderName[0], formatHolderType[0], formatHolderReserve[0], true)); //A format 8 am class
		schedule[0].add(new Appointment(new simpleDate(0, 8, 55), new simpleDate(0, 9, 45), formatHolderName[1], formatHolderType[1], formatHolderReserve[1], false));
		schedule[0].add(new Appointment(new simpleDate(0, 10, 45), new simpleDate(0, 11, 35), formatHolderName[2], formatHolderType[2], formatHolderReserve[2], false));
		schedule[0].add(new Appointment(new simpleDate(0, 11, 40), new simpleDate(0, 12, 50), formatHolderName[3], formatHolderType[3], formatHolderReserve[3], false)); // D Long
		schedule[0].add(new Appointment(new simpleDate(0, 13, 40), new simpleDate(0, 14, 50), formatHolderName[4], formatHolderType[4], formatHolderReserve[4], false)); // E Long
	    schedule[0].add(new Appointment(new simpleDate(0, 4, 55), new simpleDate(0, 15, 45), formatHolderName[5], formatHolderType[5], formatHolderReserve[5], false));
		schedule[0].add(new Appointment(new simpleDate(0, 16, 15), new simpleDate(0, 17, 5), formatHolderName[6], formatHolderType[6], formatHolderReserve[6], false));
		schedule[0].add(new Appointment(new simpleDate(0, 17, 10), new simpleDate(0, 18, 0), formatHolderName[7], formatHolderType[7], formatHolderReserve[7], true)); 
		
		//Tuesday week one:
		schedule[1].add(new Appointment(new simpleDate(1, 8, 0), new simpleDate(1, 8, 50), formatHolderName[1], formatHolderType[1], formatHolderReserve[1], true)); //B format 8 am class
		schedule[1].add(new Appointment(new simpleDate(1, 8, 55), new simpleDate(1, 9, 45), formatHolderName[0], formatHolderType[0], formatHolderReserve[0], false));
		schedule[1].add(new Appointment(new simpleDate(1, 10, 45), new simpleDate(1, 11, 35), formatHolderName[3], formatHolderType[3], formatHolderReserve[3], false));
		schedule[1].add(new Appointment(new simpleDate(1, 11, 40), new simpleDate(1, 12, 50), formatHolderName[2], formatHolderType[2], formatHolderReserve[2], false)); // C Long
		schedule[1].add(new Appointment(new simpleDate(1, 13, 40), new simpleDate(1, 14, 30), formatHolderName[4], formatHolderType[4], formatHolderReserve[4], false));
		schedule[1].add(new Appointment(new simpleDate(1, 14, 35), new simpleDate(1, 15, 45), formatHolderName[5], formatHolderType[5], formatHolderReserve[5], false)); // F Long
		schedule[1].add(new Appointment(new simpleDate(1, 16, 15), new simpleDate(1, 17, 5), formatHolderName[6], formatHolderType[6], formatHolderReserve[6], true));
		schedule[1].add(new Appointment(new simpleDate(1, 17, 10), new simpleDate(1, 18, 0), formatHolderName[7], formatHolderType[7], formatHolderReserve[7], false));
		
		//Wednesday week one:
		schedule[2].add(new Appointment(new simpleDate(2, 8, 0), new simpleDate(2, 8, 50), formatHolderName[2], formatHolderType[2], formatHolderReserve[2], false));//C format 8 am class
		schedule[2].add(new Appointment(new simpleDate(2, 8, 55), new simpleDate(2, 9, 45), formatHolderName[1], formatHolderType[1], formatHolderReserve[1], false));//B
		schedule[2].add(new Appointment(new simpleDate(2, 11, 05), new simpleDate(2, 11, 55), formatHolderName[4], formatHolderType[4], formatHolderReserve[4], false));//E
		schedule[2].add(new Appointment(new simpleDate(2, 12, 0), new simpleDate(2, 12, 50), formatHolderName[6], formatHolderType[6], formatHolderReserve[6], false));//G
		
		//Thursday week one:
		schedule[3].add(new Appointment(new simpleDate(3, 8, 0), new simpleDate(3, 8, 50), formatHolderName[2], formatHolderType[2], formatHolderReserve[2], true)); //C format 8 am class
		schedule[3].add(new Appointment(new simpleDate(3, 8, 55), new simpleDate(3, 9, 45), formatHolderName[3], formatHolderType[3], formatHolderReserve[3], false));
		schedule[3].add(new Appointment(new simpleDate(3, 10, 45), new simpleDate(3, 11, 35), formatHolderName[0], formatHolderType[0], formatHolderReserve[0], false)); 
		schedule[3].add(new Appointment(new simpleDate(3, 11, 40), new simpleDate(3, 12, 50), formatHolderName[1], formatHolderType[1], formatHolderReserve[1], false)); // B Long
		schedule[3].add(new Appointment(new simpleDate(3, 13, 40), new simpleDate(3, 14, 30), formatHolderName[4], formatHolderType[4], formatHolderReserve[4], true));
		schedule[3].add(new Appointment(new simpleDate(3, 14, 35), new simpleDate(3, 15, 25), formatHolderName[5], formatHolderType[5], formatHolderReserve[5], false));
		schedule[3].add(new Appointment(new simpleDate(3, 15, 55), new simpleDate(3, 16, 45), formatHolderName[6], formatHolderType[6], formatHolderReserve[6], false)); 
		schedule[3].add(new Appointment(new simpleDate(3, 16, 50), new simpleDate(3, 18, 0), formatHolderName[7], formatHolderType[7], formatHolderReserve[7], false)); // H Long
		
		//Friday week one:
		schedule[4].add(new Appointment(new simpleDate(4, 8, 0), new simpleDate(4, 8, 50), formatHolderName[3], formatHolderType[3], formatHolderReserve[3], true));//D format 8 am class
		schedule[4].add(new Appointment(new simpleDate(4, 8, 55), new simpleDate(4, 9, 45), formatHolderName[2], formatHolderType[2], formatHolderReserve[2], false)); 
		schedule[4].add(new Appointment(new simpleDate(4, 10, 45), new simpleDate(4, 11, 35), formatHolderName[1], formatHolderType[1], formatHolderReserve[1], false)); 
		schedule[4].add(new Appointment(new simpleDate(4, 11, 40), new simpleDate(4, 12, 50), formatHolderName[0], formatHolderType[0], formatHolderReserve[0], false)); // A Long
		schedule[4].add(new Appointment(new simpleDate(4, 13, 40), new simpleDate(4, 14, 30), formatHolderName[4], formatHolderType[4], formatHolderReserve[4], false));
		schedule[4].add(new Appointment(new simpleDate(4, 14, 35), new simpleDate(4, 15, 25), formatHolderName[5], formatHolderType[5], formatHolderReserve[5], true));
		schedule[4].add(new Appointment(new simpleDate(4, 15, 55), new simpleDate(4, 17, 5), formatHolderName[6], formatHolderType[6], formatHolderReserve[6], false)); // G Long
		schedule[4].add(new Appointment(new simpleDate(4, 17, 10), new simpleDate(4, 18, 0), formatHolderName[7], formatHolderType[7], formatHolderReserve[7], false)); 
		
//WEEK TWO:	
		//Monday week two:
		schedule[7].add(new Appointment(new simpleDate(7, 8, 0), new simpleDate(7, 8, 50), formatHolderName[1], formatHolderType[1], formatHolderReserve[1], true)); //B format 8 am class
		schedule[7].add(new Appointment(new simpleDate(7, 8, 55), new simpleDate(7, 9, 45), formatHolderName[0], formatHolderType[0], formatHolderReserve[0], false));
		schedule[7].add(new Appointment(new simpleDate(7, 10, 45), new simpleDate(7, 11, 35), formatHolderName[3], formatHolderType[3], formatHolderReserve[3], false));
		schedule[7].add(new Appointment(new simpleDate(7, 11, 40), new simpleDate(7, 12, 50), formatHolderName[2], formatHolderType[2], formatHolderReserve[2], false)); // C Long
		schedule[7].add(new Appointment(new simpleDate(7, 13, 40), new simpleDate(7, 14, 30), formatHolderName[4], formatHolderType[4], formatHolderReserve[4], false));
		schedule[7].add(new Appointment(new simpleDate(7, 14, 35), new simpleDate(7, 15, 45), formatHolderName[5], formatHolderType[5], formatHolderReserve[5], false)); // F Long
		schedule[7].add(new Appointment(new simpleDate(7, 16, 15), new simpleDate(7, 17, 5), formatHolderName[6], formatHolderType[6], formatHolderReserve[6], true));
		schedule[7].add(new Appointment(new simpleDate(7, 17, 10), new simpleDate(7, 18, 0), formatHolderName[7], formatHolderType[7], formatHolderReserve[7], false));
		
		//Tuesday week two:
		schedule[8].add(new Appointment(new simpleDate(8, 8, 0), new simpleDate(8, 8, 50), formatHolderName[0], formatHolderType[0], formatHolderReserve[0], true)); //A format 8 am class
		schedule[8].add(new Appointment(new simpleDate(8, 8, 55), new simpleDate(8, 9, 45), formatHolderName[1], formatHolderType[1], formatHolderReserve[1], false));
		schedule[8].add(new Appointment(new simpleDate(8, 10, 45), new simpleDate(8, 11, 35), formatHolderName[2], formatHolderType[2], formatHolderReserve[2], false));
		schedule[8].add(new Appointment(new simpleDate(8, 11, 40), new simpleDate(8, 12, 50), formatHolderName[3], formatHolderType[3], formatHolderReserve[3], false)); // D Long
		schedule[8].add(new Appointment(new simpleDate(8, 13, 40), new simpleDate(8, 14, 50), formatHolderName[4], formatHolderType[4], formatHolderReserve[4], false)); // E Long
		schedule[8].add(new Appointment(new simpleDate(8, 14, 55), new simpleDate(8, 15, 45), formatHolderName[5], formatHolderType[5], formatHolderReserve[5], false));
		schedule[8].add(new Appointment(new simpleDate(8, 16, 15), new simpleDate(8, 17, 5), formatHolderName[6], formatHolderType[6], formatHolderReserve[6], false));
		schedule[8].add(new Appointment(new simpleDate(8, 17, 10), new simpleDate(8, 18, 0), formatHolderName[7], formatHolderType[7], formatHolderReserve[7], true)); 
		
		//Wednesday week two:
		schedule[9].add(new Appointment(new simpleDate(9, 8, 0), new simpleDate(9, 8, 50), formatHolderName[3], formatHolderType[3], formatHolderReserve[3], false));//D format 8 am class
		schedule[9].add(new Appointment(new simpleDate(9, 8, 55), new simpleDate(9, 9, 45), formatHolderName[0], formatHolderType[0], formatHolderReserve[0], false));//A
		schedule[9].add(new Appointment(new simpleDate(9, 11, 05), new simpleDate(9, 11, 55), formatHolderName[5], formatHolderType[5], formatHolderReserve[5], false));//F
		schedule[9].add(new Appointment(new simpleDate(9, 12, 0), new simpleDate(9, 12, 50), formatHolderName[7], formatHolderType[7], formatHolderReserve[7], false));//H
		
		//Thursday week two:
		schedule[10].add(new Appointment(new simpleDate(10, 8, 0), new simpleDate(10, 8, 50), formatHolderName[3], formatHolderType[3], formatHolderReserve[3], true));//D format 8 am class
		schedule[10].add(new Appointment(new simpleDate(10, 8, 55), new simpleDate(10, 9, 45), formatHolderName[2], formatHolderType[2], formatHolderReserve[2], false)); 
		schedule[10].add(new Appointment(new simpleDate(10, 10, 45), new simpleDate(10, 11, 35), formatHolderName[1], formatHolderType[1], formatHolderReserve[1], false)); 
		schedule[10].add(new Appointment(new simpleDate(10, 11, 40), new simpleDate(10, 12, 50), formatHolderName[0], formatHolderType[0], formatHolderReserve[0], false)); // A Long
		schedule[10].add(new Appointment(new simpleDate(10, 13, 40), new simpleDate(10, 14, 30), formatHolderName[4], formatHolderType[4], formatHolderReserve[4], false));
		schedule[10].add(new Appointment(new simpleDate(10, 14, 35), new simpleDate(10, 15, 25), formatHolderName[5], formatHolderType[5], formatHolderReserve[5], true));
		schedule[10].add(new Appointment(new simpleDate(10, 15, 55), new simpleDate(10, 17, 5), formatHolderName[6], formatHolderType[6], formatHolderReserve[6], false)); // G Long
		schedule[10].add(new Appointment(new simpleDate(10, 17, 10), new simpleDate(10, 18, 0), formatHolderName[7], formatHolderType[7], formatHolderReserve[7], false)); 
		
		//Friday week two;
		schedule[11].add(new Appointment(new simpleDate(11, 8, 0), new simpleDate(11, 8, 50), formatHolderName[2], formatHolderType[2], formatHolderReserve[2], true)); //C format 8 am class
		schedule[11].add(new Appointment(new simpleDate(11, 8, 55), new simpleDate(11, 9, 45), formatHolderName[3], formatHolderType[3], formatHolderReserve[3], false));
		schedule[11].add(new Appointment(new simpleDate(11, 10, 45), new simpleDate(11, 11, 35), formatHolderName[0], formatHolderType[0], formatHolderReserve[0], false)); 
		schedule[11].add(new Appointment(new simpleDate(11, 11, 40), new simpleDate(11, 12, 50), formatHolderName[1], formatHolderType[1], formatHolderReserve[1], false)); // B Long
		schedule[11].add(new Appointment(new simpleDate(11, 13, 40), new simpleDate(11, 14, 30), formatHolderName[4], formatHolderType[4], formatHolderReserve[4], true));
		schedule[11].add(new Appointment(new simpleDate(11, 14, 35), new simpleDate(11, 15, 25), formatHolderName[5], formatHolderType[5], formatHolderReserve[5], false));
		schedule[11].add(new Appointment(new simpleDate(11, 15, 55), new simpleDate(11, 16, 45), formatHolderName[6], formatHolderType[6], formatHolderReserve[6], false)); 
		schedule[11].add(new Appointment(new simpleDate(11, 16, 50), new simpleDate(11, 18, 0), formatHolderName[7], formatHolderType[7], formatHolderReserve[7], false)); // H Long
		
		System.out.println("Thank you. Your class information has been successfully entered into the schedule.");
		
	}
	
	public void addAppointment() {
		System.out.println("What is the name of the new appointment?");
		String newName = scan.nextLine();
		System.out.println("What is the day at the start-time of the appointment? Enter an integer 0 - 13, where 0 is Monday week one and 13 is Sunday week two.");
		int newStartDay = scan.nextInt();
		scan.nextLine();
		System.out.println("What is the hour at the start-time of the appointment? Enter an integer 1 - 24, in military time.");
		int newStartHour = scan.nextInt(); 
		scan.nextLine();
		System.out.println("What is the minute at the start-time of the appointment? Enter an integer 1 - 60.");
		int newStartMinute = scan.nextInt();
		scan.nextLine();
		System.out.println("What is the day at the end-time of the appointment? Enter an integer 0 - 13, where 0 is Monday week one and 13 is Sunday week two.");
		int newEndDay = scan.nextInt();
		scan.nextLine();
		System.out.println("What is the hour at the end-time of the appointment? Enter an integer 1 - 24, in military time.");
		int newEndHour = scan.nextInt();
		scan.nextLine();
		System.out.println("What is the minute at the end-time of the appointment? Enter an integer 1 - 60.");
		int newEndMinute = scan.nextInt();
		scan.nextLine();
		simpleDate newStart = new simpleDate(newStartDay, newStartHour, newStartMinute);
		simpleDate newEnd = new simpleDate(newEndDay, newEndHour, newEndMinute);
		
		boolean isFree = true;
		for(int i = 0; i < schedule[newStartDay].size(); i++) {
			if(schedule[newStartDay].get(i).getType() == 0 && newStart.compareTo(schedule[newStartDay].get(i).getStartTime()) > 0 && newStart.compareTo(schedule[newStartDay].get(i).getEndTime()) < 0){ //checks if a new appointment's start is within an already existing appointment
				isFree = false;
			} else if(schedule[newStartDay].get(i).getType() == 0 && newEnd.compareTo(schedule[newStartDay].get(i).getStartTime()) > 0 && newEnd.compareTo(schedule[newStartDay].get(i).getEndTime()) < 0){ //Same, but for the new end time
				isFree = false;
			}
		}
		
		int spotInArrayList = 0;
		if(isFree) {
			for(int i = 0; i < schedule[newStartDay].size(); i++) {
				if(newStart.compareTo(schedule[newStartDay].get(i).getStartTime()) < 0) {
					spotInArrayList = i;
				}
			}
		}
		
		if(!isFree) {
			System.out.println("We are sorry, but this appointment may overlap with another one");
		} else {
			schedule[newStartDay].add(new Appointment(newStart, newEnd, newName, 1, true, true));
			System.out.println("This appointment has been successfully added");
		}
		//check that there are not schedule conflicts with other appointments
		//use a search algorithm to place add the appointment into the schedule in the proper order
	}
	
	public void checkAppointments() {
		Date now = new Date();
		simpleDate tmp;
		ArrayList<Appointment> tmpDay = schedule[(now.getDay()-1) + 7 * (week-1)];
		Emailer mailer = new Emailer();
		for(int i = 0; i < tmpDay.size(); i++) {		
			tmp = tmpDay.get(i).getStartTime();
			now = new Date();
			if(now.getHours() == tmp.getHour() && now.getMinutes() == tmp.getMinute() && tmpDay.get(i).getReminded() == false) {
				if(!(tmpDay.get(i).isReserveToday() == true && tmpDay.get(i).usesReserve() == false)){
					mailer.sendEmail(email, tmpDay.get(i).getName() + " starts now!", "");
					tmpDay.get(i).setReminded(true);
				}
			}
		}
		//reset the week if wk2 Sunday
		if(now.getDay() == 0 && week == 2 && now.getHours() == 23 && now.getMinutes() == 58) {
			week = 1;
		}
	}
	
	public void checkResetReminded() {
		Date now = new Date();
		if(now.getHours() == 23 && now.getMinutes() == 58) {
			for(int i = 0; i < schedule[(now.getDay()-1) + 7 * (week-1)].size(); i++) {
				schedule[(now.getDay()-1) + 7 * (week-1)].get(i).setReminded(false);
			}
		}
	}
	
	public void cancelAppointment() {
		
	}
	
	public String toString() {
		return schedule + "";
	}
}
