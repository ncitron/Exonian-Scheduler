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
			System.out.println("Schedule loaded! You will now be receiving email updates!");
			
		}
			
			
		//main loop
		System.out.println("Type 'a' to add an appontment. Type 'c' to remove one");
		while(true) {
			String answer = input.nextLine();
			if(answer.equals("a")) {
				schedule.addAppointment();
				System.out.println("Type 'a' to add an appontment. Type 'c' to remove one");
			}
			if(answer.equals("c")) {
				schedule.cancelAppointment();
				System.out.println("Type 'a' to add an appontment. Type 'c' to remove one");
			}
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
