import java.io.*;

//Noah
public class SaveHandler {
	
	SaveHandler() {
		
	}
	
	//this method serializes our the schedule passed to it and saves it in the file test.ser
	public void saveSchedule(Schedule s) {
		try {
			FileOutputStream writer = new FileOutputStream("test.ser");
			writer.close();
			
			FileOutputStream f = new FileOutputStream("test.ser");
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			o.writeObject(s);
			o.close();
			f.close();
			
		}
		catch(Exception e) {
			System.out.println("Save Failed: " + e);
		}
	}
	
	//This method fetches the schedule stored in test.ser and returns it
	public Schedule loadSchedule() {
		try {
			FileInputStream f = new FileInputStream("test.ser");
			ObjectInputStream i = new ObjectInputStream(f);
			
			
			Schedule tmp = (Schedule)i.readObject();
			i.close();
			f.close();
			return tmp;
			
		}
		catch(Exception e) {
			System.out.println("Load Failed : " + e);
			return null;
		}
	}
	
}
