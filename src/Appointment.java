import java.util.Date;

public class Appointment {
	
	private Date startTime;
	private Date endTime;
	private String appName;
	private int appType;
	private boolean useReserve;
	
	public Appointment() {
		Date now = new Date();
		startTime = now; //Current time and date --> probably should be changed
		endTime = now;	// ^^^
		appName = "";
		appType = 0;
		useReserve = false;
	}
	public Appointment(Date theStart, Date theEnd, String theName, int theType, boolean reserve) {
		startTime = theStart;
		endTime = theEnd;
		appName = theName;
		appType = theType;
		useReserve = reserve;
	}
	
	public boolean usesReserve() {
		return useReserve;
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
