

public class Driver {

	public static void main(String[] args) {
		Schedule schedule = new Schedule();
		schedule.getSchedule();
		schedule.fillSchedule();
		//schedule.addAppointment();\
		schedule.cancelAppointment();
		
		//main loop
		while(true) {
			schedule.checkAppointments();
			schedule.checkResetReminded();
		}
	}
}
