

public class Driver {

	public static void main(String[] args) {
		//Schedule schedule = new Schedule();
		//schedule.getSchedule();
		//SaveHandler save = new SaveHandler();
		//save.saveSchedule(schedule);
		Emailer e = new Emailer();
		String[] mes;
		
		while(true) {
			mes = e.getRecentEmail();
			if(mes!=null) {
				for(int i = 0; i<mes.length; i++) {
					System.out.println(mes[i]);
				}
			}
		}
		
		//main loop
		//while(true) {
		//	schedule.checkAppointments();
		//	schedule.checkResetReminded();
		//	
		//}
	}
}
