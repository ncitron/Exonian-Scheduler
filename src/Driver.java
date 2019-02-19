//import java.time.DayOfWeek;
import java.util.Date;

public class Driver {

	public static void main(String[] args) {
<<<<<<< HEAD
		Schedule schedule = new Schedule();
		schedule.getSchedule();
		
		//Emailer test = new Emailer();
=======
		Emailer test = new Emailer();
>>>>>>> 059c0e9d8a2ffc76a5dcd63b451c82a5bdcac80c
		//test.sendEmail("noah@jeff.org", "Hopefully this works", "Check 123");
		//System.out.println(DayOfWeek.values());
		//Schedule schedule = new Schedule();
		//schedule.getSchedule();
		
		Date now = new Date();
		System.out.println(now.getDay());
	}

}
