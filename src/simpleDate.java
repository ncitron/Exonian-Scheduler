
public class simpleDate {
	private int day;
	private int hour;
	private int minute;
	
	public simpleDate() {
		this.day = 0;
		this.hour = 0;
		this.minute = 0;
	}
	
	public simpleDate(int day, int hour, int minute) {
		this.day = day;
		this.hour = hour;
		this.minute = minute;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int compareTo(simpleDate d) { //Returns the difference in minutes
		return day * 60 * 24 + hour * 60 + minute - (d.getDay() * 60 * 24 + d.getHour() * 60 + d.getMinute());
	}
}
