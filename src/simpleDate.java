//This class makes us a simple and easy to use date object. We used it because it allowed us to make the day of week 0-13 which would allow us to know if it is week 1 of 2 when scheduling appointments
public class simpleDate implements java.io.Serializable {
	private int day;
	private int hour;
	private int minute;
	
	//Noah
	public simpleDate() {
		this.day = 0;
		this.hour = 0;
		this.minute = 0;
	}
	
	//Noah
	public simpleDate(int day, int hour, int minute) {
		this.day = day;
		this.hour = hour;
		this.minute = minute;
	}
	
	//Noah
	public int getDay() {
		return day;
	}
	
	//Noah
	public int getHour() {
		return hour;
	}
	
	//Noah
	public int getMinute() {
		return minute;
	}
	
	public int getNotifyHour() {
		if(minute < 5) {
			return hour - 1;
		}
		return hour;
	}
	
	public int getNotifyMinute() {
		if(minute < 5) {
			return (minute - 5) + 60;
		}
		return minute - 5;
	}
	
	//Peter
	public int compareTo(simpleDate d) { //Returns the difference in minutes
		return day * 60 * 24 + hour * 60 + minute - (d.getDay() * 60 * 24 + d.getHour() * 60 + d.getMinute());
	}
	
	//Peter
	public String toString() {
		return "" + day + hour + minute;
	}
}
