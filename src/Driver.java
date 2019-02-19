import java.time.DayOfWeek;

public class Driver {

	public static void main(String[] args) {
		Emailer test = new Emailer();
		//test.sendEmail("noah@jeff.org", "Hopefully this works", "Check 123");
		System.out.println(DayOfWeek.values());
		Schedule schedule = new Schedule();
		schedule.getSchedule();
		
		//test.sendEmail("noah@jeff.org", "Hopefully this works", "Check 123");
	}

}
