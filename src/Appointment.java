import java.util.Date;

public class Appointment implements java.io.Serializable {
	
	private simpleDate startTime;
	private simpleDate endTime;
	private String appName;
	private int appType;
	private boolean useReserve;
	private boolean reminded;
	private boolean reserveToday;
	
	//Peter + Noah
	//Default Constructor
	public Appointment() {
		startTime = new simpleDate(0, 0, 0);
		endTime = new simpleDate(0, 0, 0);
		appName = "";
		appType = 0;
		useReserve = false;
		reminded = false;
		reserveToday = false;
	}
	
	//Peter + Noah
	//Constructor
	public Appointment(simpleDate theStart, simpleDate theEnd, String theName, int theType, boolean reserve, boolean reserveToday) {
		startTime = theStart;
		endTime = theEnd;
		appName = theName;
		appType = theType;
		useReserve = reserve;
		reminded = false;
		this.reserveToday = reserveToday;
	}
	
	//Peter
	//Returns a string with the appointment name
	public String getName() {
		return appName;
	}
	
	//Peter
	//Returns if the class uses the reserve format
	public boolean usesReserve() {
		return useReserve;
	}
	
	//Peter
	//Returns if the class is in reserve today
	public boolean isReserveToday() {
		return reserveToday;
	}
	
	//Peter
	//Returns if the reminder has already been sent for this appointment
	public boolean getReminded() {
		return reminded;
	}
	
	//Noah
	//Sets the reminded variable as either true or false
	public void setReminded(boolean b) {
		reminded = b;
	}
	
	//Noah
	//Gets the start time of the appointment
	public simpleDate getStartTime() {
		return startTime;
	}
	
	//Noah
	//Gets the end time of the appointment
	public simpleDate getEndTime() {
		return endTime;
	}
	
	//Noah
	//gets the appointment type (0 is a class, 1 is a user-defined appointment, 2 is a free format
	public int getType() {
		return appType;
	}
	
	//Peter
	//toString method that returns the start time, end time, the appointment name, and the appointment type
	public String toString() {             
		return startTime.toString() + " " + endTime.toString() + " " + appName + " " + appType;
	}

}
