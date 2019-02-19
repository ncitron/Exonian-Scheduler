import java.util.Date;

public class Appointment {
	
	private simpleDate startTime;
	private simpleDate endTime;
	private String appName;
	private int appType;
	private boolean useReserve;
	
	public Appointment() {
		startTime = new simpleDate(0, 0, 0);
		endTime = new simpleDate(0, 0, 0);
		appName = "";
		appType = 0;
		useReserve = false;
	}
	public Appointment(simpleDate theStart, simpleDate theEnd, String theName, int theType, boolean reserve) {
		startTime = theStart;
		endTime = theEnd;
		appName = theName;
		appType = theType;
		useReserve = reserve;
	}
	
	public boolean usesReserve() {
		return useReserve;
	}
	
	public simpleDate getStartTime() {
		return startTime;
	}
	
	public simpleDate getEndTime() {
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
