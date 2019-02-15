import java.util.Date;

public class Appointment {
	
	private Date startTime;
	private Date endTime;
	private String appName;
	private int appType;
	
	public Appointment() {
		Date now = new Date();
		startTime = now; //Current time and date --> probably should be changed
		endTime = now;	// ^^^
		appName = "";
		appType = 0;
	}
	public Appointment(Date theStart, Date theEnd, String theName, int theType) {
		startTime = theStart;
		endTime = theEnd;
		appName = theName;
		appType = theType;
	}
	
	public Date getStartTime() {
		return startTime;
	}
	
	public Date getEndTime() {
		return endTime;
	}
	
	public String toDisplayString() {
		return "";
	}
	
	public String toString() {
		String strType = "" + appType;
		return startTime.toString() + " " + endTime.toString() + " " + appName + " " + strType;
	}

}
