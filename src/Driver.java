import java.util.Scanner;

//Noah
public class Driver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean running = true;
		String ans = "";
		while(running) {
			System.out.println("Would you like to load most recent save? (y/n)");
			ans = input.nextLine();
			if(ans.equals("y") | ans.equals("n")) {
				running = false;
			}
		}
		
		Schedule schedule;
		SaveHandler save = new SaveHandler();
		if(ans.equals("n")) {
			schedule = new Schedule();
			schedule.getSchedule();
			schedule.fillSchedule();
			save.saveSchedule(schedule);
		} else {
			schedule = save.loadSchedule();
			//schedule.fillSchedule();
			System.out.println("Schedule loaded! You will now be receiving email updates!\n" + schedule);
			
		}
			
			
		//main loop
		System.out.println("Type 'a' to add an appontment. Type 'c' to remove one");
		while(true) {
			if(input.nextLine().equals("a")) schedule.addAppointment();
			if(input.nextLine().equals("c")) schedule.cancelAppointment();
			schedule.checkAppointments();
			schedule.checkResetReminded();
			
		}
			
		
		
		/*	
		Emailer e = new Emailer();
		String[] mes;
		while(true) {
			mes = e.getRecentEmail();
			if(mes!=null) {
				for(int i = 0; i<mes.length; i++) {
					System.out.println(mes[i]);
				}
			}
		}*/
	}
}
